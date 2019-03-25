package com.intermine.security.interminespringsecurityauthserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/rest/test")
public class TestResource {
    @GetMapping("/principal")
    public Principal user(Principal principal){
        return principal;
    }
    @GetMapping
    public String test() {
        return "Hello, Welcome in Intermine";
    }
}
