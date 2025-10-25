package com.elildes.vendas.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-payment")
public interface PaymentServiceInterface {

	@RequestMapping(method = RequestMethod.GET, value="/payment", consumes = "application/json") String getData();

}
