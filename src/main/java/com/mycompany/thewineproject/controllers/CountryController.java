package com.mycompany.thewineproject.controllers;

import com.mycompany.thewineproject.models.Country;
import com.mycompany.thewineproject.services.CountryService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class CountryController {

    @Autowired
    CountryService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String findAllCountries(ModelMap model) {
        List<Country> countries = service.findAllCountries();
        model.addAttribute("countries", countries);
        return "";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String findById(ModelMap model, @PathVariable("id") int id) {
        Country c = service.findById(id);
        model.addAttribute("country", c);
        return "";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insertForm(ModelMap model) {
        Country country = new Country();
        model.addAttribute("country", country);
        return "";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String saveCountry(@Valid Country country, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "";
        }
        service.saveCountry(country);
        return "";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteCountryById(ModelMap model, @PathVariable("id") int id) {
        service.deleteCountryById(id);
        return "";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateById(ModelMap model, @PathVariable("id") int id) {
        model.addAttribute("country", service.findById(id));
        return "";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateBrand(@Valid Country country, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            int id = country.getCid();
            return "update/{" + id + "}";
        }
        service.updateCountry(country);
        return "";
    }

}
