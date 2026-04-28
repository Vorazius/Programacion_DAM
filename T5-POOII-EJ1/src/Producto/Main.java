/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Producto;

import java.util.*;

/**
 *
 * @author Marta
 */
/**/
public class Main {
    public static void main(String[] args) {
        
        Producto p1 = new Producto("Secador", 2);
        Producto p2 = new Producto("Peine", 4);
        Producto p3 = new Producto("TV", 1);
        Producto p4 = new Producto("PC", 2);
        Producto p5 = new Producto("Tenedor", 9);
        
        ArrayList miArray = new ArrayList();
        
        miArray.add(p1);
        miArray.add(p2);
        miArray.add(p3);
        miArray.add(p4);
        miArray.add(p5);
        
        Iterator iter = miArray.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        
        miArray.remove(p5);
        miArray.remove(p1);
        
        miArray.add(1, new Producto("Tenedor", 9));
        
        
        System.out.println("");
        Iterator iter2 = miArray.iterator();
        while(iter2.hasNext()) {
            System.out.println(iter2.next());
        }
        
        System.out.println("");
        miArray.clear();
        for (int i = 0; i < miArray.size(); i++) {
            System.out.println(miArray.get(i));
        }
        
    }
}

