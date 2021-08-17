/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import model_pkg.Conexion;
import views_pkg.FrameHospital;

/**
 *
 * @author Daniel
 */
public class Reto6_G42_DanielBedoya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Conexion inst_connect = new Conexion();
        DataModelDB inst_data = new DataModelDB();
        FrameHospital inst_frame = new FrameHospital();
    
        inst_connect.getConnection();
        inst_frame.setVisible(true);
        inst_data.getOwners(1);

       

    }
    
}
