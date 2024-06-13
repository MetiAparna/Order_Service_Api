package com.ass.order_service.service.imp;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ass.order_service.dto.OrderDto;
import com.ass.order_service.entity.OrderEntity;
import com.ass.order_service.service.OrderService;

@Service
public class OrderServiceImp implements OrderService
{
	@Autowired
	private RestTemplate restTemlate;

	@Override
	public String placeOrder(OrderDto orderDto) {
		
		OrderEntity orderEntity = new OrderEntity();
		
		orderEntity.setProduct_id(orderDto.getProduct_id());
		orderEntity.setPayment_mode(orderDto.getPayment_mode());
		orderEntity.setQuantity(orderDto.getQuantity());
		orderEntity.setSold_date(new Date());
		orderEntity.setTotal_price(0);
		 
         StringBuilder stringBuilder = new StringBuilder();
         stringBuilder.append("http://localhost:8080/product_api/findProductPriceById/2");
         //stringBuilder.append(orderDto.getProduct_id());

         Double ProductPrice = restTemlate.getForObject(stringBuilder.toString(),Double.class );
         System.out.println("productprice= "+ProductPrice);
         // orderEntity.setTotal_price((ProductPrice* 10));

        orderEntity.setTotal_price((ProductPrice* orderEntity.getQuantity()));
         System.out.println(orderDto);
         
         return "Order Placed Sussessfully";
		
	}

	

}
