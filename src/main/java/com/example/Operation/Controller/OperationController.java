package com.example.Operation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Operation.Service.OperationService;

@RestController
public class OperationController {
    
    @Autowired
    private OperationService operationService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/sum")
    public double sum(@RequestParam double num1,@RequestParam double num2)
    {
        return operationService.sum(num1, num2);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/sub")
    public double sub(@RequestParam double num1,@RequestParam double num2)
    {
        return operationService.sub(num1, num2);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/mul")
    public double mul(@RequestParam double num1,@RequestParam double num2)
    {
        return operationService.mul(num1, num2);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/div")
    public double div(@RequestParam double num1,@RequestParam double num2)
    {
        return operationService.div(num1, num2);
    }
}
