/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageClass;

/**
 *
 * @author Daniel
 */
public class CuentaClass {
    
    private int numero_tarjeta;
    private int monto_disponible;
    private ClientClass clientes;
    private CuentaClass cuenta;

    public CuentaClass() {
    }

    public CuentaClass(int numero_tatjeta, int monto_disponible) {
        this.numero_tarjeta = numero_tatjeta;
        this.monto_disponible = monto_disponible;
       
    }

    

    
    /**
     * @return the monto_disponible
     */
    public int getMonto_disponible() {
        return monto_disponible;
    }

    /**
     * @param monto_disponible the monto_disponible to set
     */
    public void setMonto_disponible(int monto_disponible) {
        this.monto_disponible = monto_disponible;
    }

    /**
     * @return the numero_tarjeta
     */
    public int getNumero_tarjeta() {
        return numero_tarjeta;
    }

    /**
     * @param numero_tarjeta the numero_tarjeta to set
     */
    public void setNumero_tarjeta(int numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    /**
     * @return the clientes
     */
    public ClientClass getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(ClientClass clientes) {
        this.clientes = clientes;
    }

    /**
     * @return the cuenta
     */
    public CuentaClass getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(CuentaClass cuenta) {
        this.cuenta = cuenta;
    }
}
