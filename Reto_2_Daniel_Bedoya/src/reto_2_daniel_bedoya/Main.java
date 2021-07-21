/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_2_daniel_bedoya;

import java.util.Scanner;
import packageClass.*;


/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    //Utilizada para obtener informacion por el usuario
    private static Scanner ingreso_datos = new Scanner(System.in);
    //Utilizados para cambiar de color al texto mostrado en pantalla
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    
    public static void main(String[] args) {
        Employee_Class employee =new Employee_Class();
        Client_Class client =new Client_Class ();
        System.out.println(ANSI_PURPLE + " Bievenido al programa de clases del Reto 2" + ANSI_RESET);
        System.out.println(ANSI_BLUE + "Seleccione una de las siguientes opciones de ejecucion" + ANSI_RESET);
        System.out.println(ANSI_PURPLE +"1."+ ANSI_RESET + "Empleados");
        System.out.println(ANSI_PURPLE +"2."+ ANSI_RESET + "Clientes");
        System.out.println(ANSI_BLUE + "Por favor ingrese su opcion: "+ ANSI_RESET);
        int opcion =Integer.parseInt(ingreso_datos.nextLine());
        
       switch(opcion){
           case 1:
               employee.crud_employees();
               break;
           case 2:
               client.crud_client();
               break;
           default:
                 System.out.println(ANSI_RED + "¡¡¡¡¡¡¡¡¡¡¡¡¡Opcion invalida!!!!!!!!!!!!!!"+ ANSI_RESET);
       }
        
        
        
    }
   
}
