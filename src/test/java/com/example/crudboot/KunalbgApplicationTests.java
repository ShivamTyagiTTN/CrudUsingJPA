package com.example.crudboot;

import com.example.crudboot.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KunalbgApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	UserService userService;

	@Test
	void createUser(){
		userService.createUser("Kunal BG");
	}

}
