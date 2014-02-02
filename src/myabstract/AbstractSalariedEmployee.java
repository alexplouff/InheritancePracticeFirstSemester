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
public class AbstractSalariedEmployee extends AbstractEmployee{
    
    double salary;
    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double biWeeklyEarnings(){
        return ( salary / 12) / 2;
    }
    
    @Override
    public double monthlyEarnings(){
        return ( salary / 12);
    }
    
    @Override
    public double yearlyEarnings(){
        return salary;
    }
    
}
