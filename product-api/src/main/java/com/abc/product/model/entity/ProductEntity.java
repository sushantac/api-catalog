package com.abc.product.model.entity;

import jakarta.persistence.*;

@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String typeCode;
    private String name;
    private String description;
    private Double price;
    private String currency;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private CategoryEntity category;

    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false)
    private BrandEntity brand;

    public ProductEntity() {
    }

    public ProductEntity(Long id,
                         String typeCode,
                         String name,
                         String description,
                         Double price,
                         String currency,
                         CategoryEntity category,
                         BrandEntity brand) {
        this.id = id;
        this.typeCode = typeCode;
        this.name = name;
        this.description = description;
        this.price = price;
        this.currency = currency;
        this.category = category;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public ProductEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public ProductEntity setTypeCode(String typeCode) {
        this.typeCode = typeCode;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProductEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ProductEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ProductEntity setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public ProductEntity setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public ProductEntity setCategory(CategoryEntity category) {
        this.category = category;
        return this;
    }

    public BrandEntity getBrand() {
        return brand;
    }

    public ProductEntity setBrand(BrandEntity brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductEntity{");
        sb.append("id=").append(id);
        sb.append(", typeCode='").append(typeCode).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", category=").append(category);
        sb.append(", brand=").append(brand);
        sb.append('}');
        return sb.toString();
    }

}
