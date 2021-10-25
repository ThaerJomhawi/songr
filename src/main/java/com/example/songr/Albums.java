package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class Albums {
    @GetMapping("/albums")
    public static String albums(Model model){


        model.addAttribute("songs",Arrays.asList(
                new com.example.songr.model.Model("َQustions in my mind","Faraj Suliman",10,5000,"https://i1.sndcdn.com/artworks-ZBuv96qREydBnR5m-ez44eg-t500x500.jpg"),
                new com.example.songr.model.Model("َ،Kul Hayate","Amr Diab",13,7000,"https://upload.wikimedia.org/wikipedia/ar/4/48/Kol_Hayati.jpg"),
                new com.example.songr.model.Model("َJmaet Kheer","Jmaet Kheer",11,6600,"https://i1.sndcdn.com/avatars-000388887162-bi5p0p-t500x500.jpg")
        ));


        return "albums";
    }

}
