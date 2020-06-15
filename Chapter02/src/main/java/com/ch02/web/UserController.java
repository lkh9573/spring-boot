package com.ch02.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller// 브라우저로 부터 요청을 받은것에대한 진입점 선언
public class UserController {
	private List<User> users = new ArrayList<User>();
	@PostMapping("/create")//form에서 보낸 데이터를 받음
	public String create(User user) { //
		System.out.println(user);
		users.add(user);
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("users", users);
		return "list";
	}
}
