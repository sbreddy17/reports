package com.drucare;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportsController {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Ocyopus deploy!";
	}

}
