/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;

/**
 *
 * @author daniel_alberto.paz
 */
public class Pila <T extends Base> {
    private LinkedList<T> tope;
    
    public Pila(){
    tope = new LinkedList<>();
    }
    
    public void apilar (T elemento){
    
    tope.addFirst(elemento);
    }
    
    public T desapilar() {
    return tope.removeFirst();
    
    }
    
    public boolean estaVacia(){
    return tope.isEmpty();
    
    }
    
    public String toString(){
    StringBuilder sb = new StringBuilder("{");
    for(T elemento: tope){
    
    sb.append("").append(elemento.toString());
    }
    sb.append("");
    return sb.toString();
    }
}
