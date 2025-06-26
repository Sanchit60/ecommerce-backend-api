package com.sanchit.ecommerce_api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;
    private String name;
    private double price;
    private String description;
}