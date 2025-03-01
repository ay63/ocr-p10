package com.openclassrooms.bobapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openclassrooms.bobapp.service.JokeService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/joke")
public class JokeController {

    private final JokeService jokeService;

    JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping()
    public ResponseEntity<?> getRandomJokes() {
        return ResponseEntity.ok(this.jokeService.getRandomJoke());
    }

    @GetMapping("test")
    public String getMethodName(@RequestParam String param) {
        return new String("test");
    }

    @GetMapping("test2")
    public String test(@RequestParam String param) {
        return new String("test");
    }
    
}
