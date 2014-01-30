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
public class AbstractSalariedCommisionedEmployee {
    
    double commision, salary;
    
    public void setCommision(double commision) {
        this.commision = commision;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getCommision() {
        return commision;
    }

    public double getSalary() {
        return salary;
    }
    
    public double getMonthlyPay(){
        return salary + commision;
    }
}
