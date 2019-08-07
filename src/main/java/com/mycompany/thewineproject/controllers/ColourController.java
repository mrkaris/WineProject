package com.mycompany.thewineproject.controllers;

import com.mycompany.thewineproject.models.Colour;
import com.mycompany.thewineproject.services.ColourService;
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
@RequestMapping("/colour")
@SessionAttributes("roles")
public class ColourController {

    @Autowired
    ColourService service;

    @RequestMapping(method = RequestMethod.GET)
    public String findAllColours(ModelMap model) {
        List<Colour> colours = service.findAllColours();
        model.addAttribute("colours", colours);
        model.addAttribute("loggedinuser", getPrincipal());
        return "viewcolours";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String findById(ModelMap model, @PathVariable("id") int id) {
        Colour c = service.findById(id);
        model.addAttribute("colour", c);
        model.addAttribute("loggedinuser", getPrincipal());
        return "";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insertForm(ModelMap model) {
        Colour colour = new Colour();
        model.addAttribute("colour", colour);
        model.addAttribute("loggedinuser", getPrincipal());
        return "registercolour";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String saveColour(@Valid Colour colour, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "registercolour";
        }
        service.saveColour(colour);
        model.addAttribute("success", "Colour " + colour.getCldescr() + " registered successfully");
        model.addAttribute("loggedinuser", getPrincipal());
        return "registrationsuccess";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteColourById(ModelMap model, @PathVariable("id") int id) {
        service.deleteColourById(id);
        model.addAttribute("success", "Colour deleted successfully");
        model.addAttribute("loggedinuser", getPrincipal());
        return "registrationsuccess";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateById(ModelMap model, @PathVariable("id") int id) {
        model.addAttribute("colour", service.findById(id));
        model.addAttribute("edit", true);
        model.addAttribute("loggedinuser", getPrincipal());
        return "registercolour";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateColour(@Valid Colour colour, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            int id = colour.getClid();
            return "update/{" + id + "}";
        }
        service.updateColour(colour);
        model.addAttribute("success", "Colour " + colour.getCldescr() + " updated successfully");
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
