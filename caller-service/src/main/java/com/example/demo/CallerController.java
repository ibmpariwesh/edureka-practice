package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
//@slf4j
@RequestMapping("/api")
public class CallerController {
	private static final String URL = "http://localhost:8081/user";
	@Autowired
	RestTemplate restTemplate;
	@GetMapping("/callotherservice")
	void getUserFromOtherservice() {
		ResponseEntity<List> responseEntity = restTemplate.getForEntity(URL, List.class);
//		(responseEntity.getStatusCodeValue());
		System.out.println(responseEntity.getBody());
	}
	@PostMapping("/createUser")
	private void sendPostRequestToUserService(@RequestBody User user) {
//		User user =  new User();
//		user.setName("user1");
//		user.setAge(10);
		restTemplate.postForEntity(URL, user, String.class);
	}
	
//	delete
//	update
}
