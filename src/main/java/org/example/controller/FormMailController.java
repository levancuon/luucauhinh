package org.example.controller;

import org.example.model.Form;
import org.example.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/formmail")
public class FormMailController {
@Autowired
private FormService formService;
    @GetMapping("")
    public String showForm(Model model){
         model.addAttribute("form",formService.getDataForm());
        return "/formmail";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Form form){
        formService.update(form);
        return "redirect:/formmail";
    }


}
