package fr.efrei.rag.web.rest;

import org.springframework.web.bind.annotation.*;

@RestController
public class SampleRessource {

    @GetMapping("/sample/{value}")
    public String hello(@PathVariable(value = "value", required = false) final String value){
        return "Hello " + value + "!";
    }
}