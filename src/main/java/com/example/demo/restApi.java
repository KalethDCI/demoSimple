package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Bartosz on 2018-02-17.
 */
@RestController
public class restApi {

    @Autowired
    private CalcService calcService;

    @GetMapping("test")
    public String test() {
        return "Hi";
    }


    @GetMapping("hello")
    public String hello(@RequestParam("name") String namr) {
        return "Hi " + namr;
    }

    @GetMapping("sum")
    public double calcSum(@RequestParam("a") double a, @RequestParam("b") double b) throws CalcException {
        return  calcService.calc(a, b, Operation.SUM);
    }

    @GetMapping("multi")
    public double calcMultiply(@RequestParam("a") double a, @RequestParam("b") double b) throws CalcException {
        return  calcService.calc(a, b, Operation.MULTIPLY);
    }


    @GetMapping("cal")
    public double calc(@RequestParam("a") double a, @RequestParam("b") double b, @RequestParam("operation") Operation operation) throws CalcException {
        return  calcService.calc(a, b, operation);
    }

    @GetMapping("list")
    public List<Game> games() {
        return
    }



}
