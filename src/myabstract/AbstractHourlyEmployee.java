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
public class AbstractHourlyEmployee extends AbstractEmployee {
    
    private double hourlyPayRate;
    
    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    
    @Override
    public double biWeeklyEarnings(){
        return ( hourlyPayRate * 80);
    }
    
    @Override
    public double monthlyEarnings (){
        return ( hourlyPayRate * 160 );
    }
    
    @Override
    public double yearlyEarnings(){
        return ( hourlyPayRate * 160 ) * 12; // takes monthly earnings (160) and muiltiplies by 12 for number of months
    }
}
