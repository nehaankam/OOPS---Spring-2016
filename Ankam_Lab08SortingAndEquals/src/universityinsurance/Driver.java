/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityinsurance;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Neha Ankam
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        System.out.println("********* Employee Insurance Implementation*********");
        //Note: The 1st,3rd,5th and so on lines in employee.txt represents the 
        //      Staff properties. 
        //      The 2nd,4rth,6th and so on lines in employee.txt represents the 
        //      Faculty properties.
        //      
        // Note: Limit all the calculated value to 2 decimal.

        //1. Declare and initialize a Scanner object named 'scanner' to read
        //from the file "employee.txt".
        Scanner scanner = new Scanner(new File("employee.txt"));

        //2. Create an ArrayList of StaffInsurance and name it as 'staffList'.
        ArrayList<StaffInsurance> staffList = new ArrayList<StaffInsurance>();
        //3. Create an ArrayList of FacultyInsurance and name it as 'facultyList'.
        ArrayList<FacultyInsurance> facultyList = new ArrayList<FacultyInsurance>();

        //4. Create an object reference named 'staffInsurance' of StaffInsurance class.
        StaffInsurance staffInsurance;
        //5. Create an object reference named 'facultyInsurance' of FacultyInsurance class.
        FacultyInsurance facultyInsurance;
        //6. while employee.txt has more data{
        while (scanner.hasNext()) {
            // Read in the data and store the 1st line of the text file to 
            // staffInsurance object and the second line of the text file to
            // facultyInsurance object.

            // Add the 'staffInsurance' object to the 'staffList' ArrayList.
            // Add the 'facultyInsurance' object to the 'facultyList' ArrayList.
            // }  
            int age;
            String empID;
            String empName;
            int hiredYear;
            String mobileNumber;
            int totalYearsOfPayment;
            empName = scanner.next();
            mobileNumber = scanner.next();
            empID = scanner.next();
            age = scanner.nextInt();
            hiredYear = scanner.nextInt();
            totalYearsOfPayment = scanner.nextInt();
            staffInsurance = new StaffInsurance(empName, mobileNumber, empID, age, hiredYear, totalYearsOfPayment);
            staffList.add(staffInsurance);

            empName = scanner.next();
            mobileNumber = scanner.next();
            empID = scanner.next();
            age = scanner.nextInt();
            hiredYear = scanner.nextInt();
            totalYearsOfPayment = scanner.nextInt();
            facultyInsurance = new FacultyInsurance(empName, mobileNumber, empID, age, hiredYear, totalYearsOfPayment);
            facultyList.add(facultyInsurance);
        }
        System.out.println("****************************************************");

        System.out.println("\nStaff Insurance List Of Elements: ORIGINAL LIST");

        //7. Use enhanced for loop to print the staffList.
        for (StaffInsurance s : staffList) {
            System.out.println(s);
        }

        System.out.println("****************************************************");

        System.out.println("\nFaculty Insurance List Of Elements: ORIGINAL LIST");
        //8. Use enhanced for loop to print the facultyList.
        for (FacultyInsurance f : facultyList) {
            System.out.println(f);
        }

        System.out.println("****************************************************");

        //9. Print the Staff Insurance List Of Elements As Per the age 
        //   in Natural Order.
        //      For Example: Collections.sort(staffList);
        System.out.println("\nStaff Insurance List Of Elements: NATURAL ORDER LIST"
                + " AS PER THE AGE");
        Collections.sort(staffList);
        for (StaffInsurance s : staffList) {
            System.out.println(s);
        }

        System.out.println("****************************************************");
        //10. Print the Faculty Insurance List Of Elements As Per the age 
        //    in Natural Order.

        System.out.println("\nFaculty Insurance List Of Elements: NATURAL ORDER "
                + "LIST AS PER THE NAME");
        Collections.sort(facultyList);
        for (FacultyInsurance f : facultyList) {
            System.out.println(f);
        }
        System.out.println("****************************************************");

        //11. Use the Anonymous class and print the total years of payment in Descending Order for StaffInsurance.
        System.out.println("\nStaffInsurance List Of Elements: Sort by Hiring Year of Staff Using Anonymous Class in Descending Order:");
        Collections.sort(staffList, new Comparator<StaffInsurance>() {
            @Override
            public int compare(StaffInsurance o1, StaffInsurance o2) {
                return Integer.compare(o2.getHiredYear(), o1.getHiredYear());

            }
        });
//         Use enhanced for loop to print the staffList.

        for (StaffInsurance s : staffList) {
            System.out.println(s);
        }

        // 12. Use the separate class for natural order and print 
        //     the FacultyInsurance list of Elements according to the faculty 
        //     hired year.
        System.out.println("****************************************************");

        System.out.println("FacultyInsurance List Of Elements: Sorted List natural Order Using separate class according to the Hiring year of the employee");
        // Use enhanced for loop to print the facultyList.
        Collections.sort(facultyList, new FacultyHiredYearComparator());
        for (FacultyInsurance f : facultyList) {
            System.out.println(f);
        }
        System.out.println("****************************************************");

        //13. Create a StaffInsurance object named "staffInsurance1" and pass the parameters as 
        //  "Sara", "666542111","755695", 24, 2011, 1 each variable represents name, mobileNumber, empId, age, hiredYear, noOfYears
        StaffInsurance staffInsurance1 = new StaffInsurance("Sara", "666542111", "755695", 24, 2011, 1);
        //14. Create a StaffInsurance object named "staffInsurance2" and pass the parameters as 
        StaffInsurance staffInsurance2 = new StaffInsurance("Lindcy", "5634561234", "712345", 39, 2001, 6);
        //  "Lindcy", "5634561234", "712345", 39, 2001, 6
        //15. Create a StaffInsurance object named "staffInsurance3" and pass the parameters as 
        StaffInsurance staffInsurance3 = new StaffInsurance("Jack", "8163451234", "612398", 41, 2000, 3);
        //  "Jack", "8163451234", "612398", 41, 2000, 3
        //16. Check the Equals method with respect to employee name using staffInsurance1
        //    and staffInsurance2 objects.

        System.out.println("");
        System.out.println("Checking Equals Method w.r.t employee name using staffInsurance1 and staffInsurance3 objects: " + staffInsurance1.equals(staffInsurance2));
        System.out.println("****************************************************");

        //17. Calculate the value of calcPremiumAmount() method using staffInsurance2 object.
        System.out.println("\nCalculating value calcPremiumAmount() method using staffInsurance2 object:");
        try {
            staffInsurance2.calcPremiumAmount(6, 39);
        } catch (IncorrectYearsException ex) {
            System.out.println(ex.getMessage());
        }
        //18. Calculate the value of calcPremiumAmount() using staffInsurance3 object
        System.out.println("\nCalculating the value calcPremiumAmount() using staffInsurance3 object:");
        try {
            System.out.printf("The value Of Insurance to be paid by a person if he/she pays the insurance within 3 years is: $%.2f", staffInsurance3.calcPremiumAmount(3, 41));
        } catch (IncorrectYearsException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("");
        System.out.println("****************************************************");

        //19. Test checkMobileNumber() method using 'staffInsurance2' object in Staff Insurance class.
        //      if the number is valid print "The mobile number is valid"
        //      otherwise print "The mobile number is invalid"
        System.out.println("Testing checkMobileNumber() method using 'staffInsurance2' object in Staff Insurance class: ");
        try {
            staffInsurance2.checkMobileNumber("5634561234");
        } catch (IncorrectAreaCodeException ex) {
            System.out.println(ex.getMessage());
        } catch (IncorrectLengthException ex) {
            System.out.println(ex.getMessage());
        } catch (NonDigitFoundException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("****************************************************");
        System.out.println("");
        System.out.println("********* Building Insurance Implementation*********");
        //20. Declare and initialize a Scanner object named 'scanner2' to read
        //from the file "building.txt".
        Scanner scanner2 = new Scanner(new File("building.txt"));
        //21. Create an ArrayList of ResidentialInsurance and name it as 'residentialList'.
        ArrayList<ResidentialInsurance> residentialList = new ArrayList<ResidentialInsurance>();
        //    Create an ArrayList of NonResidentialInsurance and name it as 'nonResidentialList'.
        ArrayList<NonResidentialInsurance> nonResidentialList = new ArrayList<NonResidentialInsurance>();
        //22. Read in the data and store the 1st,3rd,5th line of the text file to 
        // nonResidentialInsurance object and the 2nd,4th,6th line of the text file to
        // residentialInsurance object.Add the respective objects to the respective Array lists.
        while (scanner2.hasNext()) {
            String nonResName = scanner2.next();
            String nonResAddr = scanner2.next();
            int nonResFloors = scanner2.nextInt();
            String nonResMgrName = scanner2.next();
            String nonResMgrSSN = scanner2.next();
            int nonResYear = scanner2.nextInt();
            scanner2.nextLine();
            String resName = scanner2.next();
            String resAddr = scanner2.next();
            int resFloors = scanner2.nextInt();
            String resMgrName = scanner2.next();
            String resMgrSSN = scanner2.next();
            int resYear = scanner2.nextInt();

            ResidentialInsurance residentialInsurance = new ResidentialInsurance(resName, resAddr, resFloors, resMgrName, resMgrSSN, resYear);
            NonResidentialInsurance nonResidentialInsurance = new NonResidentialInsurance(nonResName, nonResAddr, nonResFloors, nonResMgrName, nonResMgrSSN, nonResYear);
            residentialList.add(residentialInsurance);
            nonResidentialList.add(nonResidentialInsurance);
        }
        System.out.println("\nResidential Insurance List Of Elements: ORIGINAL LIST");
        // 23. Use enhanced for loop to print the residentialList.
        for (ResidentialInsurance r : residentialList) {
            System.out.println(r);
        }
        System.out.println("****************************************************");

        System.out.println("NonResidential Insurance List Of Elements: ORIGINAL LIST");
        // 24. Use enhanced for loop to print the nonResidentialList.
        for (NonResidentialInsurance nr : nonResidentialList) {
            System.out.println(nr);
        }
        System.out.println("****************************************************");
        // 25. Print the residential Insurance List Of Elements As Per the number of floors
        //     in Natural Order.
        //     For Example: Collections.sort(residentialList);
        Collections.sort(residentialList);
        System.out.println("Residential Insurance List Of Elements: NATURAL ORDER LIST AS PER THE NUMBER OF FLOORS");
        // 26. Print the nonResidential Insurance List Of Elements As Per the number of floors
        //     in Descending order.
        for (ResidentialInsurance r : residentialList) {
            System.out.println(r);
        }
        System.out.println("****************************************************");
        System.out.println("NonResidential Insurance List Of Elements: DESCENDING ORDER LIST AS PER THE NUMBER OF FLOORS");
        Collections.sort(nonResidentialList, new Comparator<NonResidentialInsurance>() {
            @Override
            public int compare(NonResidentialInsurance o1, NonResidentialInsurance o2) {
                return Integer.compare(o2.getNoOfFloors(), o1.getNoOfFloors());
            }

        });
        for (NonResidentialInsurance nr : nonResidentialList) {
            System.out.println(nr);
        }

        // 27. Use the Anonymous class and print the total years of payment in Descending Order for Residential Insurance.
        System.out.println("****************************************************");
        Collections.sort(residentialList, new Comparator<ResidentialInsurance>() {
            @Override
            public int compare(ResidentialInsurance o1, ResidentialInsurance o2) {
                return Integer.compare(o2.getTotalYearsOfPayment(), o1.getTotalYearsOfPayment());
            }
        });
        System.out.println("Residential Insurance List Of Elements: Sort by Total Years Of Payment Using Anonymous Class in Descending Order:");
        for (ResidentialInsurance r : residentialList) {
            System.out.println(r);
        }
// 28. Use the Anonymous class and print the Manager's SSN in Ascending Order for NonResidential Insurance.
        System.out.println("****************************************************");
        System.out.println("NonResidential Insurance List Of Elements: Sort by Manager's SSN Using Anonymous Class in Ascending Order:");
        Collections.sort(nonResidentialList, new Comparator<NonResidentialInsurance>() {
            @Override
            public int compare(NonResidentialInsurance o1, NonResidentialInsurance o2) {
                return o1.getManagerSSN().compareTo(o2.getManagerSSN());
            }

        });
        // 29. Use enhanced for loop to print the nonResidentialList.
        for (NonResidentialInsurance nr : nonResidentialList) {
            System.out.println(nr);
        }
        System.out.println("****************************************************");
        // 30. Test the checkSSNNumber() method using the object present in index 2 of residentialList:
        System.out.println("Testing checkSSNNumber() method in second index of residentialList: ");
        try {
            residentialList.get(2).checkSSNNumber(residentialList.get(2).getManagerSSN());
            System.out.println("Manager's SSN is valid");
        } catch (NonDigitFoundException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("****************************************************");
        // 31. Check the Equals method with respect to Manager name using the 
        //  objects present in 1st index and 2nd index of residentialList 
        System.out.println("Checking Equals Method w.r.t manager name Using residentialInsurance objects in residentialList at index 1 and 2: " + residentialList.get(1).getManagerName().equals(residentialList.get(2).getManagerName()));

        System.out.println("****************************************************");

        // 32. Check the Equals method with respect to Manager's SSN using the 
        System.out.println("Checking Equals Method w.r.t manager's SSN Using nonresidentialInsurance objects in nonResidentialList at index 1 and 2: " + nonResidentialList.get(1).getManagerSSN().equals(nonResidentialList.get(2).getManagerSSN()));

//  objects present in 1st index and 2nd index of nonResidentialList 
        System.out.println("****************************************************");

        // 33. Calculate calcPremiumAmount() method using residentialInsurance object present at index 0 of residentialList class.
        System.out.println("Calculating calcPremiumAmount() method using residentialInsurance object in 0th index of residentialList:");

        try {
            System.out.printf("The value Of Insurance to be paid by a person if he/she pays the insurance within 3 years is : $ %.2f", residentialList.get(0).calcPremiumAmount(residentialList.get(0).getTotalYearsOfPayment(), residentialList.get(0).getNoOfFloors()));
        } catch (IncorrectYearsException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("");
        System.out.println("****************************************************");
// 34. Calculate calcPremiumAmount() method using nonResidentialInsurance object present at index 2 of nonResidentialList:

        System.out.println("Calculating calcPremiumAmount() method using nonResidentialInsurance object present at index 2 of nonResidentialList:");
        try {
            nonResidentialList.get(2).calcPremiumAmount(nonResidentialList.get(2).getTotalYearsOfPayment(), nonResidentialList.get(2).getNoOfFloors());
        } catch (IncorrectYearsException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("****************************************************");

    }

}
