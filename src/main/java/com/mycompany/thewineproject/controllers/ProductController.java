package com.mycompany.thewineproject.controllers;

import com.mycompany.thewineproject.models.Colour;
import com.mycompany.thewineproject.models.Country;
import com.mycompany.thewineproject.models.Product;
import com.mycompany.thewineproject.models.Variety;
import com.mycompany.thewineproject.services.ColourService;
import com.mycompany.thewineproject.services.CountryService;
import com.mycompany.thewineproject.services.ProductService;
import com.mycompany.thewineproject.services.VarietyService;
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
@RequestMapping("/product")
@SessionAttributes("roles")
public class ProductController {

    @Autowired
    ProductService service;

    @Autowired
    VarietyService vservice;

    @Autowired
    ColourService clservice;

    @Autowired
    CountryService cservice;

    @RequestMapping(method = RequestMethod.GET)
    public String findAllProducts(ModelMap model) {
        List<Product> products = service.findAllProduct();
        model.addAttribute("products", products);
        model.addAttribute("loggedinuser", getPrincipal());
        return "productlist";
    }

    @RequestMapping(value = "view/{id}", method = RequestMethod.GET)
    public String findById(ModelMap model, @PathVariable("id") int id) {
        Product p = service.findById(id);
        model.addAttribute("product", p);
        model.addAttribute("loggedinuser", getPrincipal());
        return "wineById";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insertForm(ModelMap model) {
        Product product = new Product();
        List<Variety> varieties = vservice.findAllVarieties();
        List<Colour> colours = clservice.findAllColours();
        List<Country> countries = cservice.findAllCountries();

        model.addAttribute("product", product);
        model.addAttribute("varieties", varieties);
        model.addAttribute("colours", colours);
        model.addAttribute("countries", countries);
        model.addAttribute("edit", false);
        model.addAttribute("loggedinuser", getPrincipal());
        return "registerproduct";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insertForm(@Valid Product product, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "";
        }

        service.saveProduct(product);
        model.addAttribute("success", "Product " + product.getPname() + " registered successfully");
        model.addAttribute("loggedinuser", getPrincipal());
        return "registrationsuccess";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteProductById(ModelMap model, @PathVariable("id") int id) {
        service.deleteProductById(id);
        model.addAttribute("success", "Product deleted successfully");
        model.addAttribute("loggedinuser", getPrincipal());
        return "registrationsuccess";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateById(ModelMap model, @PathVariable("id") int id) {

        model.addAttribute("product", service.findById(id));
        List<Variety> varieties = vservice.findAllVarieties();
        List<Colour> colours = clservice.findAllColours();
        List<Country> countries = cservice.findAllCountries();

        model.addAttribute("varieties", varieties);
        model.addAttribute("colours", colours);
        model.addAttribute("countries", countries);
        model.addAttribute("edit", true);
        return "registerproduct";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateProduct(@Valid Product product, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            int id = product.getPid();
            return "update/{" + id + "}";
        }
        service.updateProduct(product);
        model.addAttribute("success", "Product " + product.getPname() + " updated successfully");
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

    @RequestMapping(value = "/country/{cid}", method = RequestMethod.GET)
    public String findByCountry(ModelMap model, @PathVariable("cid") int cid) {
        List<Product> products = service.findByCountry(cid);
        List<Colour> colours = clservice.findAllColours();
        List<Country> countries = cservice.findAllCountries();
        List<Variety> varieties = vservice.findAllVarieties();
        String page = "wines.jsp";
        model.addAttribute("page", page);
        model.addAttribute("colours", colours);
        model.addAttribute("countries", countries);
        model.addAttribute("varieties", varieties);
        model.addAttribute("products", products);
        model.addAttribute("loggedinuser", getPrincipal());
        return "index";
    }

    @RequestMapping(value = "/variety/{vid}", method = RequestMethod.GET)
    public String findByVariety(ModelMap model, @PathVariable("vid") int vid) {
        List<Product> products = service.findByVariety(vid);
        model.addAttribute("products", products);
        List<Colour> colours = clservice.findAllColours();
        List<Country> countries = cservice.findAllCountries();
        List<Variety> varieties = vservice.findAllVarieties();
        String page = "wines.jsp";
        model.addAttribute("page", page);
        model.addAttribute("colours", colours);
        model.addAttribute("countries", countries);
        model.addAttribute("varieties", varieties);
        model.addAttribute("products", products);
        model.addAttribute("loggedinuser", getPrincipal());
        return "index";
    }

    @RequestMapping(value = "/colour/{clid}", method = RequestMethod.GET)
    public String findByColour(ModelMap model, @PathVariable("clid") int clid) {
        List<Product> products = service.findByColour(clid);
        model.addAttribute("products", products);
        List<Colour> colours = clservice.findAllColours();
        List<Country> countries = cservice.findAllCountries();
        List<Variety> varieties = vservice.findAllVarieties();
        String page = "wines.jsp";
        model.addAttribute("page", page);
        model.addAttribute("colours", colours);
        model.addAttribute("countries", countries);
        model.addAttribute("varieties", varieties);
        model.addAttribute("products", products);
        model.addAttribute("loggedinuser", getPrincipal());
        return "index";
    }
}
