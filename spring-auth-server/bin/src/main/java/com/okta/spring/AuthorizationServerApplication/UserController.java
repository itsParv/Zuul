package com.okta.spring.AuthorizationServerApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @GetMapping("/book/me")
    public Principal user(Principal principal) {
        return principal;
    }
}