package com.abc.product.model;

public record Product(long id,
                      String name,
                      String description,
                      String typeCode,
                      Category category,
                      Brand brand,
                      Double price,
                      Currency currency) {

}
