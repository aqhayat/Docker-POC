package com.notification.comnotificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ComNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComNotificationServiceApplication.class, args);
	}

	@GetMapping("/")
	public String getNotification(){
		return "Notification got";
	}
}

