package com.app.amazon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/profiles")
public class ProfileController {
    // user can retrieve its own profile
    @GetMapping("/{userId}")
    public void retrieveUserProfile() {

    }

    // user can update its own profile
    public void updateProfile() {

    }
}
