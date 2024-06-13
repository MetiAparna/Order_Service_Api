package com.ass.order_service.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="order_info")
public class OrderEntity implements Serializable{
	
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="alt_key")
	private long alt_key;
	
	@Column(name="Product_id")
	private long Product_id;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name="total_price")
	private double total_price;
	
	@Column(name="payment_mode")
	private String payment_mode;
	@Column(name="sold_date")
	private Date sold_date;
	
	public OrderEntity()
	{
		System.out.println(this.getClass().getSimpleName()+" Object is Created");
	}

	@Override
	public String toString() {
		return "OrderEntity [alt_key=" + alt_key + ", Product_id=" + Product_id + ", quantity=" + quantity
				+ ", total_price=" + total_price + ", payment_mode=" + payment_mode + ", sold_date=" + sold_date + "]";
	}

	public long getAlt_key() {
		return alt_key;
	}

	public void setAlt_key(long alt_key) {
		this.alt_key = alt_key;
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

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double d) {
		this.total_price = d;
	}

	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public Date getSold_date() {
		return sold_date;
	}

	public void setSold_date(Date sold_date) {
		this.sold_date = sold_date;
	}

}
