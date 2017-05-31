 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coach;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Neha Ankam
 */
public class CoachDriver
{

    /**
     *this is a main method
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {

//        This program runs correctly using either the CoachList class or the 
//        CoachArray class.  Select the one you want to use by 
//        commenting out one of the statements below.
//        Note: The output should be shown both on the console and saved to a 
//        file. Use Printwriter to save the console output to a file.
        
//        NOTE: The term "coach list" throughout refers to coach 
//        objects stored in coachList/coachArray
        
//	  Create an object named coachObjectValue of CoachList class.
       CoachList coachObjectValue = new CoachList(); //Comment this 
//        if you want to use the coachArray class
//        
//   CoachArray coachObjectValue = new CoachArray(); //Uncomment this
//        line if you want to use the coachArray class and comment the 
//        above coachList class.                  
             
	  PrintWriter printOut = new PrintWriter("saveInfoText.txt"); //Creates 
//        a new PrintWriter, without automatic line flushing, with the specified 
//        file name.
          
// 	  declare and initialize a Scanner object named fileReader to 
//        read from the file coach.txt 

          Scanner fileReader = new Scanner(new File("coach.txt"));
	  Coach coachObject = new Coach();
          while(fileReader.hasNext())
          {
//        while coach.txt has more data {
//	  Read in the data, and use the values as arguments for a call to 
          coachObjectValue.addCoach(new Coach(fileReader.next(),fileReader.next(),fileReader.nextDouble()));
		}

//        print the total number of coach objects created from 
          System.out.println("Total Coach objects created from coach.txt =" + coachObjectValue.getNumberOfCoach());
          printOut.println("Total Coach objects created from coach.txt =" + coachObjectValue.getNumberOfCoach());
//        coach.txt using getNumberOfCoach()
          System.out.println("");
          printOut.println();
          System.out.println("Contents of coach list ("+coachObjectValue.getNumberOfCoach() +" coach members)");
          printOut.println("Contents of coach list ("+coachObjectValue.getNumberOfCoach() +" coach members)");
//	  print the Contents of coach list
//	  print the coachObjectValue		
          System.out.println(coachObjectValue);
            printOut.println(coachObjectValue); 
//	  print the average Salary using findAverageSalary()
	  System.out.printf("Average salary: $%.2f",coachObjectValue.findAverageSalary());
          
          printOut.printf("Average salary: $%.2f",coachObjectValue.findAverageSalary());
//        Note:Limit the value of the average salary to 2 decimal points.        
          System.out.println("");
          System.out.println("");
          printOut.println();
          printOut.println();
//	  add one of the coach member to the end of the list by creating the 
//        coach object coachObject and pass it to the 
//        addcoach(coachObject). Return  Successfully added if you are 
//	  able to add the coach to the end of the list. 
//	  Otherwise return  Unable to add coach .
//        example:  coach coachObject = new coach("Gwen", "DeMarco", 
//        39000.45);	
          coachObject = new Coach("Gwen","DeMarco",39000.45);
          System.out.println("Adding one coach to end of list");
          printOut.println("Adding one coach to end of list");
		if(coachObjectValue.addCoach(coachObject))
	  {
              System.out.println("Successfully added");
              printOut.println("Successfully added");
	  }
	  else
	  {
	             System.out.println("Unable to add coach");
                     printOut.println("Unable to add coach");
	  }
          System.out.println("");
          printOut.println();
//	  Attempt adding coach at index 3. Return  Successfully added  
//        if you are able to add the coach to the list. 
//        Return  Unable to add coach .
          System.out.println("Attempting to add one coach to list at index 3");
          printOut.println("Attempting to add one coach to list at index 3");
          coachObject = new Coach("Bilbo", "Baggins", 45000.48);
	  if(coachObjectValue.addCoach(3,coachObject))
	  {
              System.out.println("Successfully added");
              printOut.println("Successfully added");
	  }
	  else
	  {
	             System.out.println("Unable to add coach");
                     printOut.println("Unable to add coach");
	  }
          System.out.println("");
          printOut.println();
		
//	  Attempt adding coach at index 40. Return  Successfully added  if you 
//        are able to add the coach to the list, else print 
//         Unable to add coach .
            coachObject = new Coach( "Fanny", "Brice", 39000);
            System.out.println("Attempting to add one coach to list at index 40");
            printOut.println("Attempting to add one coach to list at index 40");
	  if(coachObjectValue.addCoach(40, coachObject))
	  {
	 	           System.out.println("Successfully added");
                           printOut.println("Successfully added");
	  }
        else
	  {
	 	           System.out.println("Unable to add coach");
                           printOut.println("Unable to add coach");
	  }
          System.out.println("");
          printOut.println();

		
// 	Print the getNumberOfCoach()
//	Example: coachObjectValue.getNumberOfCoach()
          System.out.println("Number of coach members in list: " + coachObjectValue.getNumberOfCoach());
          printOut.println("Number of coach members in list: " + coachObjectValue.getNumberOfCoach());
//	Attempt to remove a coach at index equal to the number of 
//      coach in the list and return  Successfully removed  if you are 
//      able to remove, else print  Unable to remove  
//	Example: 
         System.out.println("Attempting to remove coach at index equal to the number of coach members in the list(currently " +coachObjectValue.getNumberOfCoach() +")");
         printOut.println("Attempting to remove coach at index equal to the number of coach members in the list(currently " +coachObjectValue.getNumberOfCoach() +")");
         if(coachObjectValue.removeCoach(coachObjectValue.getNumberOfCoach()))
	  {
      	       System.out.println("Successfully removed");
               printOut.println("Successfully removed");
        } 
        else
        {
		        System.out.println("Unable to remove");
                        printOut.println("Unable to remove");
	}
        System.out.println("");
        printOut.println();
// 	  Attempt removing coach at index 5 and print 
//         Successfully removed  if you are able to remove, else print 
//         unable to remove .
        System.out.println("Attempting to remove coach at index 5");
        printOut.println("Attempting to remove coach at index 5");
//	 Example: 
        if(coachObjectValue.removeCoach(5))
	{
		          System.out.println("Successfully removed");
                           printOut.println("Successfully removed");
	}
	else
	{
	           System.out.println("Unable to remove");
                   printOut.println("Unable to remove");
      }
		      System.out.println("");
                      printOut.println();
//	  Attempt removing coach at index 20 and print 
//        "Successfully removed  if you are able to remove, 
//        else print  unable to remove .
        System.out.println("Attempting to remove coach at index 20");
        printOut.println("Attempting to remove coach at index 20");
// 	   Example: 
        if(coachObjectValue.removeCoach(20))
	  {
		            System.out.println("Successfully Removed ");
                            printOut.println("Successfully removed");
	  }
	  else
	  {
		            System.out.println("Unable to remove");
                            printOut.println("Unable to remove");
          }
		
		      System.out.println("");
                      printOut.println();
//		Print the Contents of the coachList/coachArray
//		Print  toString  method of coachList object.
                      System.out.println("Contents of coach list ("+ coachObjectValue.getNumberOfCoach()+" coach members)\n" + "Contents of list");
                      printOut.println("Contents of coach list ("+ coachObjectValue.getNumberOfCoach()+" coach members)\n" + "Contents of list");
//		Example: coachObjectValue.toString()
                      System.out.println(coachObjectValue.toString());
                      printOut.println(coachObjectValue.toString());
//		call and print the findAverageSalary() method. 
                       System.out.printf("Average salary: $%.2f",coachObjectValue.findAverageSalary());
                       printOut.printf("Average salary: $%.2f",coachObjectValue.findAverageSalary());
                       System.out.println("");
                       printOut.println();
//		Example: coachObjectValue.findAverageSalary()
//              Note:Limit the value of the average salary to 2 decimal points.

		printOut.close();	
             fileReader.close();
    }
}