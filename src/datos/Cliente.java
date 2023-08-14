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
public class Cliente extends Base {

    private String nombreC;
    private String telefonoC;
    private double codigoC;

    public Cliente() {
    }

    public Cliente(String nombreC, String telefonoC, double codigoC) {
        this.nombreC = nombreC;
        this.telefonoC = telefonoC;
        this.codigoC = codigoC;
    }

    /**
     * Get the value of codigoC
     *
     * @return the value of codigoC
     */
    public double getCodigoC() {
        return codigoC;
    }

    /**
     * Set the value of codigoC
     *
     * @param codigoC new value of codigoC
     */
    public void setCodigoC(double codigoC) {
        this.codigoC = codigoC;
    }

    /**
     * Get the value of telefonoC
     *
     * @return the value of telefonoC
     */
    public String getTelefonoC() {
        return telefonoC;
    }

    /**
     * Set the value of telefonoC
     *
     * @param telefonoC new value of telefonoC
     */
    public void setTelefonoC(String telefonoC) {
        this.telefonoC = telefonoC;
    }

    /**
     * Get the value of nombreC
     *
     * @return the value of nombreC
     */
    public String getNombreC() {
        return nombreC;
    }

    /**
     * Set the value of nombreC
     *
     * @param nombreC new value of nombreC
     */
    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    @Override
    public String toString() {
        return nombreC + ", " + telefonoC + ", " + codigoC;
    }

    @Override
    public Base copy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
