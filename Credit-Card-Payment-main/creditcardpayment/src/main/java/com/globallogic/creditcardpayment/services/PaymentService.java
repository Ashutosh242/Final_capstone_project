package com.globallogic.creditcardpayment.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.creditcardpayment.entity.Admin;
import com.globallogic.creditcardpayment.entity.Payment;

@Service
public interface PaymentService {

	// GET ->SHOW ALL PAYMENT
	public List<Payment> showPayment();
	
	// GET ->SHOW PAYMENT BY ID
	public Payment showPaymentById(long id);

	// POST -> ADD PAYMENT
	public String addPayment(Payment payment);

	// PUT ->UPDATE PAYMENT
	public String updatePayment(Payment payment);

	// DELETE ->DELETE PAYMENT
	public String deletePayment(long id);

	

}
