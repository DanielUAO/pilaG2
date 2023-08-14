/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import modelo.Base;
/**
 *
 * @author daniel_alberto.paz
 */
public class Producto extends Base{

    private String nombreProducto;
    private String codigoProducto;
    private double valorProducto;

    public Producto() {
    }

    public Producto(String nombreProducto, String codigoProducto, double valorProducto) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.valorProducto = valorProducto;
    }
    

    /**
     * Get the value of codigoProducto
     *
     * @return the value of codigoProducto
     */
    public String getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Set the value of codigoProducto
     *
     * @param codigoProducto new value of codigoProducto
     */
    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    /**
     * Get the value of valorProducto
     *
     * @return the value of valorProducto
     */
    public double getValorProducto() {
        return valorProducto;
    }

    /**
     * Set the value of valorProducto
     *
     * @param valorProducto new value of valorProducto
     */
    public void setValorProducto(double valorProducto) {
        this.valorProducto = valorProducto;
    }

    /**
     * Get the value of nombreProducto
     *
     * @return the value of nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Set the value of nombreProducto
     *
     * @param nombreProducto new value of nombreProducto
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public String toString() {
        return nombreProducto + ", " + codigoProducto + ", " + valorProducto + ", ";
    }

    @Override
    public Base copy() {
        return new Producto(nombreProducto,codigoProducto, valorProducto);
        
    }
    

}
