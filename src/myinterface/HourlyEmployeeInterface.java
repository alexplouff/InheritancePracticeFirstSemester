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
public abstract class HourlyEmployeeInterface implements EmployeeInterface {

    private String firstName, lastName, position;
    private double hourlyPayRate;

    
    //Setters
                                                    
    public void setFirstName(String firstName) {    //***************
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {      //***************
        this.lastName = lastName;
    }

    public void setPosition(String position) {      //***************
        this.position = position;
    }
    

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }  

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
    
    //Over-ridden Methods
    @Override                               //***************
    public String firstName(String firstName){
        this.firstName = firstName;
                return firstName;
    }
    
    @Override                               //***************
    public String lastName(String lastName){
        this.lastName = lastName;
        return lastName;
    }
    
    @Override                               //****************
    public String position(String position){
        this.position = position;
        return position;
    }
    
    @Override
    public double biWeeklyEarnings(){
        return hourlyPayRate * 80;
    }
    
    @Override
    public double monthlyEarnings(){
        return hourlyPayRate * 160;
    }
    
    @Override
    public double yearlyEarnings(){
        return ( hourlyPayRate * 160 ) * 12;
    }

}
