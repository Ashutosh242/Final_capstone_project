package com.globallogic.creditcardpayment.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.creditcardpayment.entity.Payment;
import com.globallogic.creditcardpayment.exceptionHandling.GlobalException;
import com.globallogic.creditcardpayment.repositories.PaymentRepo;
import com.globallogic.creditcardpayment.services.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentRepo paymentRepo;

	@Override
	public List<Payment> showPayment() {
		return paymentRepo.findAll();
	}

	@Override
	public Payment showPaymentById(long id) {
		return paymentRepo.findById(id).get();
	}
	
	@Override
	public String addPayment(Payment payment) {
		paymentRepo.save(payment);
		return "PAYMENT DONE SUCCESSFULLY";
	}

	@Override
	public String updatePayment(Payment payment) {
		if(paymentRepo.findById(payment.getPaymentid()).get() == null) {
			throw new GlobalException();
		}
		paymentRepo.save(payment);
		return "PAYMENT UPDATED SUCCESSFULLY";
	}

	@Override
	public String deletePayment(long id) {
		if(paymentRepo.findById(id).get() == null) {
			throw new GlobalException();
		}
		paymentRepo.deleteById(id);
		return "PAYMENT DELETED SUCCESSFULLY";
	}



}
