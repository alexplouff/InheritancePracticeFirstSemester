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
public abstract class AbstractEmployee {
    
    private String firstName, lastName, position;
    private int age;

    
    //Setters
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Getters
    
    public String getFirstName(){
        if(firstName.length() < 1){
            System.out.println("First name can not be less than 2 characters");
        }
        return firstName;
    }
    
    public String getLastName(){
        if(lastName.length() < 1){
            System.out.println("Last name can not be less than 2 characters");
        }
        return lastName;
    }
    
    public String getPosition(){
        
        return position;
    }
    
    public int getAge(){
        if(age < 18 || age < 65){
            System.out.println("Age is too young/old");
        }
        return age;
    }
    
    //Abstract Methods
    
    public abstract double biWeeklyEarnings();
    public abstract double monthlyEarnings();
    public abstract double yearlyEarnings();
    
}
