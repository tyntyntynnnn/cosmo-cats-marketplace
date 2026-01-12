package com.cosmocats.marketplace.service;

import com.cosmocats.marketplace.domain.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    private final Map<String, Product> storage = new HashMap<>();

    public Product create(Product product) {
        String id = UUID.randomUUID().toString();
        product.setId(id);
        storage.put(id, product);
        return product;
    }

    public List<Product> findAll() {
        return new ArrayList<>(storage.values());
    }

    public Optional<Product> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    public Product update(String id, Product updated) {
        updated.setId(id);
        storage.put(id, updated);
        return updated;
    }

    public void delete(String id) {
        storage.remove(id);
    }
}
