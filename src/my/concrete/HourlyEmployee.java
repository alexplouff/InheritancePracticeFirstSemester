/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Alex
 */
public class HourlyEmployee extends Employee {

    private double hourlyPayRate;
    
    public HourlyEmployee(String firstName, String lastName, String position, int age, double hourlyPayRate) {
        super(firstName, lastName, position, age);
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
    
    
    
    
}
