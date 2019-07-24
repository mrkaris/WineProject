/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.daos;

import com.mycompany.thewineproject.models.Product;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("productDao")
@Transactional
public class ProductDaoImpl extends AbstractDao<Integer, Product> implements ProductDao {

    @Override
    public Product findById(int id) {
        return getByKey(id);
    }

    @Override
    public void saveProduct(Product product) {
        persist(product);
    }

    @Override
    public void deleteProductById(int id) {
        delete(findById(id));
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Product> findAllProducts() {
        Criteria criteria = createEntityCriteria();
        return (List<Product>) criteria.list();
    }

    
    @Override
    public List<Product> findByCountry(int cid){
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("cid.cid", cid));
        return (List<Product>) criteria.list();
    }
    
    @Override
    public List<Product> findByVariety(int vid){
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("vid.vid", vid));
        return (List<Product>) criteria.list();
    }
    
    @Override
    public List<Product> findByColour(int clid){
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("clid.clid", clid));
        return (List<Product>) criteria.list();
    }
    
    
}
