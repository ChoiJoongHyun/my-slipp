package net.slipp.web;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ApiUserControllerTest {

	@Autowired
	private TestRestTemplate restTemplate;
	
	
	@Test
	public void crud() {
		ResponseEntity<String> result = restTemplate.getForEntity("/api/users/1", String.class);
		System.out.println("result " + result.getBody());
	}

}
