/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author Alex
 */
public interface EmployeeInterface {
    
    public abstract void setFirstName(String firstName);
    
    public abstract String getFirstName();
    
    public abstract void setLastName(String lastName);
    
    public abstract String getLastName();
    
    public abstract void setPosition(String position);
    
    public abstract String getPosition();
    
    public abstract double getBiWeeklyEarnings();
    
}
