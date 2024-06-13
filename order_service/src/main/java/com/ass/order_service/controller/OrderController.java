package com.ass.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ass.order_service.dto.OrderDto;
import com.ass.order_service.service.imp.OrderServiceImp;

@RestController
public class OrderController {
	@Autowired
	private OrderServiceImp orderServiceImp;
	
	public void processeOrder(OrderDto orderDto) {
		
	}
	@PostMapping(value="/initiateOrder")
	public @ResponseBody  String initiateOrder(@RequestBody OrderDto orderDto)
	{
		return orderServiceImp.placeOrder(orderDto);
		
	}
	
	public OrderController()
	{
		System.out.println(this.getClass().getSimpleName() +"  class  Object is created");
		
	}
}
