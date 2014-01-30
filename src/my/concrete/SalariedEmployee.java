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
public class SalariedEmployee extends Employee {

    private double salary;
    
    public SalariedEmployee(String firstName, String lastName, String position, int age, double salary) {
        super(firstName, lastName, position, age);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    public double monthlySalary(){
        return salary / 12;
    }
    
    
    
    
}
