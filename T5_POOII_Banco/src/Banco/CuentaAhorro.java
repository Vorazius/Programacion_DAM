/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Banco;

import java.util.*;

/**
 *
 * @author Marta
 */
/**/
public class CuentaAhorro extends CuentaBancaria {
    
    private final double saldoMinimo;

    public CuentaAhorro(double saldoMinimo, String iban, double saldo) {
        super(iban, saldo);
        this.saldoMinimo = saldoMinimo;
    }
    
    public void calcularIntereses() {
        
        double interes;
        if (getSaldo() < saldoMinimo) {
            interes = interesAnualBasico/2;
        } else {
            interes = interesAnualBasico*2;
            
        }
        
        double total = getSaldo() * interes;
        ingresar(total);
    }
}

