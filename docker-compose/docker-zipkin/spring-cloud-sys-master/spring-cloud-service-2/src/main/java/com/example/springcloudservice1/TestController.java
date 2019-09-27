package com.example.springcloudservice1;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller

public class TestController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("test")
	public @ResponseBody Object test() {
		return Collections.EMPTY_MAP;
	}
	
	
}
