package com.lambda.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.lambda.model.Product;

@Repository
public class ProductDao {

	public List<Product> productDetails(){
		return Stream.of(
				new Product(501, "Laptop", "Electronics",30000, 5),
				new Product(502,"Mobile","Electronics",1000,8),
				new Product(503,"Book","stationery",400,3),
				new Product(504,"Table","furniture",5000,9)
				).collect(Collectors.toList());
				
	}
}

