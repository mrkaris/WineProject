
package com.mycompany.thewineproject.controllers;

import com.mycompany.thewineproject.models.Colour;
import com.mycompany.thewineproject.services.ColourService;
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
@RequestMapping("/colour")
public class ColourController {

    @Autowired
    ColourService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String findAllColours(ModelMap model) {
        List<Colour> colours = service.findAllColours();
        model.addAttribute("colours", colours);
        return "";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String findById(ModelMap model, @PathVariable("id") int id) {
        Colour c = service.findById(id);
        model.addAttribute("colour", c);
        return "";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insertForm(ModelMap model) {
        Colour colour = new Colour();
        model.addAttribute("colour", colour);
        return "";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String saveColour(@Valid Colour colour, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "";
        }
        service.saveColour(colour);
        return "";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteColourById(ModelMap model, @PathVariable("id") int id) {
        service.deleteColourById(id);
        return "";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateById(ModelMap model, @PathVariable("id") int id) {
        model.addAttribute("colour", service.findById(id));
        return "";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateColour(@Valid Colour colour, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            int id = colour.getClid();
            return "update/{" + id + "}";
        }
        service.updateColour(colour);
        return "";
    }

}
