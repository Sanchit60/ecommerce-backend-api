package com.sanchit.ecommerce_api.controller;

import com.sanchit.ecommerce_api.dto.AuthResponse;
import com.sanchit.ecommerce_api.dto.LoginRequest;
import com.sanchit.ecommerce_api.dto.RegisterRequest;
import com.sanchit.ecommerce_api.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }
}