/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.services;


import com.mycompany.thewineproject.daos.ProductDao;
import com.mycompany.thewineproject.models.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService{
    
    @Autowired
    private ProductDao dao;
    

    @Override
    public Product findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveProduct(Product product) {
        dao.saveProduct(product);
    }

    
    @Override
    public void updateProduct(Product product) {
        Product entity = dao.findById(product.getPid());
        if (entity != null) {
            entity.setClid(product.getClid());
            entity.setPalcohol(product.getPalcohol());
            entity.setPcompany(product.getPcompany());
            entity.setPdescr(product.getPcompany());
            entity.setPdryness(product.getPdryness());
            entity.setCid(product.getCid());
            entity.setPname(product.getPname());
            entity.setPprice(product.getPprice());
            entity.setPsize(product.getPsize());
            entity.setPyear(product.getPyear());
            entity.setVid(product.getVid());
            entity.setImage(product.getImage());

        }
    }

    @Override
    public void deleteProductById(int id) {
        dao.deleteProductById(id);
    }

    @Override
    public List<Product> findAllProduct() {
        return dao.findAllProducts();
    }

    @Override
    public List<Product> findByCountry(int cid){
        return dao.findByCountry(cid);
    }
    
    @Override
    public List<Product> findByVariety(int vid){
        return dao.findByVariety(vid);
    }
    
    @Override
    public List<Product> findByColour(int clid){
        return dao.findByColour(clid);
    }
}
