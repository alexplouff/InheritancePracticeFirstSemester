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

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
    
    public double getBiWeeklyPayRate(){
        return hourlyPayRate * 80;
    }
    
    public double getMonthlyPay(){
        return hourlyPayRate * 160; //* 160 is total hours for full time employee per month*//
    }
    
    
}
