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
public class Linea_Producto {
    private String codigo_linea_producto;

    public Linea_Producto(String codigo_linea_producto) {
        this.codigo_linea_producto = codigo_linea_producto;
    }
    
    

    /**
     * @return the codigo_linea_producto
     */
    public String getCodigo_linea_producto() {
        return codigo_linea_producto;
    }

    /**
     * @param codigo_linea_producto the codigo_linea_producto to set
     */
    public void setCodigo_linea_producto(String codigo_linea_producto) {
        this.codigo_linea_producto = codigo_linea_producto;
    }
}
