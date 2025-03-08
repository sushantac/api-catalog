package com.abc.product.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String typeCode;
    String name;
    String description;

    public CategoryEntity() {
    }

    public CategoryEntity(long id, String typeCode, String name, String description) {
        this.id = id;
        this.typeCode = typeCode;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public CategoryEntity setId(long id) {
        this.id = id;
        return this;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public CategoryEntity setTypeCode(String typeCode) {
        this.typeCode = typeCode;
        return this;
    }

    public String getName() {
        return name;
    }

    public CategoryEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CategoryEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CategoryEntity{");
        sb.append("id=").append(id);
        sb.append(", typeCode='").append(typeCode).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
