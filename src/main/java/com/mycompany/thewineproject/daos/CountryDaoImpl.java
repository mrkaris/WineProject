/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.daos;

import com.mycompany.thewineproject.models.Country;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("countryDao")
@Transactional
public class CountryDaoImpl extends AbstractDao<Integer, Country> implements CountryDao {
    
    @Override
    public Country findById(int id) {
        return getByKey(id);
    }

    @Override
    public void saveCountry(Country country) {
        persist(country);
    }

    @Override
    public void deleteCountryById(int id) {
        delete(findById(id));
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Country> findAllCountries() {
        Criteria criteria = createEntityCriteria();
        return (List<Country>) criteria.list();
    }
}
