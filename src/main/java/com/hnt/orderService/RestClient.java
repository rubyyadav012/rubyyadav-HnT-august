package com.hnt.orderService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClient {

	private static final String URL="http://localhost:8081/user";
     
	public static void main(String[]args) {
		
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<String> response=restTemplate.getForEntity(URL, String.class);
	      System.out.println(response.getStatusCode());
	      System.out.println(response.getBody());
	}

}


