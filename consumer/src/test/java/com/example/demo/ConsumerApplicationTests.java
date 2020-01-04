package com.example.demo;

import com.example.demo.userService.OrderService;
import com.example.demo.userService.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ConsumerApplicationTests {

	@Autowired
	UserService userService;

	@Autowired
	OrderService orderService;

	@Test
	void contextLoads() {
		userService.hello();
	}

	@Test
	void test01(){
		orderService.haha();
		userService.hello();
	}

}
