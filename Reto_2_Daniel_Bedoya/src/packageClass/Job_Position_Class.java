/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageClass;


import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Job_Position_Class {
    
    private String position_name;
    private String  hierarchy_level;

    public Job_Position_Class(String position_name, String hierarchy_level) {
        this.position_name = position_name;
        this.hierarchy_level = hierarchy_level;
    }
    
    

    /**
     * @return the position_name
     */
    public String getPosition_name() {
        return position_name;
    }

    /**
     * @param position_name the position_name to set
     */
    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }

    /**
     * @return the hierarchy_level
     */
    public String getHierarchy_level() {
        return hierarchy_level;
    }

    /**
     * @param hierarchy_level the hierarchy_level to set
     */
    public void setHierarchy_level(String hierarchy_level) {
        this.hierarchy_level = hierarchy_level;
    }

              
    }

