package org.id.inventoryservice;

import org.id.inventoryservice.entities.Product;
import org.id.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository ){
		return args -> {
			productRepository.save(new Product(null, "Computer HP 12",700));
			productRepository.save(new Product(null, "Printer EPSON",250));
			productRepository.save(new Product(null, "Iphone 13",1100));
		};
	}

}
