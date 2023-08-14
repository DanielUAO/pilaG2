/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.Cliente;
import datos.Producto;
import modelo.Cola;
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
        
        Cola<Cliente> colaC1 = new Cola<>();
        colaC1.encolar(new Cliente("Carlos", "34563456", 1697));
        colaC1.encolar(new Cliente("David", "3005798654", 2201675));
        colaC1.encolar(new Cliente("Daniela", "3135673245", 2186754));
        
        System.out.println("Cola Original"+ colaC1.toString());
        
        colaC1.desencolar();
        
        System.out.println("Cola modificada" + colaC1.toString());
    }
    
}
