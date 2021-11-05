package br.org.serratec.backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class MailConfig {

    @Autowired
    private JavaMailSender javaMailSender;

    public void enviarEmail(String destino, String assunto, String texto) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("michael.freitas@estudante.firjan.senai.br");
        simpleMailMessage.setTo(destino);
        simpleMailMessage.setSubject(assunto);
        simpleMailMessage.setText("Dados da inscrição do usuário" + "\n\n\n\n Serratec Residência - 2021 \n" + texto);
        javaMailSender.send(simpleMailMessage);
    }
    
}
