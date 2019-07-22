/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.services;

import com.mycompany.thewineproject.daos.CountryDao;
import com.mycompany.thewineproject.models.Country;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("countryService")
@Transactional

public class CountryServiceImpl implements CountryService{
    
    @Autowired
    private CountryDao dao;

    @Override
    public Country findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveCountry(Country country) {
        dao.saveCountry(country);
    }

    
    @Override
    public void updateCountry(Country country) {
        Country entity = dao.findById(country.getCid());
        if (entity != null) {
            entity.setCdescr(country.getCdescr());

        }
    }

    @Override
    public void deleteCountryById(int id) {
        dao.deleteCountryById(id);
    }

    @Override
    public List<Country> findAllCountries() {
        return dao.findAllCountries();
    }

}
