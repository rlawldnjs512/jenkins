package com.min.edu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {

	@GetMapping(value = "/")
	public String home(Model model) {
		model.addAttribute("result","안녕하세요 CI/CD 교육중 입니다. 1탄");
		return "home";
	}
	
}
