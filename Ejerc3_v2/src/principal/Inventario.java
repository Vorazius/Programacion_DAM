/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import ejerc3.Canario;
import ejerc3.Gato;
import ejerc3.Loro;
import ejerc3.Mascota;
import ejerc3.Perro;
import java.util.ArrayList;

/**
 *
 * @author Jesús Pérez
 */
public class Inventario {
    private ArrayList<Mascota> animales=new ArrayList<Mascota>();
    
    //Método privado que indica el tipo de animal al que pertenece la instancia
    private String getTipoMascota(Mascota m) {
        if (m instanceof Perro) 
            return "Perro";
         else 
            if (m instanceof Gato) 
                return "Gato";
             else 
                if (m instanceof Loro) 
                    return "Loro";
                 else 
                    if (m instanceof Canario) 
                        return "Canario";
                     else 
                        return null;
    }//getTipoMascota()
    
    //Mostrar la lista de todos los animales (sólo tipo y nombre, 1 línea por animal)
    public void mostrarListaAnimales(){
        System.out.println("LISTA DE ANIMALES:");
        for (int i = 0; i < animales.size(); i++) {
            Mascota m=animales.get(i);
            System.out.println(i+". "+getTipoMascota(m)+" "+m.getNombre()+"\n");
        }//for        
    }//mostrarListaAnimales()
    
    
    //Mostrar todos los datos de un animal concreto
    public void mostrarUnAnimal(int indice){
        if (indice>=0&&indice<animales.size()) {
            System.out.println("Animal "+indice);
            animales.get(indice).mostrar();
        } else {
            System.out.println("El animal no existe");
        }
    }//mostrarUnAnimal()
    
    //Mostrar todos los datos de todos los animales
    public void mostrarTodosAnimales(){
        for (int i = 0; i < animales.size(); i++) {
            mostrarUnAnimal(i);
            System.out.println("");
        }
    }
    
    //Insertar animales en el inventario
    public void insertarAnimal(Mascota m){
        animales.add(m);
    }//insertarAnimal()
    
    //Eliminar animales del inventario
    public void eliminarAnimal(int indice){
        if (indice>=0&&indice<animales.size()) {
            animales.remove(indice);
        } else {
            System.out.println("El animal no existe");
        }
    }//eliminarAnimal()
    
    //Vaciar el inventario
    public void vaciarInventario(){
        animales.clear();
    }//vaciarInventario()
    
}//class
