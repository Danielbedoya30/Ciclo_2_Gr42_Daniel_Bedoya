/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Daniel
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Probando Java");
        String nombre="Daniel";
        int edad=30;
        System.out.println("Hola tu nombre es:" + nombre + " Tu edad es:"+ edad + " años");
        if(edad>18){
            System.out.println(" El usuario es mayor de edad");
            
        }else{
            System.out.println(" La persona es menor de edad");
        }
        //Prueba del ciclo for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Hola "+ i);
            
        }
        
        
    }
    
}
