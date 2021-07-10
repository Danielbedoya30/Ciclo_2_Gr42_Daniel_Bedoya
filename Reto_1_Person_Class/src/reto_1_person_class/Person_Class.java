/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_1_person_class;

/**
 *
 * @author Daniel
 */
public class Person_Class {
    private String nombre;
    private String tipo_documento;
    private int numero_documento;
    private char genero;
    private String fecha_nacimiento;
    private String municipio_nacimiento;
    private String direccion;
    private int telefono;
    private String profesion;
    private String estado_civil;
    private boolean discapacidad;
    private boolean estudia_actualmente;
    private int cantidad_hijos;

    public Person_Class(String nombre, String tipo_documento, int numero_documento, char genero, String fecha_nacimiento, String municipio_nacimiento, String direccion, int telefono, String profesion, String estado_civil, boolean discapacidad, boolean estudia_actualmente, int cantidad_hijos) {
        this.nombre = nombre;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.municipio_nacimiento = municipio_nacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
        this.estado_civil = estado_civil;
        this.discapacidad = discapacidad;
        this.estudia_actualmente = estudia_actualmente;
        this.cantidad_hijos = cantidad_hijos;
    }
    
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo_documento
     */
    public String getTipo_documento() {
        return tipo_documento;
    }

    /**
     * @param tipo_documento the tipo_documento to set
     */
    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    /**
     * @return the numero_documento
     */
    public int getNumero_documento() {
        return numero_documento;
    }

    /**
     * @param numero_documento the numero_documento to set
     */
    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }

    /**
     * @return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * @return the municipio_nacimiento
     */
    public String getMunicipio_nacimiento() {
        return municipio_nacimiento;
    }

    /**
     * @param municipio_nacimiento the municipio_nacimiento to set
     */
    public void setMunicipio_nacimiento(String municipio_nacimiento) {
        this.municipio_nacimiento = municipio_nacimiento;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * @return the estado_civil
     */
    public String getEstado_civil() {
        return estado_civil;
    }

    /**
     * @param estado_civil the estado_civil to set
     */
    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    /**
     * @return the discapacidad
     */
    public boolean isDiscapacidad() {
        return discapacidad;
    }

    /**
     * @param discapacidad the discapacidad to set
     */
    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    /**
     * @return the estudia_actualmente
     */
    public boolean isEstudia_actualmente() {
        return estudia_actualmente;
    }

    /**
     * @param estudia_actualmente the estudia_actualmente to set
     */
    public void setEstudia_actualmente(boolean estudia_actualmente) {
        this.estudia_actualmente = estudia_actualmente;
    }

    /**
     * @return the cantidad_hijos
     */
    public int getCantidad_hijos() {
        return cantidad_hijos;
    }

    /**
     * @param cantidad_hijos the cantidad_hijos to set
     */
    public void setCantidad_hijos(int cantidad_hijos) {
        this.cantidad_hijos = cantidad_hijos;
    }
        // Funcion para consultar la informacion
    public String consulta_informacion() {
        String discapacidad_persona;
        //Se asigna un mensaje a una variable segun el boolean que se ingresa para tener una mejor presentacion al usuario
        if (isDiscapacidad() == true) {
            discapacidad_persona = " tiene una discapacidad";
        } else {
            discapacidad_persona = " no tiene ninguna discapacidad";
        }
        String estudiante;
        if (isEstudia_actualmente() == true){
            estudiante=" es estudiante";
            
        }else{
            estudiante=" no esta estudiando";
        }
        
            
        return "Se presenta acontinuacion la informacion de: " + getNombre() + "\n" + "\n   >>>>> " + getTipo_documento() + " " + getNumero_documento() + " \n   >>>>> Genero: " + getGenero() + "\n   >>>>> Fecha de nacimiento: " + getFecha_nacimiento()
                + "\n   >>>>> Municipio de nacimiento: " + getMunicipio_nacimiento() + "\n   >>>>> Direccion: " + getDireccion() + "\n   >>>>> Telefono: " + getTelefono() + "\n   >>>>> Profesion: " + getProfesion() + "\n   >>>>> Estado civil: " + getEstado_civil() + "\n   >>>>> " + getNombre() + discapacidad_persona
                + "\n   >>>>> " + getNombre() + estudiante + "\n   >>>>> " + getNombre() + " tienene " + getCantidad_hijos() + " hijos";

    }

        //<<<<<<Utilizacion de un metodo para cosultar la informacion>>>>>>
    
    public void consultar_informacion_metodo(){
        System.out.println("\n\n Utilizando un metodo para consultar la informacion \n");
        String discapacidad_persona;
        //Se asigna un mensaje a una variable segun el boolean que se ingresa para tener una mejor presentacion al usuario
        if (isDiscapacidad() == true) {
            discapacidad_persona = " tiene una discapacidad";
        } else {
            discapacidad_persona = " no tiene ninguna discapacidad";
        }
        String estudiante;
        if (isEstudia_actualmente() == true){
            estudiante=" es estudiante";
            
        }else{
            estudiante=" no esta estudiando";
        }
        
        System.out.println("Se presenta acontinuacion la informacion de: " + getNombre() + "\n" + "\n   >>>>> " + getTipo_documento() + " " + getNumero_documento() + " \n   >>>>> Genero: " + getGenero() + "\n   >>>>> Fecha de nacimiento: " + getFecha_nacimiento()
                + "\n   >>>>> Municipio de nacimiento: " + getMunicipio_nacimiento() + "\n   >>>>> Direccion: " + getDireccion() + "\n   >>>>> Telefono: " + getTelefono() + "\n   >>>>> Profesion: " + getProfesion() + "\n   >>>>> Estado civil: " + getEstado_civil() + "\n   >>>>> " + getNombre() + discapacidad_persona
                + "\n   >>>>> " + getNombre() + estudiante + "\n   >>>>> " + getNombre() + " tienene " + getCantidad_hijos() + " hijos");
        
    }


}
