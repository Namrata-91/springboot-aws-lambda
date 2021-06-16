package com.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.lambda.model.Product;
import com.lambda.repository.ProductDao;

@SpringBootApplication
public class ProductDetailsApplication {

	@Autowired
	private ProductDao productDao;
	
	@Bean
	public Supplier<List<Product>> product(){
		return ()->productDao.productDetails();
	}
	
	@Bean
	public Function<String,List<Product>> findproductbyCategories(){
		return (input) -> productDao.productDetails().stream().filter(product-> product.getCategories().equals(input)).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		SpringApplication.run(ProductDetailsApplication.class, args);
	}

}
