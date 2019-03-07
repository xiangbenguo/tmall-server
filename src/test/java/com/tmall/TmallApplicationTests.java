package com.tmall;

import com.tmall.entity.Product;
import com.tmall.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TmallApplicationTests {

	@Autowired
	ProductService productService;

	@Test
	public void contextLoads() {
		Product product = productService.get(1);
		System.out.println(product.getId());
		System.out.println(product.getPrice());
		System.out.println(product.getStock());
		System.out.println(product.getCid());
	}

}

