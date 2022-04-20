package com.sunflower.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.sunflower.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("bob", 60.0, days);
	}

}
