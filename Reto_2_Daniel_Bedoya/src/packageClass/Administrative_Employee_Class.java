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
public class  Administrative_Employee_Class extends Employee_Class{
    //Atributos propios de la clase
    private String category;
   private int num_subordinate;
   
    public Administrative_Employee_Class(String name, String last_name, int id, String email, Company_Class company, Job_Position_Class job_position, int salary,String category,int num_subordinate ) {
        super(name, last_name, id, email, company, job_position, salary);
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the num_subordinate
     */
    public int getNum_subordinate() {
        return num_subordinate;
    }

    /**
     * @param num_subordinate the num_subordinate to set
     */
    public void setNum_subordinate(int num_subordinate) {
        this.num_subordinate = num_subordinate;
    }
   
    }
    

