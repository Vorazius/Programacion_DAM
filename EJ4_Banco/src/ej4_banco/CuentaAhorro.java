/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ej4_banco;

import java.util.Scanner;


/* -----------------T-MOD-Ej------------------*/
/**/
/**
 *
 * @author Marta González
 */
public class CuentaAhorro extends CuentaBancaria {
    
    //VARIABLES INSTANCIA
    private static double saldoMinimo = 500;
    
    //CONSTRUCTOR

    public CuentaAhorro(double saldoMinimo, int numeroCuenta, int saldo) {
        super(numeroCuenta, saldo);
        this.saldoMinimo = saldoMinimo;
    }
    
    //METODOS
    public void calcularIntereses() {
    }
    
} //class
