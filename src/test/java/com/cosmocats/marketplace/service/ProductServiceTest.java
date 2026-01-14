package com.cosmocats.marketplace.service;

import com.cosmocats.marketplace.domain.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    private ProductService productService;

    @BeforeEach
    void setUp() {
        productService = new ProductService();
    }

    @Test
    void shouldCreateProduct() {
        Product product = new Product();
        product.setName("galaxy milk");
        product.setPrice(BigDecimal.valueOf(10));

        Product created = productService.create(product);

        assertNotNull(created.getId());
        assertEquals("galaxy milk", created.getName());
    }

    @Test
    void shouldReturnAllProducts() {
        productService.create(testProduct("star yarn"));
        productService.create(testProduct("comet toy"));

        List<Product> products = productService.findAll();

        assertEquals(2, products.size());
    }

    @Test
    void shouldFindProductById() {
        Product created = productService.create(testProduct("galaxy box"));

        Optional<Product> found = productService.findById(created.getId());

        assertTrue(found.isPresent());
        assertEquals(created.getId(), found.get().getId());
    }

    @Test
    void shouldUpdateProduct() {
        Product created = productService.create(testProduct("star item"));

        Product updated = new Product();
        updated.setName("star item updated");
        updated.setPrice(BigDecimal.valueOf(20));

        Product result = productService.update(created.getId(), updated);

        assertEquals("star item updated", result.getName());
        assertEquals(BigDecimal.valueOf(20), result.getPrice());
    }

    @Test
    void shouldDeleteProduct() {
        Product created = productService.create(testProduct("comet ball"));

        productService.delete(created.getId());

        Optional<Product> result = productService.findById(created.getId());
        assertTrue(result.isEmpty());
    }

    private Product testProduct(String name) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(BigDecimal.valueOf(5));
        return product;
    }
}
