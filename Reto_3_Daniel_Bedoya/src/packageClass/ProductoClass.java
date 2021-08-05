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
public class ProductoClass {
   private int codigo_producto;
   private String nombre_producto;
   private int valor;
   private String  disponibilidad;
   private Linea_Producto linea;

    public ProductoClass(int codigo_producto, String nombre_producto, int valor, String disponibilidad) {
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.valor = valor;
        this.disponibilidad = disponibilidad;
       
    }

   
   
   

    /**
     * @return the codigo_producto
     */
    public int getCodigo_producto() {
        return codigo_producto;
    }

    /**
     * @param codigo_producto the codigo_producto to set
     */
    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    /**
     * @return the nombre_producto
     */
    public String getNombre_producto() {
        return nombre_producto;
    }

    /**
     * @param nombre_producto the nombre_producto to set
     */
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    

    

    /**
     * @return the linea
     */
    public Linea_Producto getLinea() {
        return linea;
    }

    /**
     * @param linea the linea to set
     */
    public void setLinea(Linea_Producto linea) {
        this.linea = linea;
    }

    /**
     * @return the disponibilidad
     */
    public String getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    
           
}
