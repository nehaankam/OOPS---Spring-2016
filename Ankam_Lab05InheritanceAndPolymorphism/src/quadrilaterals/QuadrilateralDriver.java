/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrilaterals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Neha Ankam
 */
public class QuadrilateralDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scan = new Scanner(new File("quadrilateral.txt"));
        String figure;
        while(scan.hasNext()){
            figure=scan.nextLine();
             if("Trapezoid".equals(figure)){
                 while(scan.hasNextDouble()){
                  double base1 = scan.nextDouble();
                  
                  double base2 = scan.nextDouble();
                  
                  double height = scan.nextDouble();
                  
                  double side1 = scan.nextDouble();
                  
                  double side2 = scan.nextDouble();
                  
                  System.out.println(figure+":");
                  Trapezoid tp = new Trapezoid(base1,base2,height,side1,side2);
                      
                      System.out.println(tp);
                      System.out.println("_______________________________________________________________");
                      
                  }
             }
                
                if("Right Trapezoid".equals(figure)){
                    while(scan.hasNextDouble()){
                
                  double base1 = scan.nextDouble();
                  
                  double base2 = scan.nextDouble();
                  
                  double side1 = scan.nextDouble();
                  
                  double side2 = scan.nextDouble();
                  
                  System.out.println(figure+":");
                  RightTrapezoid rtp = new RightTrapezoid(side1,side2,base1,base2);
                    //  Trapezoid rtp = new RightTrapezoid(side1,side2,base1,base2);
                      System.out.println(rtp);
                      System.out.println("_______________________________________________________________");
                      
                  }
                 
                }
               if("Parallelogram".equals(figure)){
                  while(scan.hasNextDouble()){
                  double base = scan.nextDouble();
                  
                  double side = scan.nextDouble();
                  
                  double height = scan.nextDouble();
                  
                  System.out.println(figure+":");
                  Parallelogram pl = new Parallelogram(base,side,height);
                      
                      System.out.println(pl);
                      System.out.println("_______________________________________________________________");
                      
                  }
                  
                }
                if("Rhombus".equals(figure)){
                  while(scan.hasNextDouble()){
                  double diagonal1 = scan.nextDouble();
                  
                  double diagonal2 = scan.nextDouble();
                  
                  System.out.println(figure+":");
                  Rhombus rb = new Rhombus(diagonal1,diagonal2);
                      
                      System.out.println(rb);
                      System.out.println("_______________________________________________________________");
                      
                  }
                 
                }
                if("Square".equals(figure)){
                  while(scan.hasNextDouble()){
                  double side = scan.nextDouble();
                  
                  System.out.println(figure+":");
                  Square sq = new Square(side);
                    //  Rhombus sq = new Square(side);
                      System.out.println(sq);
                      System.out.println("_______________________________________________________________");
         
                  }
                } 
                
            }
        
    }
 //The output is same even if the reference variable of superclass is storing the refence variable of sub class. This is polymorphic substitution since the Trapezoid object can hold the reference of Trapezoid and also the reference of RightTrapezoid and Rhombus object can hold the reference of Rhombus and also the reference of Square. It also includes the late binding since the appropriate toString method in RightTrapezoid is invoked at run time since the object reference is of type RightTrapezoid. Same is the case with Rombus and Square classes. Therefore the output is same in both the cases.             
}
