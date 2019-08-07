package com.mycompany.thewineproject.controllers;

import com.mycompany.thewineproject.models.Country;
import com.mycompany.thewineproject.services.CountryService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/country")
@SessionAttributes("roles")
public class CountryController {

    @Autowired
    CountryService service;

    @RequestMapping(method = RequestMethod.GET)
    public String findAllCountries(ModelMap model) {
        List<Country> countries = service.findAllCountries();
        model.addAttribute("countries", countries);
        model.addAttribute("loggedinuser", getPrincipal());
        return "viewcountries";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String findById(ModelMap model, @PathVariable("id") int id) {
        Country c = service.findById(id);
        model.addAttribute("country", c);
        model.addAttribute("loggedinuser", getPrincipal());
        return "";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insertForm(ModelMap model) {
        Country country = new Country();
        model.addAttribute("country", country);
        model.addAttribute("loggedinuser", getPrincipal());
        return "registercountry";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String saveCountry(@Valid Country country, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "registercountry";
        }
        service.saveCountry(country);
        model.addAttribute("success", "Country " + country.getCdescr() + " registered successfully");
        model.addAttribute("loggedinuser", getPrincipal());
        return "registrationsuccess";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteCountryById(ModelMap model, @PathVariable("id") int id) {
        service.deleteCountryById(id);
        model.addAttribute("success", "Country deleted successfully");
        model.addAttribute("loggedinuser", getPrincipal());
        return "registrationsuccess";

    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateById(ModelMap model, @PathVariable("id") int id) {
        model.addAttribute("country", service.findById(id));
        model.addAttribute("edit", true);
        model.addAttribute("loggedinuser", getPrincipal());
        return "registercountry";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateBrand(@Valid Country country, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            int id = country.getCid();
            return "update/{" + id + "}";
        }
        service.updateCountry(country);
        model.addAttribute("success", "Country " + country.getCdescr() + " updated successfully");
        model.addAttribute("loggedinuser", getPrincipal());
        return "registrationsuccess";
    }

    private String getPrincipal() {
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {
            userName = ((UserDetails) principal).getUsername();
        } else {
            userName = principal.toString();
        }
        return userName;
    }

}
