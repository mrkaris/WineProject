
package com.mycompany.thewineproject.controllers;


import com.mycompany.thewineproject.models.Product;
import com.mycompany.thewineproject.services.ProductService;
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
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String findAllProducts(ModelMap model) {
        List<Product> products = service.findAllProduct();
        model.addAttribute("products", products);
        return "";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String findById(ModelMap model, @PathVariable("id") int id) {
        Product p = service.findById(id);
        model.addAttribute("product", p);
        return "";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insertForm(ModelMap model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String saveProduct(@Valid Product product, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "";
        }
        service.saveProduct(product);
        return "";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteProductById(ModelMap model, @PathVariable("id") int id) {
        service.deleteProductById(id);
        return "";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateById(ModelMap model, @PathVariable("id") int id) {
        model.addAttribute("product", service.findById(id));
        return "";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateProduct(@Valid Product product, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            int id = product.getPid();
            return "update/{" + id + "}";
        }
        service.updateProduct(product);
        return "";
    }

    @RequestMapping(value = "product/countr/{cid}", method = RequestMethod.GET)
    public String findByCountry(ModelMap model,@PathVariable("cid") int cid) {
        List<Product> products = service.findByCountry(cid);
        model.addAttribute("products", products);
        return "";
    }
}