package com.example.Operation.Service;

import org.springframework.stereotype.Service;

@Service
public class OperationService {
    

    public double sum(double num1,double num2)
    {
        return num1 + num2;
    }

    public double sub(double num1,double num2)
    {
        return num1 - num2;
    }

    public double mul(double num1,double num2)
    {
        return num1 * num2;
    }

    public double div(double num1,double num2)
    {
        return num1 / num2;
    }

}
