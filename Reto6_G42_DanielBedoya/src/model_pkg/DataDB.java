/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

/**
 *
 * @author Daniel
 */
public class DataDB {
    private int idOwner;
    private String owner;
    private int id_hospital;
    private String hospital;


    public DataDB() {
        this.idOwner = 0;
        this.owner = "";
        this.id_hospital = 0;
        this.hospital = "";
    }

    /**
     * @return the idOwner
     */
    public int getIdOwner() {
        return idOwner;
    }

    /**
     * @param idOwner the idOwner to set
     */
    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return the id_hospital
     */
    public int getId_hospital() {
        return id_hospital;
    }

    /**
     * @param id_hospital the id_hospital to set
     */
    public void setId_hospital(int id_hospital) {
        this.id_hospital = id_hospital;
    }

    /**
     * @return the hospital
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    

}
