package com.ch02.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomController {
	@GetMapping("/helloworld")//브라우저에서 웹서버에 요청을 보낼때 get요청 할 때 사용
	public String welcome(String name, Model model) {
		// TODO Auto-generated method stub
		System.out.println("name :"+ name);
		model.addAttribute("name", name);
		return "welcome";
	}
	//반환값은 templates 디렉 밑에 파일을 호출
	//반환 스트링이 자동(스프링에서) string.html 파일을 호출
}
