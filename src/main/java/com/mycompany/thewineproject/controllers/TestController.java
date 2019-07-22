/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.thewineproject.controllers;

import com.mycompany.thewineproject.models.Colour;
import com.mycompany.thewineproject.models.Country;
import com.mycompany.thewineproject.models.Product;
import com.mycompany.thewineproject.services.ColourService;
import com.mycompany.thewineproject.services.CountryService;
import com.mycompany.thewineproject.services.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/products")
public class TestController {
    
    @Autowired
    ProductService service;

    @RequestMapping(method = RequestMethod.GET)
    public String findAllColours(ModelMap model) {
        List<Product> countries = service.findAllProduct();
        System.out.println(countries.get(0).getCid());
        model.addAttribute("colours", countries);
        return "students";
    }
    
    
}
