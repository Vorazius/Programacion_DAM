/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5.examen.ej1;

import java.util.ArrayList;

/**
 *
 * @author darkh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Dispositivos> lista = new ArrayList();
        
               
        //(calidad, marca, año, precio, peso)
        Altavoces a1 = new Altavoces("ALTA", "Genius", 2025, 50, 525);
        
        //(bateria, marca, año, precio, peso)
        Notebooks n1 = new Notebooks(10,  2026, "Acer", 300, 780);
        
        //(capacitiva/resistiva, resolucion, marca, año, precio)
        PantallasTactiles pdi1 = new PantallasTactiles("nose", 324, "Smart", 2020, 1200);
        
        //(herramientas, resolucion, marca, año, precio)
        PizarrazDigitales p1 = new PizarrazDigitales(58, 23232, "Xiaomi", 2026, 2850);
        
        //Se añaden las instancias a la lista
        lista.add(a1);
        lista.add(n1);
        lista.add(pdi1);
        lista.add(p1);
        
        
        System.out.println("***********************DATOS INICIALES***********************");
        //Presentar los datos iniciales haciendo uso del polimorfismo
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).imprimir();
            System.out.println("");
        }
        
        System.out.println("***********************CALCULO PRECIOS DE VENTA***********************");
        //Calcular el PVP y presentar nuevamente los datos haciendo uso del polimorfismo
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).PVP();
            System.out.println("");
        }
        
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).imprimir();
            System.out.println("");
        }
        
    }
    
}
