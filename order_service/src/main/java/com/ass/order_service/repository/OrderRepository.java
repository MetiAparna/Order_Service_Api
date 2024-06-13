package com.ass.order_service.repository;

import com.ass.order_service.entity.OrderEntity;

public interface OrderRepository {
	
	public void saveOrder(OrderEntity orderEntity);

}
