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
public class HourlyEmployee implements EmployeeInterface {

    private String firstName, lastName, position;
    private double hourlyPayRate;

    
    //Setters
                                                    
    @Override
    public void setFirstName(String firstName) {    
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {      
        this.lastName = lastName;
    }

    @Override
    public void setPosition(String position) {      
        this.position = position;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    
    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
   
    //Over-ridden Methods
    @Override                               
    public String getFirstName(){
        
                return firstName;
    }
    
    @Override                               
    public String getLastName(){
        return lastName;
    }
    
    @Override                               
    public String getPosition(){
        return position;
    }
    
    @Override
    public double getBiWeeklyEarnings(){
        return hourlyPayRate * 80;
    }



}
