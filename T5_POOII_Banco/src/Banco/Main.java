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
public class Main {
    public static void main(String[] args) {

        
        CuentaCorriente cuenta = new CuentaCorriente("djfskdj", 600);
        CuentaAhorro ahorro = new CuentaAhorro(500, "sadkadslkas", 400);
        
        ahorro.calcularIntereses();
        ahorro.consultar();
        
        
        cuenta.calcularIntereses();
        cuenta.consultar();
    }
}

