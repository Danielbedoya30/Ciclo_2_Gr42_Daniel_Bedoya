/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_daniel_bedoya;

import model_pkg.Conexion;
import views_pkg.Frame_principal;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conexion inst_conn = new Conexion();
        Frame_principal inst_frame = new Frame_principal();
       	inst_conn.getConnection();
        inst_frame.setVisible(true);
    }
    
}
