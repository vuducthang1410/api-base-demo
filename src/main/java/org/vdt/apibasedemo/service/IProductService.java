package org.vdt.apibasedemo.service;

import org.vdt.apibasedemo.dto.Product;

import java.util.List;

public interface IProductService {
    Product getProductById(int id);
    List<Product> getAllProducts();
    void updateProduct(Product product);
    void deleteProduct(int id);
    Product addProduct(Product product);
}
