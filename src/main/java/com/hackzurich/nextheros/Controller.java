package com.hackzurich.nextheros;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/test")
    public String test() {
        return "ok";
    }
}
