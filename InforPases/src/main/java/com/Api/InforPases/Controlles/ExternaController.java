package com.Api.InforPases.Controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Api.InforPases.Services.ApiService;

@RestController
@RequestMapping("/api/v1external")
public class ExternaController {
	
	@Autowired
	private ApiService apiService;
	
	@GetMapping()
	public ResponseEntity<String> getAllDatas(){
		String allDatas = apiService.getAllDatas();
		return ResponseEntity.ok(allDatas);
	}

}
