package com.buyerservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buyerservice.entity.Product;

@RestController
public class BuyerController {

	@GetMapping("displayAll")
	public List<Product> getAllproduct() {
		List<Product> ll = new ArrayList<Product>();
		Product p1= new Product();
		p1.setP_id("1");
		p1.setP_name("Aman");
		p1.setP_specification("Java");
		Product p2 = new Product();
		p2.setP_id("2");
		p2.setP_name("Irfan");
		p2.setP_specification("Embedded");
		
		ll.add(p1);
		ll.add(p2);
		return ll ;
		
	}
}
