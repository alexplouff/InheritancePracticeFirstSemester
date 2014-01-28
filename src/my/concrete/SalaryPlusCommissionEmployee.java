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

    private double commision;
    private double total;
    
    public SalaryPlusCommissionEmployee(String firstName, String lastName, String position, int age, double salary, double commision, double total) {
        super(firstName, lastName, position, age, salary);
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCommision() {
        return commision;
    }

    public double getTotal() {
        return total;
    }
    
    
    
}
