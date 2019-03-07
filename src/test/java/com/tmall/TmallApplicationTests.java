package com.tmall;

import com.tmall.common.MyException;
import com.tmall.entity.User;
import com.tmall.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TmallApplicationTests {

	@Autowired
	UserService userService;

	@Test
	public void contextLoads() throws MyException {
//		User user = userService.getUserByUserName("向本国1");
//		System.out.println(user);

		User user = new User();
		user.setUsername("向本");
		userService.add(user);
	}

}

