package com.sanchit.ecommerce_api.controller;

import com.sanchit.ecommerce_api.dto.ProductDto;
import com.sanchit.ecommerce_api.model.Product;
import com.sanchit.ecommerce_api.util.ApiResponse;
import com.sanchit.ecommerce_api.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<ApiResponse<Product>> addProduct(@Valid @RequestBody ProductDto dto) {
        Product created = productService.addProduct(dto);
        return ResponseEntity.ok(new ApiResponse<>("SUCCESS", "Product added", created));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<Product>>> getAllProducts() {
        List<Product> all = productService.getAllProducts();
        return ResponseEntity.ok(new ApiResponse<>("SUCCESS", "All products", all));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<Product>> update(@PathVariable Long id, @Valid @RequestBody ProductDto dto) {
        Product updated = productService.updateProduct(id, dto);
        return ResponseEntity.ok(new ApiResponse<>("SUCCESS", "Product updated", updated));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<String>> delete(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok(new ApiResponse<>("SUCCESS", "Product deleted", null));
    }
}