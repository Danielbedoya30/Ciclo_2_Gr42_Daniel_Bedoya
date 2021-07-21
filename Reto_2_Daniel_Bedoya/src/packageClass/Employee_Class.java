/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageClass;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Employee_Class extends Person_Class{
    
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

    private int salary;
    //Composicion de las clases
    private Job_Position_Class job_position;
    private Company_Class company;
    //Agregacion de las clases
    private Administrative_Employee_Class administrative;
   
    //Constructor vacio clase Employee_Class

    public Employee_Class() {
    }
    
    
    public Employee_Class(String name, String last_name, int id, String email, Company_Class company,Job_Position_Class job_position,int salary) {
        super(name, last_name, id, email);
        this.job_position = job_position;
        this.salary = salary;
        this.company = company;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the job_position
     */
    public Job_Position_Class getJob_position() {
        return job_position;
    }

    /**
     * @param job_position the job_position to set
     */
    public void setJob_position(Job_Position_Class job_position) {
        this.job_position = job_position;
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

    /**
     * @return the administrative
     */
    public Administrative_Employee_Class getAdministrative() {
        return administrative;
    }

    /**
     * @param administrative the administrative to set
     */
    public void setAdministrative(Administrative_Employee_Class administrative) {
        this.administrative = administrative;
    }
 
    //Creacion del CRUD y el menu de opciones de la Employee_Class
    
    public void crud_employees(){
        //Ingreso datos por "quemado" de la compañia relacion de composicion
        Company_Class inst_company = new Company_Class("MINTIC","90002873-1" , "Medellin");
        //Ingreso datos por "quemado" de la clase cargo
        //Job_Position_Class job = new Job_Position_Class("Ingeniero", "Gerencia");
       ArrayList<Employee_Class> employee_list = new ArrayList <>();
       ArrayList<Job_Position_Class> job_list = new ArrayList <> ();
       
        System.out.println(ANSI_PURPLE + " Bienvenido a la clase Empleado MINTIC " + ANSI_RESET );
        boolean exit_menu = false;
        while (!exit_menu){
            System.out.println(ANSI_CYAN + "¡¡¡¡¡¡¡¡¡¡¡WELCOME !!!!!!" + ANSI_RESET);
            
            System.out.println(ANSI_BLUE + " Por favor seleccione una de las siguientes opciones " + ANSI_RESET);
            System.out.println(ANSI_RED + "!Tega en cuenta que primero debe crearse la lista! " + ANSI_RESET );
            System.out.println(ANSI_BLUE + "   1." + ANSI_RESET + "Crear empleado");
            System.out.println(ANSI_BLUE + "   2." + ANSI_RESET + "Consultar empleado");
            System.out.println(ANSI_BLUE + "   3." + ANSI_RESET + "Editar empleado");
            System.out.println(ANSI_BLUE + "   4." + ANSI_RESET + "Eliminar empleado");
            System.out.println(ANSI_RED + "   5." + ANSI_RESET + "SALIR");
            System.out.println(ANSI_BLUE+ " Ingresa tu respuesta " + ANSI_RESET );
            int opcion =Integer.parseInt(ingreso_datos.nextLine());
           switch(opcion){
               case 1:
                   
                   System.out.println(ANSI_BLUE + " Ingrese el numero de empleados que desea registrar " + ANSI_RESET );
                   int num_employees =Integer.parseInt(ingreso_datos.nextLine());
                   System.out.println(ANSI_PURPLE + " Formulario Registro Empleados MINTIC " + ANSI_RESET );
                   for (int i = 0; i < num_employees; i++) {
                       System.out.println(ANSI_PURPLE + " \\\\\\Empleado/////: " + i + ANSI_RESET );
                       
                       System.out.println(ANSI_BLUE+ "Nombre: " + ANSI_RESET );
                       String name = ingreso_datos.nextLine();
                       
                       System.out.println(ANSI_BLUE+ "Apellido: " + ANSI_RESET);
                        String last_name = ingreso_datos.nextLine();
                        
                       System.out.println(ANSI_BLUE+ "Numero identificacion: " + ANSI_RESET);
                        int id = Integer.parseInt(ingreso_datos.nextLine());
                        
                       System.out.println(ANSI_BLUE+ "Correo electronico: " + ANSI_RESET);
                        String email = ingreso_datos.nextLine();
                        
                        System.out.println(ANSI_BLUE + "Cargo" + ANSI_RESET);
                        String cargo = ingreso_datos.nextLine();
                        
                        System.out.println(ANSI_BLUE + "Jerarquia" + ANSI_RESET);
                        String jerarquia = ingreso_datos.nextLine();
                        
                        
                       System.out.println(ANSI_BLUE+ "Salario: " + ANSI_RESET);
                        int salario = Integer.parseInt(ingreso_datos.nextLine()); 
                        
                        Job_Position_Class job = new Job_Position_Class(cargo, jerarquia);
                        job_list.add(job);
                        
                        Employee_Class employee = new Employee_Class(name, last_name, id, email, inst_company, job, salario);
                        employee_list.add(employee);
                        System.out.println(ANSI_CYAN + " \\\\\\ Empleado Registrado con exito /////// " +  ANSI_RESET );
                   }
                   break;
               case 2:
                   System.out.println(ANSI_PURPLE + " Base de datos empleados " +  ANSI_RESET );
                   for (int i = 0; i < employee_list.size(); i++) {
                        System.out.println(ANSI_BLUE + " Empleado " + (i+1)+ ANSI_RESET );
                       Employee_Class employee = employee_list.get(i);
                       Job_Position_Class job = job_list.get(i);
                       System.out.println(ANSI_GREEN + "Nombre: " + ANSI_RESET + employee.getName());
                       System.out.println(ANSI_GREEN + "Apellido: " + ANSI_RESET + employee.getLast_name());
                       System.out.println(ANSI_GREEN + "Numero identificacion: " + ANSI_RESET + employee.getId());
                       System.out.println(ANSI_GREEN + "Correo electronico: " + ANSI_RESET + employee.getEmail());
                       System.out.println(ANSI_GREEN + "Compañia: " + ANSI_RESET + inst_company.getCompany_name());
                       System.out.println(ANSI_GREEN + "NIT: " + ANSI_RESET + inst_company.getNit());
                       System.out.println(ANSI_GREEN + "Direccion: " + ANSI_RESET + inst_company.getCompany_adress());
                       System.out.println(ANSI_GREEN + "Cargo: " + ANSI_RESET + job.getPosition_name());
                       System.out.println(ANSI_GREEN + "Nivel jerarquico: " + ANSI_RESET + job.getHierarchy_level()); 
                       System.out.println(ANSI_GREEN + "Salario: " + ANSI_RESET + employee.getSalary()); 
                       System.out.println(ANSI_PURPLE + "--------------------------------------------" + ANSI_RESET);
                   } 
                   break;
               case 3:
                   System.out.println(ANSI_PURPLE + " Edicion de la informacion de los empleados " +  ANSI_RESET );
                   System.out.println(ANSI_BLUE + "Por favor ingrese la posicion del empleado que desea editar " +  ANSI_RESET );
                   int indice = Integer.parseInt(ingreso_datos.nextLine());
                   if (indice >= 0 && indice <= employee_list.size()){
                       Employee_Class employee =employee_list.get(indice);
                       Job_Position_Class job = job_list.get(indice);
                       System.out.println(ANSI_BLUE + " Informacion actual en la base de datos " +  ANSI_RESET );
                       System.out.println(ANSI_GREEN + "Nombre: " + ANSI_RESET + employee.getName());
                       System.out.println(ANSI_GREEN + "Apellido: " + ANSI_RESET + employee.getLast_name());
                       System.out.println(ANSI_GREEN + "Numero identificacion: " + ANSI_RESET + employee.getId());
                       System.out.println(ANSI_GREEN + "Correo electronico: " + ANSI_RESET + employee.getEmail());
                       System.out.println(ANSI_GREEN + "Compañia: " + ANSI_RESET + inst_company.getCompany_name());
                       System.out.println(ANSI_GREEN + "NIT: " + ANSI_RESET + inst_company.getNit());
                       System.out.println(ANSI_GREEN + "Direccion: " + ANSI_RESET + inst_company.getCompany_adress());
                       System.out.println(ANSI_GREEN + "Cargo: " + ANSI_RESET + job.getPosition_name());
                       System.out.println(ANSI_GREEN + "Nivel jerarquico: " + ANSI_RESET + job.getHierarchy_level());
                       System.out.println(ANSI_GREEN + "Salario: " + ANSI_RESET + employee.getSalary()); 
                       
                       System.out.println(ANSI_BLUE + "Que desea editar de " + employee.getName() + ":\n" + "1.Nombre\n  2.Apellido\n  3.Identifacion\n  4.Correo\n  5.Compañia\n  6.NIT\n  7.Direccion\n  8.Cargo\n  9.Nivel jerarquico\n  10.Salario "+ ANSI_RESET);
                       int opcion_edicion =Integer.parseInt(ingreso_datos.nextLine());
                       switch(opcion_edicion){
                           case 1:
                               System.out.println(ANSI_CYAN + "Nombre nuevo" +  ANSI_RESET );
                               String name = ingreso_datos.nextLine();
                               employee.setName(name);
                               break;
                           case 2:
                               System.out.println(ANSI_CYAN + "Apellido nuevo" +  ANSI_RESET );
                               String last_name = ingreso_datos.nextLine();
                               employee.setLast_name(last_name);
                               break;
                           case 3:
                               System.out.println(ANSI_CYAN + "Numero nuevo de identifacion" +  ANSI_RESET );
                               int id =Integer.parseInt(ingreso_datos.nextLine());
                               employee.setId(id);
                               break;
                           case 4:
                               System.out.println(ANSI_CYAN + "Correo nuevo" +  ANSI_RESET );
                               String email = ingreso_datos.nextLine();
                               employee.setEmail(email);
                               break;
                           case 5:
                               System.out.println(ANSI_CYAN + "Nombre nueva compania" +  ANSI_RESET );
                               String compania = ingreso_datos.nextLine();
                               inst_company.setCompany_name(compania);
                               break;
                           case 6:
                               System.out.println(ANSI_CYAN + "Nuevo NIT" +  ANSI_RESET );
                               String nit = ingreso_datos.nextLine();
                               inst_company.setCompany_adress(nit);
                               break;
                           case 7:
                               System.out.println(ANSI_CYAN + "Nueva direccion de la compañia " +  ANSI_RESET);
                               String company_name = ingreso_datos.nextLine();
                               inst_company.setCompany_adress(company_name); 
                               break;
                           case 8:
                               System.out.println(ANSI_CYAN + "Cargo nuevo " +  ANSI_RESET);
                               String position_name = ingreso_datos.nextLine();
                               job.setPosition_name(position_name);
                               break;
                           case 9:
                               System.out.println(ANSI_CYAN + "Nuevo nivel jerarquico " +  ANSI_RESET);
                               String hierarchy_level = ingreso_datos.nextLine();
                               job.setHierarchy_level(hierarchy_level);
                               break;
                           case 10:
                               System.out.println(ANSI_CYAN + "Nuevo salario " +  ANSI_RESET);
                               int salario = Integer.parseInt(ingreso_datos.nextLine());
                               employee.setSalary(salario);
                               break;
                           default:
                               System.out.println(ANSI_RED+ "!!!!!!!!!!!!!!!Opcion invalida!!!!!!!!!!!!!!!!!!" +  ANSI_RESET);
                               
                       }
                       System.out.println(ANSI_YELLOW + "**********Informacion actualizada*********" +  ANSI_RESET);
                   }
                   break;
               case 4:
                   System.out.println(ANSI_PURPLE+ "Eliminacion de datos" +  ANSI_RESET);
                   System.out.println(ANSI_BLUE+ "Ingrese el indice del empleado que desea retirar " +  ANSI_RESET);
                   int indice_remover = Integer.parseInt(ingreso_datos.nextLine());
                   if(indice_remover >= 0 && indice_remover <=employee_list.size() ){
                     Employee_Class employee = employee_list.get(indice_remover);
                     Job_Position_Class job = job_list.get(indice_remover);
                     System.out.println(ANSI_RED + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + ANSI_RESET);
                     System.out.println(ANSI_GREEN + "Empleado: " +  ANSI_RESET + employee.getName() + " " + employee.getLast_name());
                     System.out.println(ANSI_GREEN + "Numero de identificacion: " +  ANSI_RESET + " " + employee.getId());
                     System.out.println(ANSI_RED + "Esta seguro que desea prescindir de los sevicios de: " + ANSI_RESET + employee.getName());
                     System.out.println(ANSI_BLUE + "Ingrese su respuesta (SI) o (NO)");
                     String delete =ingreso_datos.nextLine();
                     if(delete.toUpperCase().equals("SI") || delete.toUpperCase().equals("SÍ")){
                         employee_list.remove(indice_remover);
                         job_list.remove(indice_remover);
                     }else{
                         System.out.println(ANSI_YELLOW + "¡¡¡¡¡¡¡¡¡¡¡Proceso cancelado!!!!!!!!!!" + ANSI_RESET );
                     }
                       System.out.println(ANSI_PURPLE + "*******Base de Datos actualizada******* " + ANSI_RESET);
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
        
        
    
        
   
        
   
        
    
    

