/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

/**
 *
 * @author Alex
 */
public abstract class AbstractEmployee {
    
    private String firstName, lastName, position;
    private int age;
    
    
    public AbstractEmployee(){
       
    }
    
    public String getFullName(){
        return firstName + " " + lastName;
    }
    
    public String getPosition(){
        return position;
    }
    
    public int getAge(){
        return age;
    }
    
}
