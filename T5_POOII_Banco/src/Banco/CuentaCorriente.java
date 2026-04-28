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
public class CuentaCorriente extends CuentaBancaria {

    
    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }
    
    public void calcularIntereses () {
        double intereses = getSaldo() * interesAnualBasico;
        ingresar(intereses);
    }
}

