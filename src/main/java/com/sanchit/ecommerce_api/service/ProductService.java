package com.sanchit.ecommerce_api.service;

import com.sanchit.ecommerce_api.dto.ProductDto;
import com.sanchit.ecommerce_api.model.Product;
import com.sanchit.ecommerce_api.repository.ProductRepository;
import com.sanchit.ecommerce_api.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public Product addProduct(ProductDto dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setDescription(dto.getDescription());
        return productRepo.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product updateProduct(Long id, ProductDto dto) {
        Product existing = productRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
        existing.setName(dto.getName());
        existing.setPrice(dto.getPrice());
        existing.setDescription(dto.getDescription());
        return productRepo.save(existing);
    }

    public void deleteProduct(Long id) {
        if (!productRepo.existsById(id)) {
            throw new ResourceNotFoundException("Product", "id", id);
        }
        productRepo.deleteById(id);
    }
}