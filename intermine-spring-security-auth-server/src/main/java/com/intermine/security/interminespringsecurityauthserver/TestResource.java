package com.intermine.security.interminespringsecurityauthserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/test")
public class TestResource {
    @GetMapping
    public String test() {
        return "Hello, Welcome in Intermine";
    }
}
