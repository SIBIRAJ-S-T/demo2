package com.example.demo.Entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.UserEntity;

@RestController
public class UserController {
	@GetMapping("/marks")
	public UserEntity getMarks() {
		UserEntity ue = new UserEntity(10, 20, 30);
		return ue;
	}
	@GetMapping("/marksAll")
	public List<UserEntity> getMarksAll() {
		List<UserEntity> ue = new ArrayList<>();
		ue.add(new UserEntity(80, 90, 100));
		ue.add(new UserEntity(40, 50, 60));
		ue.add(new UserEntity(50, 60, 70));
		return ue;
	}
}