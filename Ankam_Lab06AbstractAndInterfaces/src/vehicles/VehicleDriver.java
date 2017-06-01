/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *Driver class
 * @author Neha Ankam
 */
public class VehicleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scan = new Scanner(new File("vehicle.txt"));
        String vehicleType = "";
        while(scan.hasNext()){
        vehicleType=scan.nextLine();
        
        if(vehicleType.equals("Ford")){
            
            String model = scan.nextLine();
           
            String engine = scan.nextLine();
           
            String transmission = scan.nextLine();
           
            String body = scan.nextLine();
           
            int doors = scan.nextInt();
           
            double initialPrice = scan.nextDouble();
            scan.nextLine(); 
            String accessories = scan.nextLine(); 
           
           // AbstractVehicle v = new Ford(model,engine,transmission,body,doors,initialPrice);
           // System.out.println("adding accessories");
           // v.addAccessories(accessories);
            
            Ford f = new Ford(model,engine,transmission,body,doors,initialPrice);
           // System.out.println(v instanceof Ford);
           // System.out.println(f instanceof Ford);
            List<String> addedaccessorieslist = new ArrayList<String>();
            addedaccessorieslist = f.addAccessories(accessories);
            String accessoriesstring = "";
            for(String s : addedaccessorieslist){
               accessoriesstring+= s+" "; 
            }
            accessoriesstring=accessoriesstring.trim();
            System.out.println(vehicleType+":");
            System.out.println(f+"\nGiven Mileage: "+String.format("%.2f",(f.STANDARD_MILEAGE))+" miles/gallon"+"\nActual mileage: "+String.format("%.2f",(f.calculateActualMileage()))+" miles/gallon"+"\nAccessories Added: "+accessoriesstring+"\nTotal Cost: $"+String.format("%.2f",(f.calculateCost(f.getAccessories()))));
            System.out.println("--------------------------------------------------");
            
        }
        if(vehicleType.equals("Lincoln")){
            
            String model = scan.nextLine();
            String engine = scan.nextLine();
            String transmission = scan.nextLine();
            String body = scan.nextLine();
            int doors = scan.nextInt();
            double initialPrice = scan.nextDouble();
            scan.nextLine();
            String accessories = scan.nextLine();
            System.out.println("["+accessories+"]");
            Lincoln l = new Lincoln(model,engine,transmission,body,doors,initialPrice);
            List<String> addedaccessorieslist = new ArrayList<String>();
            addedaccessorieslist = l.addAccessories(accessories);
            String accessoriesstring = "";
            for(String s : addedaccessorieslist){
               accessoriesstring+= s+" "; 
            }
            accessoriesstring=accessoriesstring.trim();
            System.out.println(vehicleType+":");
            System.out.println(l+"\nGiven Mileage: "+String.format("%.2f",(l.STANDARD_MILEAGE))+" miles/gallon"+"\nActual mileage: "+String.format("%.2f",(l.calculateActualMileage()))+" miles/gallon"+"\nAccessories Added: "+accessoriesstring+"\nTotal Cost: $"+String.format("%.2f",(l.calculateCost(l.getAccessories()))));
            System.out.println("--------------------------------------------------");
        }
        }
        
        }
        
    
    
    
    
    
    }
    

