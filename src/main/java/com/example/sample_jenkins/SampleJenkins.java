package com.example.sample_jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleJenkins {

    @GetMapping("/hi")
    public String sayHi(){
        return "Hi Jenkins";
    }

    @GetMapping("/hi/{name")
    public String greeting(@PathVariable String name){
        return "Hi Jenkins - " + name;
    }
}
