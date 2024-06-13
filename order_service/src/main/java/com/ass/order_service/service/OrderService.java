package com.ass.order_service.service;

import com.ass.order_service.dto.OrderDto;


public interface OrderService {
	

	public String placeOrder(OrderDto orderDto);

}
