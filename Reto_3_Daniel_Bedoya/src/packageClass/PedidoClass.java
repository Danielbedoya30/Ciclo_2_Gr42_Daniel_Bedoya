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
public class PedidoClass {
    
    private int codigo_pedido;
    private int cantidad_productos;
    private int valor_total;
    private String estado_pedido;
    private Linea_Producto linea;

    public PedidoClass(int codigo_pedido, int cantidad_productos, int valor_total, String estado_pedido) {
        this.codigo_pedido = codigo_pedido;
        this.cantidad_productos = cantidad_productos;
        this.valor_total = valor_total;
        this.estado_pedido = estado_pedido;
 
    }

    
    
    /**
     * @return the estado_pedido
     */
    public String getEstado_pedido() {
        return estado_pedido;
    }

    /**
     * @param estado_pedido the estado_pedido to set
     */
    public void setEstado_pedido(String estado_pedido) {
        this.estado_pedido = estado_pedido;
    }

    /**
     * @return the valor_total
     */
    public int getValor_total() {
        return valor_total;
    }

    /**
     * @param valor_total the valor_total to set
     */
    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
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
     * @return the cantidad_productos
     */
    public int getCantidad_productos() {
        return cantidad_productos;
    }

    /**
     * @param cantidad_productos the cantidad_productos to set
     */
    public void setCantidad_productos(int cantidad_productos) {
        this.cantidad_productos = cantidad_productos;
    }

    /**
     * @return the codigo_pedido
     */
    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    /**
     * @param codigo_pedido the codigo_pedido to set
     */
    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

   
}
