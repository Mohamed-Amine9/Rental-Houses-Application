package com.javatechie.spring.paypal.api;

import com.example.demo.Entity.Houses.HouseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="payment")
public class Order {
	private double price;
	private String currency;
	private String method;
	private String intent;
	private String description;

}
