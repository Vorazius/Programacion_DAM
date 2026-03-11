/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistej1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Marta González
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crear 5 instancias
        Producto p1 = new Producto("fusil", 500);
        Producto p2 = new Producto("hacha", 75);
        Producto p3 = new Producto("cuchillo", 15);
        Producto p4 = new Producto("pistola", 150);
        Producto p5 = new Producto("polvora", 200);
        
        //Crear ArrayList
        ArrayList<Producto> lista = new ArrayList<Producto>();
        
        //Añadir instancias
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        
        //Ver contenido del ArrayList
        Iterator<Producto> it = lista.iterator();
        while (it.hasNext()) {
            Producto p = it.next();
            System.out.println(p.getNombre() + " " + p.getCantidad());
        }
        System.out.println("");

        //Eliminar dos elementos
        lista.remove(p5);
        lista.remove(p2);

        //Insertar nuevo objeto en medio de la lista
        lista.add(2,p5);

        //Visualizar con iterator
        Iterator<Producto> it2 = lista.iterator();
        while (it2.hasNext()) {
            Producto p = it2.next();
            System.out.println(p.getNombre() + " " + p.getCantidad());
        }
    }
    
}
