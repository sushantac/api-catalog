package com.abc.product.controller;

import com.abc.product.exception.ProductNotFoundException;
import com.abc.product.model.Product;
import com.abc.product.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    Product getProductById(@PathVariable Long id) {
        Product product = productService.getProduct(id);
        if (product == null) {
            throw new ProductNotFoundException("Product not found for id: " + id);
        }
        return product;
    }

    @GetMapping(path = "", params = "typeCode", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    List<Product> getProductByTypeCode(@RequestParam("typeCode") String typeCode) {
        Product product = productService.getProductByTypeCode(typeCode);
        if (product == null) {
            throw new ProductNotFoundException("Product not found for typeCode: " + typeCode);
        }
        return List.of(product);
    }

}
