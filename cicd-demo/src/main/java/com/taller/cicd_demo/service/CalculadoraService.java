

package com.taller.cicd_demo.service;   
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public double dividir(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("No se puede dividir entre cero");
        return (double) a / b;
    }
}