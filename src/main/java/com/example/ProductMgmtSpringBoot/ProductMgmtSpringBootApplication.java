package com.example.ProductMgmtSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductMgmtSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductMgmtSpringBootApplication.class, args);

		ProductService service = context.getBean(ProductService.class);
//		for (Product p: service.getAllProducts()) {
//			System.out.println(p);
//		}
		service.addProduct(new Product("Hawai","Chappal","Floor",2024));

	}


}
