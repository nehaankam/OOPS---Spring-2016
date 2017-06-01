package linkedlists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * @author Neha Ankam
 */
public class PatientDriver
{

   public static void main(String[] args) throws FileNotFoundException   
   {
      GenericLinkedList<Patient> patients = new GenericLinkedList<Patient>();
      String patientID;
      String patientName;
      int age;
      String disease;
      
      
      Scanner in = new Scanner(new File("patients.txt"));
      
      while(in.hasNext())
      {
         patientID = in.nextLine();
         patientName = in.nextLine();
         age = in.nextInt();
         in.nextLine();
         disease = in.nextLine();
         patients.addFirst(new Patient(patientID, patientName, age, disease));
      }
      
      System.out.println(patients);
      System.out.println(patients.size() + " Patients in the list");
      
      System.out.println("deleting " + patients.removeFirst());
      System.out.println(patients.size() + " Patients in the list");
      
      
   }
}