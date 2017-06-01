/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Neha Ankam
 */
class Person {
    private int age;
    private String fName;
    private String lName;

    public Person(int age, String fName, String lName) {
        this.age = age;
        this.fName = fName;
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
    @Override
    public String toString(){
        return "First Name= "+fName+", Last Name= "+lName+", Age= "+age;
    }
    
    
    
}
