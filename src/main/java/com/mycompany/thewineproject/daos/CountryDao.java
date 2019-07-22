/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.daos;

import com.mycompany.thewineproject.models.Country;
import java.util.List;

/**
 *
 * @author George
 */
public interface CountryDao {

    Country findById(int id);

    void saveCountry(Country country);

    void deleteCountryById(int id);

    List<Country> findAllCountries();

}
