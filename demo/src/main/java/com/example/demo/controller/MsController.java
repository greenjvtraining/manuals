package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ms")
public class MsController {

	@RequestMapping("/main")
	public @ResponseBody String main() {
		return "Let's go Ms~~";
	}
}
