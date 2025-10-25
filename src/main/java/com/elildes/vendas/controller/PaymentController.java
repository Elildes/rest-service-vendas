package com.elildes.vendas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.elildes.vendas.service.PaymentServiceInterface;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentServiceInterface paymentservice;
	
	@GetMapping
    @NewSpan("rest-feign-vendas")
	@CircuitBreaker(name="payment", fallbackMethod = "buildFallbackGetData")
	@Retry(name="retryPaymentService", fallbackMethod = "retryFallbackGetData")
	@Bulkhead(name = "bulkheadpayment", type = Bulkhead.Type.SEMAPHORE, fallbackMethod = "buildFallbackGetData")
	public ResponseEntity getdata() {
		return ResponseEntity.ok(paymentservice.getData());
	}
	
	public ResponseEntity<String> buildFallbackGetData(Throwable t){
	       return ResponseEntity.ok("Fallbak in action! " + t.getMessage());
	}
	 
	public ResponseEntity<String> retryFallbackGetData(Throwable t){
	        return ResponseEntity.ok("Fallbak in action for retry! " + t.getMessage());
	}
	 
}
