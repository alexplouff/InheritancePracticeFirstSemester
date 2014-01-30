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
public class AbstractSalariedEmployee {
    
    double salary;
    
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
