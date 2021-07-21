/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageClass;

import java.util.ArrayList;
import java.util.Scanner;
import static packageClass.Employee_Class.ANSI_BLUE;
import static packageClass.Employee_Class.ANSI_CYAN;
import static packageClass.Employee_Class.ANSI_GREEN;
import static packageClass.Employee_Class.ANSI_PURPLE;
import static packageClass.Employee_Class.ANSI_RED;
import static packageClass.Employee_Class.ANSI_RESET;
import static packageClass.Employee_Class.ANSI_YELLOW;

/**
 *
 * @author Daniel
 */
public class Client_Class extends Person_Class{
    
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
    //Atributos propios de la clase
    private String address;
    private String phone_number;
    //Agregacion de la clase Company
    private Company_Class company;

    //Constructor vacio Client_Class
    public Client_Class() {
    }
    
   
    public Client_Class(String name, String last_name, int id, String email, String address, String phone_number) {
        super(name, last_name, id, email);
        this.address = address;
        this.phone_number = phone_number;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone_number
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * @param phone_number the phone_number to set
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * @return the company
     */
    public Company_Class getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(Company_Class company) {
        this.company = company;
    }

    // Creacion del CRUD Para los clientes 
    public void crud_client(){
        
        ArrayList<Client_Class> client_list = new ArrayList <>(); 
        System.out.println(ANSI_PURPLE + " Bienvenido a la clase Cliente MINTIC " + ANSI_RESET );
        boolean exit_menu = false;
        while (!exit_menu){
            System.out.println(ANSI_CYAN + "¡¡¡¡¡¡¡¡¡¡¡WELCOME !!!!!!" + ANSI_RESET);
            
            System.out.println(ANSI_BLUE + " Por favor seleccione una de las siguientes opciones " + ANSI_RESET);
            System.out.println(ANSI_RED + "!Tega en cuenta que primero debe crearse la lista! " + ANSI_RESET );
            System.out.println(ANSI_BLUE + "   1." + ANSI_RESET + "Crear cliente");
            System.out.println(ANSI_BLUE + "   2." + ANSI_RESET + "Consultar cliente");
            System.out.println(ANSI_BLUE + "   3." + ANSI_RESET + "Editar cliente");
            System.out.println(ANSI_BLUE + "   4." + ANSI_RESET + "Eliminar cliente");
            System.out.println(ANSI_RED + "   5." + ANSI_RESET + "SALIR");
            System.out.println(ANSI_BLUE+ " Ingresa tu respuesta " + ANSI_RESET );
            int opcion =Integer.parseInt(ingreso_datos.nextLine());
            switch(opcion){
               case 1:
                   
                   System.out.println(ANSI_BLUE + " Ingrese el numero de clientes que desea registrar " + ANSI_RESET );
                   int num_employees =Integer.parseInt(ingreso_datos.nextLine());
                   System.out.println(ANSI_PURPLE + " Formulario Registro Clietes  MINTIC " + ANSI_RESET );
                   for (int i = 0; i < num_employees; i++) {
                       System.out.println(ANSI_PURPLE + " \\\\\\Cliente/////: " + i + ANSI_RESET );
                       
                       System.out.println(ANSI_BLUE+ "Nombre: " + ANSI_RESET );
                       String name = ingreso_datos.nextLine();
                       
                       System.out.println(ANSI_BLUE+ "Apellido: " + ANSI_RESET);
                        String last_name = ingreso_datos.nextLine();
                        
                       System.out.println(ANSI_BLUE+ "Numero identificacion: " + ANSI_RESET);
                        int id = Integer.parseInt(ingreso_datos.nextLine());
                        
                       System.out.println(ANSI_BLUE+ "Correo electronico: " + ANSI_RESET);
                        String email = ingreso_datos.nextLine();
                        
                       System.out.println(ANSI_BLUE+ "Direccion: " + ANSI_RESET);
                        String direccion = ingreso_datos.nextLine(); 
                        
                       System.out.println(ANSI_BLUE+ "Numero de telefono: " + ANSI_RESET);
                        String telefono = ingreso_datos.nextLine();  
                        
                        Client_Class client = new Client_Class(name, last_name, id, email, direccion, telefono);
                        client_list.add(client);
                        System.out.println(ANSI_CYAN + " \\\\\\ Cliente Registrado con exito /////// " +  ANSI_RESET );
                   }
                   break;
               case 2:
                   System.out.println(ANSI_PURPLE + " Base de datos clientes " +  ANSI_RESET );
                   for (int i = 0; i < client_list.size(); i++) {
                        System.out.println(ANSI_BLUE + " Cliente " + (i+1)+ ANSI_RESET );
                       Client_Class client = client_list.get(i);
                       System.out.println(ANSI_GREEN + "Nombre: " + ANSI_RESET + client.getName());
                       System.out.println(ANSI_GREEN + "Apellido: " + ANSI_RESET + client.getLast_name());
                       System.out.println(ANSI_GREEN + "Numero identificacion: " + ANSI_RESET + client.getId());
                       System.out.println(ANSI_GREEN + "Correo electronico: " + ANSI_RESET + client.getEmail());
                       System.out.println(ANSI_GREEN + "Direccion: " + ANSI_RESET + client.getAddress());
                       System.out.println(ANSI_GREEN + "Numero de telefono: " + ANSI_RESET + client.getPhone_number());
                       System.out.println(ANSI_PURPLE+ "-------------------------------" + ANSI_RESET);
                       
                   } 
                           
                   break;
               case 3:
                   System.out.println(ANSI_PURPLE + " Edicion de la informacion de los clientes " +  ANSI_RESET );
                   System.out.println(ANSI_BLUE + "Por favor ingrese la posicion del cleinte que desea editar " +  ANSI_RESET );
                   int indice = Integer.parseInt(ingreso_datos.nextLine());
                   if (indice >= 0 && indice <= client_list.size()){
                       Client_Class client =client_list.get(indice);
                       System.out.println(ANSI_BLUE + " Informacion actual en la base de datos " +  ANSI_RESET );
                       System.out.println(ANSI_GREEN + "Nombre: " + ANSI_RESET + client.getName());
                       System.out.println(ANSI_GREEN + "Apellido: " + ANSI_RESET + client.getLast_name());
                       System.out.println(ANSI_GREEN + "Numero identificacion: " + ANSI_RESET + client.getId());
                       System.out.println(ANSI_GREEN + "Correo electronico: " + ANSI_RESET + client.getEmail());
                       System.out.println(ANSI_GREEN + "Direccion: " + ANSI_RESET + client.getAddress());
                       System.out.println(ANSI_GREEN + "Numero de telefono: " + ANSI_RESET + client.getPhone_number()); 
                       
                       System.out.println(ANSI_BLUE + "Que desea editar de: " +client.getName()+ "\n" + "1.Nombre\n  2.Apellido\n  3.Identifacion\n  4.Correo\n  5.Direccion\n  6.Numero de telefono\n" + ANSI_RESET);
                       int opcion_edicion =Integer.parseInt(ingreso_datos.nextLine());
                       switch(opcion_edicion){
                           case 1:
                               System.out.println(ANSI_CYAN + "Nombre nuevo" +  ANSI_RESET );
                               String name = ingreso_datos.nextLine();
                               client.setName(name);
                               break;
                           case 2:
                               System.out.println(ANSI_CYAN + "Apellido nuevo" +  ANSI_RESET );
                               String last_name = ingreso_datos.nextLine();
                               client.setLast_name(last_name);
                               break;
                           case 3:
                               System.out.println(ANSI_CYAN + "Numero nuevo de identifacion" +  ANSI_RESET );
                               int id =Integer.parseInt(ingreso_datos.nextLine());
                               client.setId(id);
                               break;
                           case 4:
                               System.out.println(ANSI_CYAN + "Correo nuevo" +  ANSI_RESET );
                               String email = ingreso_datos.nextLine();
                               client.setEmail(email);
                               break;
                           case 5:
                               System.out.println(ANSI_CYAN + "Nueva direccion" +  ANSI_RESET );
                               String direccion = ingreso_datos.nextLine();
                               client.setAddress(direccion);
                               break;
                           case 6:
                               System.out.println(ANSI_CYAN + "Nuevo telefono" +  ANSI_RESET );
                               String telefono = ingreso_datos.nextLine();
                               client.setPhone_number(telefono);
                               break;
                           default:
                               System.out.println(ANSI_RED+ "!!!!!!!!!!!!!!!Opcion invalida!!!!!!!!!!!!!!!!!!" +  ANSI_RESET);
                               
                       }
                       System.out.println(ANSI_YELLOW + "**********Informacion actualizada*********" +  ANSI_RESET);
                   }
                   break;
               case 4:
                   System.out.println(ANSI_PURPLE+ "Eliminacion de datos" +  ANSI_RESET);
                   System.out.println(ANSI_BLUE+ "Ingrese el indice del cliente que desea retirar " +  ANSI_RESET);
                   int indice_remover = Integer.parseInt(ingreso_datos.nextLine());
                   if(indice_remover >= 0 && indice_remover <=client_list.size() ){
                     Client_Class client =client_list.get(indice_remover);
                     System.out.println(ANSI_RED + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + ANSI_RESET);
                     System.out.println(ANSI_GREEN + "Cliente: " +  ANSI_RESET + client.getName() + " " + client.getLast_name());
                     System.out.println(ANSI_GREEN + "Numero de identificacion: " +  ANSI_RESET + " " + client.getId());
                     System.out.println(ANSI_RED + "Esta seguro que desea retirar el client: " + ANSI_RESET + client.getName());
                     System.out.println(ANSI_BLUE + "Ingrese su respuesta (SI) o (NO)");
                     String delete =ingreso_datos.nextLine();
                     if(delete.toUpperCase().equals("SI") || delete.toUpperCase().equals("SÍ")){
                         client_list.remove(indice_remover);
                     }else{
                         System.out.println(ANSI_YELLOW + "¡¡¡¡¡¡¡¡¡¡¡Proceso cancelado!!!!!!!!!!" + ANSI_RESET );
                     }
                       System.out.println(ANSI_PURPLE + "*******Base de Datos Clientes actualizada******* " + ANSI_RESET);
                   }
                   break;
               case 5:
                    exit_menu = true;
                    System.out.println(ANSI_PURPLE + " Gracias por llevar a cabo este programa "+ ANSI_RESET);
                   break;
               default:
                      System.out.println(ANSI_RED + "**********Opcion invalida*********" + ANSI_RESET);
           }
        
                
    }
 
    
    }
}
    

