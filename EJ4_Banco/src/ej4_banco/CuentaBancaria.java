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
abstract class CuentaBancaria {
    
    //VARIABLES ISNTANCIA
    private int numeroCuenta;
    private int saldo;
    private static final double interesAnualBasico = 0.5;
    
    //CONSTRUCTOR

    public CuentaBancaria(int numeroCuenta, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        
    }
    
    
    //GETTER Y SETTER

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }
    
    
    //METODOS
    private void añadir(double cantidad){
        saldo += cantidad;
    }
    
    public void ingresar(double cantidad){
        if (cantidad > 0) {
            añadir(cantidad);
        }
    }
    
    public void retirar(double cantidad){
        if (cantidad > 0 && saldo >= cantidad) {
            añadir(-cantidad);
        }
    }
    
    public void traspaso(CuentaBancaria destino, double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            retirar(cantidad);
            destino.ingresar(cantidad);
        }
    }
    
    
    public abstract  void calcularIntereses();
} //class
