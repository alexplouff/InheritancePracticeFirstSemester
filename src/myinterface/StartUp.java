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
public class StartUp {


    public static void main(String[] args) {
        
        
        SalariedEmployee emp1 = new SalariedEmployee();  
        emp1.setFirstName("Guy");
        emp1.setLastName("Smith");
        emp1.setPosition("programer");
        emp1.setSalary(75000);
        
        System.out.println("The bi-weekly-earnings of " + emp1.getFirstName() + " " + emp1.getLastName() +
                " is: " + emp1.getBiWeeklyEarnings());
        
        HourlyEmployee emp2 = new HourlyEmployee();
        emp2.setFirstName("Alex");
        emp2.setLastName("Plouff");
        emp2.setPosition("Programmer");
        emp2.setHourlyPayRate(12.00);
        emp2.getBiWeeklyEarnings();
        
        System.out.println("The bi-weekly-earnings of " + emp2.getFirstName() + " " + emp2.getLastName() +
                " is: " + emp2.getBiWeeklyEarnings());
        
        SalariedCommisionEmployee emp3 = new SalariedCommisionEmployee();
        emp3.setFirstName("Man");
        emp3.setLastName("Can");
        emp3.setCommision(400);
        emp3.setSalary(80000);
        
        double salaryAndCommsion = emp3.getBiWeeklyEarnings() * emp3.getCommision();
        
        System.out.println("The bi-weekly-earnings of " + emp3.getFirstName() + " " + emp3.getLastName() +
                " is: " + salaryAndCommsion);
    } 
    
        
}
