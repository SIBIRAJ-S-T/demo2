package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2 {
	@RequestMapping("/one")
	public int One() {
		return 1;
	}
	@RequestMapping("/two")
	public int Two() {
		return 2;
	}
	@RequestMapping("/three")
	public int Three() {
		return 3;
	}
}