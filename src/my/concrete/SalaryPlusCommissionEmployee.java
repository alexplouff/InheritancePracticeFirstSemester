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
public class SalaryPlusCommissionEmployee extends SalariedEmployee{

    private double commision, salary;
    
    
    public void setCommision(double commision) {
        this.commision = commision;
    }

    
    @Override
    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getCommision() {
        return commision;
    }

    @Override
    public double getSalary() {
        return salary;
    }
    
    public double getMonthlyPay(){
        return salary + commision;
}
    
}
