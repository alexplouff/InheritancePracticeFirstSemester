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
public class StartUp extends Employee{
    
    
    public static void main(String[] args) {
        
        HourlyEmployee hourly_Emp1 = new HourlyEmployee();     
        
        SalariedEmployee salEmp = new SalariedEmployee();
        
        SalaryPlusCommissionEmployee salComEmp = new SalaryPlusCommissionEmployee();
       
        
        hourly_Emp1.setFirstName("Alex");
        hourly_Emp1.setLastName("Plouff");
        hourly_Emp1.setAge(23);
        hourly_Emp1.setPosition("Programmer");
        hourly_Emp1.setHourlyPayRate(15.50);
        
        System.out.println("Name: " + hourly_Emp1.getFirstName() + " " + hourly_Emp1.getLastName() + "\n"
                           + "Age: " + hourly_Emp1.getAge() + "\n"
                           + "Position: " + hourly_Emp1.getPosition() + "\n"
                           + "Wage: " + hourly_Emp1.getHourlyPayRate() + "\n"
                           + "Bi-Weekly Pay: " + hourly_Emp1.getBiWeeklyPayRate() + "\n \n");
      

        
        salEmp.setFirstName("Alex Plouff");
        salEmp.setLastName("Plouff");
        salEmp.setPosition("Programmer");
        salEmp.setSalary(75000);
        salEmp.setAge(23);
        
        System.out.println("Name: " + salEmp.getFirstName() + salEmp.getLastName() + "\n"
                         + "Position: " + salEmp.getPosition() + "\n"
                         + "Salary: " + + salEmp.getSalary() + "\n" 
                         + "Monthly Salary: " + salEmp.getMonthlySalary() + "\n \n");

        
        
        salComEmp.setFirstName("Alex");
        salComEmp.setLastName("Plouff");
        salComEmp.setPosition("Programmer");
        salComEmp.setAge(25);
        salComEmp.setCommision(300);
        salComEmp.setSalary(80000);
               
        double totalAnnualWage = (salComEmp.getCommision() * 12 )+ salComEmp.getSalary();
        
        System.out.println("Name: " + salComEmp.getFirstName() + salEmp.getLastName() + "\n"
                         + "Position: " + salComEmp.getPosition() + "\n"
                         + "Salary: " + + salComEmp.getSalary() + "\n" 
                         + "Monthly Commision: " + salComEmp.getCommision() + "\n"
                         + "Annual Wage: " + totalAnnualWage);

    }
}
