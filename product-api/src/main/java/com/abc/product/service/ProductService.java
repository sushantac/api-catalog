package com.abc.product.service;

import com.abc.product.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProduct(Long id);

    Product getProductByTypeCode(String typeCode);

}
