package com.Api.InforPases.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String getAllDatas() {
		String url = "https://restcountries.com/v3.1/all?fields=name,capital,flags";
		ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
		return forEntity.getBody();
	}

}
