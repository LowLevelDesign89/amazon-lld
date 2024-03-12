package com.app.amazon.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
public class UserAdminController {
    @PutMapping
    public void blockOrUnblockAccount() {

    }
}
