package com.abc.product.service.impl;

import com.abc.product.model.Product;
import com.abc.product.model.entity.ProductEntity;
import com.abc.product.repository.ProductRepository;
import com.abc.product.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    private ModelMapper modelMapper;

    public ProductServiceImpl(@NonNull ProductRepository productRepository,
                              @NonNull ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Product> getProducts() {
        List<ProductEntity> productEntities = productRepository.findAll();
        return productEntities
                .stream()
                .map(entity -> modelMapper.map(entity, Product.class))
                .toList();
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id)
                .map(entity -> modelMapper.map(entity, Product.class))
                .orElse(null);
    }

    @Override
    public Product getProductByTypeCode(String typeCode) {
        return productRepository.findByTypeCode(typeCode)
                .map(entity -> modelMapper.map(entity, Product.class))
                .orElse(null);
    }
}
