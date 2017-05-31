/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Neha Ankam
 */
public class CarRentalDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner inCarData = new Scanner(new File("carData.txt"));
        PrintWriter carWriter = new PrintWriter(new File("output.txt"));
        
        while(inCarData.hasNext()){
            
           double baseCarRentalAmount = inCarData.nextDouble();
           double weekEndRate = inCarData.nextDouble();
           int numberOfDays = inCarData.nextInt();
           int age = inCarData.nextInt();
           double insuranceAmount = inCarData.nextDouble();
           int startDay = inCarData.nextInt();
           CarRental car1 = new CarRental(baseCarRentalAmount,weekEndRate,numberOfDays,age,insuranceAmount,startDay);
            System.out.println("New Car Taken for Rent:");
            System.out.println("");
            carWriter.println("New Car Taken for Rent:");
            carWriter.println("");
            System.out.println("Testing ToString()");
            System.out.println(car1.toString()); 
            System.out.println("");
            carWriter.println("Testing ToString()");
            carWriter.println(car1.toString());
            carWriter.println("");
            System.out.println("Testing Getters:");
            carWriter.println("Testing Getters:");
            System.out.println("Base car rental amount per day is: $" + car1.getBaseCarRentalAmount());
            carWriter.println("Base car rental amount per day is: $" + car1.getBaseCarRentalAmount());
            System.out.println("Weekend rate in percentage is: " + car1.getWeekEndRate());
            carWriter.println("Weekend rate in percentage is: " + car1.getWeekEndRate());
            System.out.println("Number of days are: " + car1.getNumberOfDays());
            carWriter.println("Number of days are: " + car1.getNumberOfDays());
            System.out.println("Age of the driver is: " + car1.getAge() +" years");
            carWriter.println("Age of the driver is: " + car1.getAge() +" years");
            System.out.println("The insurance amount is: $" + car1.getInsuranceAmount());
            carWriter.println("The insurance amount is: $" + car1.getInsuranceAmount());
            System.out.println("");
            carWriter.println("");
            System.out.println("Testing getInsuranceAmount(int age)");
            carWriter.println("Testing getInsuranceAmount(int age)");
            System.out.println("The insurance amount to be paid by the driver is: $" + car1.getInsuranceAmount(age));
            carWriter.println("The insurance amount to be paid by the driver is: $" + car1.getInsuranceAmount(age));
            System.out.println("");
            carWriter.println("");
            System.out.println("TESTING getTotalRental(int day, int numberOfDays, int age)");
            carWriter.println("TESTING getTotalRental(int day, int numberOfDays, int age)");
            System.out.println("Total Amount to be paid by the driver: $" + car1.getTotalRental(startDay, numberOfDays, age));
            carWriter.println("Total Amount to be paid by the driver: $" + car1.getTotalRental(startDay, numberOfDays, age));
            System.out.println("*******************************************");
            carWriter.println("*******************************************");
        }//end while
       carWriter.close();
       inCarData.close();
    }
}
