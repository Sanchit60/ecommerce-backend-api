package com.sanchit.ecommerce_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductDto {

    @NotBlank(message = "Product name is required")
    private String name;

    @Positive(message = "Price must be positive")
    private double price;

    @NotBlank(message = "Description is required")
    private String description;

    // Getters and Setters



}