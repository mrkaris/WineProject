package com.mycompany.thewineproject.controllers;

import com.mycompany.thewineproject.models.Variety;
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
@RequestMapping("/variety")
@SessionAttributes("roles")
public class VarietyController {

    @Autowired
    VarietyService service;

    @RequestMapping(method = RequestMethod.GET)
    public String findAllVarieties(ModelMap model) {
        List<Variety> varieties = service.findAllVarieties();
        model.addAttribute("varieties", varieties);
        model.addAttribute("loggedinuser", getPrincipal());
        return "viewvarieties";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String findById(ModelMap model, @PathVariable("id") int id) {
        Variety v = service.findById(id);
        model.addAttribute("variety", v);
        model.addAttribute("loggedinuser", getPrincipal());
        return "";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insertForm(ModelMap model) {
        Variety variety = new Variety();
        model.addAttribute("variety", variety);
        model.addAttribute("loggedinuser", getPrincipal());
        return "registervariety";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String saveVariety(@Valid Variety variety, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "registervariety";
        }
        service.saveVariety(variety);
        model.addAttribute("success", "Variety " + variety.getVdescr() + " registered successfully");
        model.addAttribute("loggedinuser", getPrincipal());
        return "registrationsuccess";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteVarietyById(ModelMap model, @PathVariable("id") int id) {
        service.deleteVarietyById(id);
        model.addAttribute("success", "Variety deleted successfully");
        model.addAttribute("loggedinuser", getPrincipal());
        return "registrationsuccess";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateById(ModelMap model, @PathVariable("id") int id) {
        model.addAttribute("variety", service.findById(id));
        model.addAttribute("edit", true);
        model.addAttribute("loggedinuser", getPrincipal());
        return "registervariety";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateVariety(@Valid Variety variety, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            int id = variety.getVid();
            return "update/{" + id + "}";
        }
        service.updateVariety(variety);
        model.addAttribute("success", "Variety " + variety.getVdescr() + " updated successfully");
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
