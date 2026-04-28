/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package t5.examen.ej1;

import java.util.*;

/**
 *
 * @author Marta
 */
/**/
public class PantallasTactiles extends GranTamaño{
    
    protected String tipo;
    
    //constructor

    public PantallasTactiles(String tipo, double resolucion, String marca, double precio, int año) {
        super(resolucion, marca, precio, año);
        this.tipo = tipo;
    }
    
    //getter y setter

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //Metodos
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: " + tipo);
    }
    
    public double PVP() {
        double incremento = precio * 0.28;
        precio += incremento;
        return precio;
    }
}

