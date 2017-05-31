/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeSalary;
/**
 * imports the Scanner class present in util package
 */
import java.util.Scanner;

/**
 *
 * @author Neha Ankam
 */
public class EmployeeSalaryDriver {

    /** performs the operations given by the user
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * creating object for Scanner class
         */
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Testing the EmployeeSalary class:");
        System.out.print("Enter the hourly pay rate of the Employee: $");
        
        double hourlyRate = scan.nextDouble();
        System.out.print("Enter the insurance rate of the Employee in percentage: ");
        
        double insuranceRate = scan.nextDouble();
        System.out.print("Enter the tax rate of the employee in percentage: ");
        
        double taxRate = scan.nextDouble();
        System.out.print("Enter the bonus amount: $");
        
        double bonus = scan.nextDouble();
        
        EmployeeSalary employeeSalaryObj1 = new EmployeeSalary(hourlyRate,insuranceRate,taxRate,bonus);
        System.out.println("The details of empSalObj1 object are as follows:");
        System.out.println(employeeSalaryObj1);
        System.out.println("The monthly salary of the employee is: $" + employeeSalaryObj1.monthlySalary());
        System.out.println("The monthly insurance of the employee is: $" + employeeSalaryObj1.monthlyInsurance());
        System.out.println("The annual gross salary of the employee is: $" + employeeSalaryObj1.annualGrossSalary());
        System.out.println("The gross annual net pay of the employee is: $" + employeeSalaryObj1.annualNetPay());
        System.out.println("");
        System.out.println("***********************************************");
        System.out.println("");
        EmployeeSalary employeeSalaryObj2 = new EmployeeSalary();
        System.out.println("The details of empSalObj2 are as follows:");
        System.out.println(employeeSalaryObj2);
        System.out.println("The monthly salary of the employee is: $" + employeeSalaryObj2.monthlySalary());
        System.out.println("The monthly insurance of the employee is: $" + employeeSalaryObj2.monthlyInsurance());
        System.out.println("The annual gross salary of the employee is: $" + employeeSalaryObj2.annualGrossSalary());
        System.out.println("The gross annual net pay of the employee is: $" + employeeSalaryObj2.annualNetPay());
        employeeSalaryObj2.setHourlyRate(42.85);
        employeeSalaryObj2.setInsuranceRate(15.30);
        employeeSalaryObj2.setTaxRate(11.55);
        employeeSalaryObj2.setBonus(6344.66);
        System.out.println(employeeSalaryObj2);
        System.out.println("The monthly salary of the employee is: " + employeeSalaryObj2.monthlySalary());
        System.out.println("The monthly insurance of the employee is: " + employeeSalaryObj2.monthlyInsurance());
        System.out.println("The annual gross salary of the employee is: " + employeeSalaryObj2.annualGrossSalary());
        System.out.println("The annual Net pay of the employee is: " + employeeSalaryObj2.annualNetPay());
        scan.close();
        
    }
    
}
