/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import view_pkg.Principal;

/**
 *
 * @author Daniel
 */
public class Practica_2_Daniel_Bedoya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDatosDB ins_model =new ModelDatosDB();
        ins_model.getProductDB(1);
        Principal frame = new Principal();
        frame.setVisible(true);
    }
    
}
