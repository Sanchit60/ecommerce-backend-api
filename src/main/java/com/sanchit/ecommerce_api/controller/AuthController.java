package com.sanchit.ecommerce_api.controller;
import com.sanchit.ecommerce_api.util.ApiResponse;

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
    public ResponseEntity<ApiResponse<String>> register(@RequestBody RegisterRequest request) {
        authService.register(request);
        ApiResponse<String> response = new ApiResponse<>(
                "SUCCESS",
                "User registered successfully",
                null
        );
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<AuthResponse>> login(@RequestBody LoginRequest request) {
        AuthResponse authResponse = authService.login(request);
        ApiResponse<AuthResponse> response = new ApiResponse<>(
                "SUCCESS",
                "User logged in successfully",
                authResponse
        );
        return ResponseEntity.ok(response);
    }
}