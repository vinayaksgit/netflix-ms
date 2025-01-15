package com.example.netflix_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class netflixuk {
    @GetMapping("/netflixuk")
    public String getData() {return  "NETFLIX UK-sub" ; }
}