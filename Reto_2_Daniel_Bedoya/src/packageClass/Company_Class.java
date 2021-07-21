/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageClass;

/**
 *
 * @author Daniel
 */
public class Company_Class {
    private String company_name;
    private String nit;
    private String company_adress;

    public Company_Class(String company_name, String nit, String company_adress) {
        this.company_name = company_name;
        this.nit = nit;
        this.company_adress = company_adress;
    }
    
    

    /**
     * @return the company_name
     */
    public String getCompany_name() {
        return company_name;
    }

    /**
     * @param company_name the company_name to set
     */
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the company_adress
     */
    public String getCompany_adress() {
        return company_adress;
    }

    /**
     * @param company_adress the company_adress to set
     */
    public void setCompany_adress(String company_adress) {
        this.company_adress = company_adress;
    }
    
    
            
}
