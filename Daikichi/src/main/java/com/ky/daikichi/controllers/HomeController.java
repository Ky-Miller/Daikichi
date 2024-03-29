package com.ky.daikichi.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String welcome() {
		return "Welcome";
	}
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors";
	}

	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}

    @RequestMapping("/travel/{city}")
    public String travel(@PathVariable("city") String city){
    	return "Congratulations! You will soon travel to " + city;
    }
    
    @RequestMapping("/lotto/{lotto}")
    public String lotto(@PathVariable("lotto") Integer lotto){
    	if(lotto % 2 == 0) {
    		return "You will take a grand journy in the near future, but be wary of tempting offers...";
    	}
    	return "you have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    }
    
}
