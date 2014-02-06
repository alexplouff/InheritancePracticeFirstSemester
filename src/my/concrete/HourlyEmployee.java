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

    public final void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public final double getHourlyPayRate() {
        return hourlyPayRate;
    }
    
    public final double getBiWeeklyPayRate(){
        return hourlyPayRate * 80;
    }
    
    public final double getMonthlyPay(){
        return hourlyPayRate * 160; //* 160 is total hours for full time employee per month*//
    }
    
    
}
