package com.example.feb2023.controller;

import com.example.feb2023.services.CalculateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired//depedency Injection
    CalculateServices calser;

//    CalculateServices calser = new CalculateServices();
    @GetMapping("/greet")
    public String sayHello(){
        return "Welcome to spring boot framework";
    }
    @GetMapping("/add/{first}/{second}")
    public ResponseEntity<Object> add(@PathVariable("first") double firstNumber,
                      @PathVariable("second") double secondNumber){
        if(firstNumber == 0 || secondNumber == 0) {
            return new ResponseEntity<>("Invalid input. input numbes must be more than zero", HttpStatus.BAD_REQUEST);
        }
        double add = calser.add(firstNumber,secondNumber);
        return new ResponseEntity<>(add, HttpStatus.OK);

    }
    @GetMapping("/sub")
    public ResponseEntity<Object> sub(@RequestParam("first") double firstNumber,
                                      @RequestParam("second") double secondNumber){
        if(firstNumber == 0 || secondNumber == 0) {
            return new ResponseEntity<>("Invalid input. input numbes must be more than zero", HttpStatus.BAD_REQUEST);
        }
        double add = calser.sub(firstNumber,secondNumber);
        return new ResponseEntity<>(add, HttpStatus.OK);

    }
    @GetMapping("/mul")
    public ResponseEntity<Object> mul(@RequestParam("first") double firstNumber,
                                      @RequestParam("second") double secondNumber){
        if(firstNumber == 0 || secondNumber == 0) {
            return new ResponseEntity<>("Invalid input. input numbes must be more than zero", HttpStatus.BAD_REQUEST);
        }
        double add = calser.mul(firstNumber,secondNumber);
        return new ResponseEntity<>(add, HttpStatus.OK);

    }
    @GetMapping("/div")
    public ResponseEntity<Object> div(@RequestParam("first") double firstNumber,
                                      @RequestParam("second") double secondNumber){
        if(firstNumber == 0 || secondNumber == 0) {
            return new ResponseEntity<>("Invalid input. input numbes must be more than zero", HttpStatus.BAD_REQUEST);
        }
        double add = calser.div(firstNumber,secondNumber);
        return new ResponseEntity<>(add, HttpStatus.OK);

    }
}

