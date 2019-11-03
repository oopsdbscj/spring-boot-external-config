package com.example.demoJ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.interfaces.PBEKey;
import java.util.Collections;

@SpringBootApplication
public class DemoJApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJApplication.class, args);
	}

}

@RestController
class H {
	@RequestMapping("/")
	public Object ff() {
		return Collections.singletonMap(111,22);
	}
}
