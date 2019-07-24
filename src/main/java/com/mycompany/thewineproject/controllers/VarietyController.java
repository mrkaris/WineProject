
package com.mycompany.thewineproject.controllers;


import com.mycompany.thewineproject.models.Variety;
import com.mycompany.thewineproject.services.VarietyService;
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
@RequestMapping("/variety")
public class VarietyController {

    @Autowired
    VarietyService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String findAllVarieties(ModelMap model) {
        List<Variety> varieties = service.findAllVarieties();
        model.addAttribute("varieties", varieties);
        return "";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String findById(ModelMap model, @PathVariable("id") int id) {
        Variety v = service.findById(id);
        model.addAttribute("variety", v);
        return "";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insertForm(ModelMap model) {
        Variety variety = new Variety();
        model.addAttribute("variety", variety);
        return "";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String saveVariety(@Valid Variety variety, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "";
        }
        service.saveVariety(variety);
        return "";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteVarietyById(ModelMap model, @PathVariable("id") int id) {
        service.deleteVarietyById(id);
        return "";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateById(ModelMap model, @PathVariable("id") int id) {
        model.addAttribute("variety", service.findById(id));
        return "";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateVariety(@Valid Variety variety, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            int id = variety.getVid();
            return "update/{" + id + "}";
        }
        service.updateVariety(variety);
        return "";
    }

}