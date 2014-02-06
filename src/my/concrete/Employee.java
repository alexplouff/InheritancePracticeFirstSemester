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
public class Employee {
    
    private String firstName, lastName, position;
    private int age;
    


    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final void setPosition(String position) {
        this.position = position;
    }

    public final void setAge(int age) {
        this.age = age;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final String getPosition() {
        return position;
    }

    public final int getAge() {
        return age;
    }
    
}
