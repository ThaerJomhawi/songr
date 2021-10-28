package com.example.songr.controllers;

import com.example.songr.models.Album;
import com.example.songr.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    // get all albums

    @GetMapping("/albums")
    public String getAllAlbums(Model model){
        List<Album> allAlbums = (ArrayList)albumRepository.findAll();
        model.addAttribute("allAlbums",allAlbums);
        return "albums";


    }

    //add albums

    @PostMapping("/albums")
    public RedirectView addAlbum(Album album){
        albumRepository.save(album);
        return new RedirectView("/albums");


    }

}
