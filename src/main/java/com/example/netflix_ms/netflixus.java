package com.example.netflix_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class netflixus {
    @GetMapping("/netflixus")
    public String getData() {return  "NETFLIX US-sub" ; }
}