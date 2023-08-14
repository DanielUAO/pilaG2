/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Producto;
import modelo.Pila;

/**
 *
 * @author daniel_alberto.paz
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Pila<Producto> pilaP1 = new Pila<>();
        pilaP1.apilar(new Producto("Arroz", "3456", 1500));
        pilaP1.apilar(new Producto("Maiz", "2233", 2000));
        pilaP1.apilar(new Producto("Papa", "5678", 2500));
        System.out.println("Pila Original"+ pilaP1.toString());
        
        pilaP1.desapilar();
        
        System.out.println("Pila modificada" + pilaP1.toString());
    }
    
}
