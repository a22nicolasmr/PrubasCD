/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Usuario
 */
public class CalculadoraClas {
    int num1;
    int num2;
    CalculadoraClas(){}

    public CalculadoraClas(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int Suma(int num1,int num2){
        return num1+num2;
    }
    public int Resta(int num1,int num2){
        return num1-num2;
    }
    public int Multiplicacion(int num1,int num2){
        return num1*num2;
    }
    public int Division(int num1,int num2){
        return num1/num2;
    }
}
