package com.globallogic.creditcardpayment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.creditcardpayment.entity.Payment;
import com.globallogic.creditcardpayment.entity.Transaction;
import com.globallogic.creditcardpayment.services.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	TransactionService transactionService;

	@GetMapping("/showAllTransactions")
	public List<Transaction> showTransaction() {
		return transactionService.showTransaction();
	}
	
	@GetMapping("/showTransactionById/{transactionid}")
	public Transaction showTransactionById(@PathVariable("transactionid") long id) {
		return transactionService.showTransactionDetails(id);
	}
	
	@GetMapping("/showallTransactions/customerId/{custId}")
	public String showAllTransactionByCustomerId(@PathVariable("custId") long custId) {
		return transactionService.showAllTranscationsForCustomerId(custId);
	}

	@PostMapping("/addTransaction")
	public String addTransaction(@RequestBody Transaction transaction) {
		return transactionService.addTransaction(transaction);
	}

	@PutMapping("/updateTransaction")
	public String updateTransaction(@RequestBody Transaction transaction) {
		return transactionService.updateTransaction(transaction);
	}

	@DeleteMapping("/deleteTransactionById/{id}")
	public String deleteTransaction(@PathVariable("id") long id) {
		return transactionService.deleteTransaction(id);
	}

}
