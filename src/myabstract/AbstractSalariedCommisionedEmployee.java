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
public class AbstractSalariedCommisionedEmployee extends AbstractSalariedEmployee{
    
    double currentCommision, monthlyCommision, totalYearCommision;

    public void setCurrentCommision(double currentCommision) {
        this.currentCommision = currentCommision;
    }

    public void setMonthlyCommision(double monthlyCommision) {
        this.monthlyCommision = monthlyCommision;
    }

    public void setTotalYearCommision(double totalYearCommision) {
        this.totalYearCommision = totalYearCommision;
    }
    
    public double getCurrentCommision(){
        return currentCommision;
    }

    public double getMonthlyCommision() {
        return monthlyCommision;
    }

    public double getTotalYearCommision() {
        return totalYearCommision;
    }
    
    

    @Override
    public double biWeeklyEarnings(){
        return (( salary / 12) / 2) + currentCommision;
    }
    
    @Override
    public double monthlyEarnings(){
        return ( salary / 12) + monthlyCommision;
    }
    
    @Override
    public double yearlyEarnings(){
        return ( salary + totalYearCommision);
    }
}
