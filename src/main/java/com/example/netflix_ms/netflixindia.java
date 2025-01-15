package com.example.netflix_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class netflix {
    @GetMapping("/netflixindia")
    public String getData() {return  "NETFLIX INDIA" ; }
}