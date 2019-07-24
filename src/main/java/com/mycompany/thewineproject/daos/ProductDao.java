/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.daos;

import com.mycompany.thewineproject.models.Product;
import java.util.List;

public interface ProductDao {

    Product findById(int id);

    void saveProduct(Product product);

    void deleteProductById(int id);

    List<Product> findAllProducts();

    List<Product> findByCountry(int cid) ;
    
    List<Product> findByVariety(int vid) ;
    
    List<Product> findByColour(int clid) ;
    
}
