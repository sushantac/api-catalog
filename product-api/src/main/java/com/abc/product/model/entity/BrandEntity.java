package com.abc.product.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class BrandEntity {

    @Id
    @GeneratedValue
    private long id;

    private String code;
    private String name;
    private String description;

    public BrandEntity() {
    }

    public BrandEntity(long id, String code, String name, String description) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public BrandEntity setId(long id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return code;
    }

    public BrandEntity setCode(String code) {
        this.code = code;
        return this;
    }

    public String getName() {
        return name;
    }

    public BrandEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BrandEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BrandEntity{");
        sb.append("id=").append(id);
        sb.append(", code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
