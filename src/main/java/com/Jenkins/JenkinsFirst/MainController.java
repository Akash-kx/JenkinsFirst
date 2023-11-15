package com.Jenkins.JenkinsFirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/Home")
	public String getHome() {
		
		return "Hi Akash get Home and sleep";
	}
}
