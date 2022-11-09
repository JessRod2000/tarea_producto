package com.computo.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private final PersonService personService;
    @Autowired
    public TestController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/persons")
    public ResponseEntity<?> findAllPersons(){
        return new ResponseEntity<>(personService.findAllPersons(), HttpStatus.OK);
    }
}