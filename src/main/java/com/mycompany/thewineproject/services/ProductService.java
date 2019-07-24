/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.services;

import com.mycompany.thewineproject.models.Product;
import java.util.List;

/**
 *
 * @author George
 */
public interface ProductService {

    Product findById(int id);

    void saveProduct(Product product);

    void updateProduct(Product product);

    void deleteProductById(int id);

    List<Product> findAllProduct();

    List<Product> findByCountry(int cid) ;
    
    List<Product> findByVariety(int cid) ;
    
    List<Product> findByColour(int cid) ;
}
