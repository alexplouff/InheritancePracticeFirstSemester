/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author Alex
 */
public class SalariedCommisionEmployee extends SalariedEmployee{
   
    private double commision;
    
    public void setCommision(double commision){
        this.commision = commision;
    }
    
    public double getCommision(){
        return commision;
    }
}
