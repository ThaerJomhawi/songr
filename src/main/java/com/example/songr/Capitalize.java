package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Capitalize {
    @GetMapping("/capitalize/{name}")
    public String capitalize(Model model, @PathVariable(value="name") String name){
        String capitalize =  name.toUpperCase();

        model.addAttribute("name", capitalize);
        return "capitalize";
    }

}
