/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1_persona_class;

import java.text.SimpleDateFormat;
import java.util.Date;
   
/**
 *
 * @author Daniel
 */
public class Reto1_Persona_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciando la clase Date para trabajar con fechas en este caso para practica se pone como fecha de nacimiento la fecha actual
        Date inst_fecha_hoy = new Date();
        // Modificacion de la fecha acutal a una forma mas simple
        SimpleDateFormat inst_cambiar_formato = new SimpleDateFormat("dd/MM/yyyy");
        // Instaciando  la clase persona
        Persona_Class inst_persona = new Persona_Class("Daniel", "C.C", 105034343, 'M', inst_cambiar_formato.format(inst_fecha_hoy), "Medellin ", "Calle 10 Sur #11-17", 5411764, "Ingeniero", "Soltero", false, true, 0);
        System.out.println(inst_persona.consulta_informacion());

        //Utilizando un metodo para consultar la informacion
        inst_persona.consultar_informacion_metodo();

    }

}
