package com.ass.order_service.dto;

import java.io.Serializable;

public class OrderDto implements Serializable {
	
	private long Product_id;
	
	private Integer quantity;
	
	private String payment_mode;
	
	
	public OrderDto()
	{
		System.out.println(this.getClass().getSimpleName()+"create the object");
	}

	public long getProduct_id() {
		return Product_id;
	}

	public void setProduct_id(long product_id) {
		Product_id = product_id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	@Override
	public String toString() {
		return "OrderDto [Product_id=" + Product_id + ", quantity=" + quantity + ", payment_mode=" + payment_mode + "]";
	}
	

}