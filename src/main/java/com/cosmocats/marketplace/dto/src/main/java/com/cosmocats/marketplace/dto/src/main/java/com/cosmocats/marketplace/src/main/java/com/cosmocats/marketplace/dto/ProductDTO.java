package com.cosmocats.marketplace.dto;

import com.cosmocats.marketplace.validation.CosmicWordCheck;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class ProductDTO {

    @NotNull(message = "Product name must not be null")
    @Size(min = 3, message = "Product name must be at least 3 characters long")
    @CosmicWordCheck
    private String name;

    @NotNull(message = "Price must not be null")
    @DecimalMin(value = "0.01", message = "Price must be greater than 0")
    private BigDecimal price;

    private String description;

    public ProductDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
