/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employess;

/**
 *
 * @author Neha Ankam
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee empObject01 = new Employee("Michael","Downey",50988,"6602240486", "9277 Fairway Drive, Apt#208, Des Plaines, IL");
System.out.println("Employee Details01:");
System.out.println("Employee ID: "+empObject01.getEmployeeID());
System.out.println("Name: " + empObject01.getFirstName() +" "+ empObject01.getLastName());
System.out.println("Address: "+empObject01.getAddress());
System.out.println("Contact Number: "+empObject01.getPhoneNumber());
System.out.println("**************************************************");
// created the employee object with no-argument constructor
Employee empObject02 = new Employee();
System.out.println("Employee Details02:");
System.out.println("Employee ID: "+empObject02.getEmployeeID());
System.out.println("Name: " + empObject02.getFirstName() +" "+ empObject02.getLastName());
System.out.println("Address: "+empObject02.getAddress());
System.out.println("Contact Number: "+empObject02.getPhoneNumber());
System.out.println("**************************************************");
// now set the value of attributes for the empObject02
empObject02.setEmployeeID(12354);
empObject02.setFirstName("Julie");
empObject02.setLastName("Clark");
empObject02.setPhoneNumber("9494949494");
empObject02.setAddress("1231 University Drive, Apt#60, Kansas, MO");        
System.out.println("Testing toString() method of Employee class:\n"+empObject02.toString());
System.out.println("**************************************************");
//Question no 8:
// Here it prints the null value for String type and 0 for int type because during the object creation, since we are not passing any values, the no arg constructor is called. As there are no values given to the variables in no arg constructor, the default values are printed which are null for string and 0 for int.
    }
    
}
