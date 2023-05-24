package com.fullstack.springreact.controller;



import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import com.fullstack.springreact.service.ProductService;

@WebMvcTest(ProductController.class)
public class ProductControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	ProductService productService;
	
	
	@Test
	public void getAllProductsList(){
		
		RequestBuilder request = MockMvcRequestBuilders
				.get("/get-all-products").accept(MediaType.APPLICATION_JSON);
		
	
	try {
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk()).andExpect(content().json("[{\"productId\":1,\"productType\":\"Shirt\",\"price\":1000,\"description\":\"Slim Fit, Cotton Polyster Blend\",\"cashBack\":100},{\"productId\":2,\"productType\":\"Shirt\",\"price\":2000,\"description\":\"Regular Fit, Linen\",\"cashBack\":150},{\"productId\":3,\"productType\":\"Shirt\",\"price\":1300,\"description\":\"Oversized Fit, Pure Cotton\",\"cashBack\":100},{\"productId\":4,\"productType\":\"T-Shirt\",\"price\":800,\"description\":\"Oversized Fit, Cotton Blend\",\"cashBack\":80},{\"productId\":5,\"productType\":\"T-Shirt\",\"price\":600,\"description\":\"Regular Fit, PureCotton\",\"cashBack\":80},{\"productId\":6,\"productType\":\"Joggers\",\"price\":1400,\"description\":\"Slim Fit, Polyster\",\"cashBack\":100},{\"productId\":7,\"productType\":\"Joggers\",\"price\":1800,\"description\":\"Relaxed Fit, Cotten Blend\",\"cashBack\":180},{\"productId\":8,\"productType\":\"Formal Pant\",\"price\":2200,\"description\":\"Regular Fit, Cotton \",\"cashBack\":100},{\"productId\":9,\"productType\":\"Chinos\",\"price\":1200,\"description\":\"Slim Fit, Cotton\",\"cashBack\":100}]"))
				.andReturn();
	} catch (Exception e) {
		e.printStackTrace();
	}

	}

}
