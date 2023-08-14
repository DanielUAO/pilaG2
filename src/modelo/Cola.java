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
public class Cola <T extends Base> {
    
    private LinkedList<T> elems;

    public Cola() {
        elems = new LinkedList<>(); 
    }
    
    public void encolar(T elemento){ 
    elems.addLast(elemento);
    }
    
    public T desencolar(){ 
    return elems.removeFirst();
    }
    
    public boolean estaVacio(){ 
    return elems.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
    for(T elemento: elems){
    
    sb.append("").append(elemento.toString());
    }
    sb.append("");
    return sb.toString();
    }
    
}
