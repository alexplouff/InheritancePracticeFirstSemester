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
    
    public abstract String firstName(String firstName);
    
    public abstract String lastName(String lastName);
    
    public abstract String position(String position);
    
    public abstract double biWeeklyEarnings();
    
    public abstract double monthlyEarnings();

    public abstract double yearlyEarnings();
    
}
