package com.heroku.test.Heroku.App;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wojciech Wasilewski
 * @date Created on 22.07.2019
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Naapadam NaBang";
    }
}
