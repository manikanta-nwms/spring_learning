package com.example.feb2023.services;


import org.springframework.stereotype.Service;

@Service
public class CalculateServices {
    public double add(double a, double b){
        System.out.println("inside service");
        return a+b;
    }
    public double sub(double a, double b){
        System.out.println("inside service");
        return a-b;
    }
    public double mul(double a, double b){
        System.out.println("inside service");
        return a*b;
    }
    public double div(double a, double b){
        System.out.println("inside service");
        return a/b;
    }

}
