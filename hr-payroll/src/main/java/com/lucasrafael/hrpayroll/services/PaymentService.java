package com.lucasrafael.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasrafael.hrpayroll.entities.Payment;
import com.lucasrafael.hrpayroll.entities.Worker;
import com.lucasrafael.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient WorkerFeignClient;
	
	public Payment getPayment(long workerId, int days) {				
		Worker worker = WorkerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
