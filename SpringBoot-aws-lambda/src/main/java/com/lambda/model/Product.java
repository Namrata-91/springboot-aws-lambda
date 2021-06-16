package com.lambda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private int id;
	private String name;
	private String categories;
	private double price;
	private int totalStocks;
}
