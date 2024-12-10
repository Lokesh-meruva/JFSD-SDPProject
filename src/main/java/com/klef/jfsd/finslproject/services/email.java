package com.klef.jfsd.finslproject.services;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class email {
	 private final JavaMailSender mailSender;

	    public email(JavaMailSender mailSender) {
	        this.mailSender = mailSender;
	    }

	    public void sendEmail(String to, String subject, String message) {
	        SimpleMailMessage mailMessage = new SimpleMailMessage();
	        mailMessage.setTo(to);
	        mailMessage.setSubject(subject);
	        mailMessage.setText(message);
	        mailSender.send(mailMessage);
	    }

}
