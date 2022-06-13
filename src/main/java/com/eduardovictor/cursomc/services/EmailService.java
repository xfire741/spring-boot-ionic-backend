package com.eduardovictor.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.eduardovictor.cursomc.domain.Pedido;


public interface EmailService {
	
	void sendOrderConfirmationsEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
