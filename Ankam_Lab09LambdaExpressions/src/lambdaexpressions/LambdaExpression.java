/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpressions;

import java.util.function.BiFunction;
import java.util.function.IntFunction;

/**
 *
 * @author Neha Ankam
 */
public class LambdaExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IntFunction<Integer> incrementBy2 = (int x)->x+2;
        System.out.println("Increment by 2 : "+incrementBy2.apply(12));
        
        
     //   IntFunction<Integer> incrementBy1 = (int x)->x++;
       IntFunction<Integer> incrementBy1 = (int x)->++x;
        System.out.println("incrementBy1 : "+incrementBy1.apply(12));
        
        
        
        
         IntFunction<String> threeOrFour =  x -> {
         
         if(x == 3) {
                return "three";
            } else if(x == 4){
                return "four";
            }else{
                return "other";
            }
         };
         
         
        System.out.println("threeOrFour : "+threeOrFour.apply(4)); 
        System.out.println("threeOrFour : "+threeOrFour.apply(1)); 
        System.out.println("threeOrFour : "+threeOrFour.apply(3));
        
        
        IntFunction<String> zeroOrOne = x -> (x == 1 ? "one" : ( x==0 ? "zero" : "other" ));
          
        System.out.println("zeroOrOne : "+zeroOrOne.apply(0)); 
        System.out.println("zeroOrOne : "+zeroOrOne.apply(1)); 
        System.out.println("zeroOrOne : "+zeroOrOne.apply(12));
        
        
        
        BiFunction<Integer,Integer,Integer> myFunction = (Integer n1,Integer n2)->n1-n2;
        
        System.out.println("myFunction : "+myFunction.apply(30,100));
        
    }
    
}
