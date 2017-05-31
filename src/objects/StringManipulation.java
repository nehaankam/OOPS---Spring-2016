/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Random;

/**
 *
 * @author Neha Ankam
 */
public class StringManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //program 1
        String string1 = "        First";
        String string2 = " Lab ";
        String string3 = "Computer";
        String string4 = " Program     ";
        String string5 = string1 + string2 + string3 + string4;
        //  (or)
        //String string5 = string1.concat(string2.concat(string3.concat(string4)));
        System.out.println("Length of the Concatenated string: " + string5.length());
        String string6 = string5.trim();
        System.out.println("Length after removal of leading and trailing spaces: " + string6.length());
        //string6.substring(string6.indexOf("Program"));//Retrieving "Program" from string6
        System.out.println("Index of first r in Program: " + string6.substring(string6.indexOf("Program")).indexOf("r"));
        System.out.println();

        
        
        //Program 2 
        String str = "fnunfunisfufunnufn";
        System.out.println("Index of fun: " + str.indexOf("fun"));

        //str.substring(str.indexOf("fun"),str.indexOf("fun") + "fun".length());//extracting fun
        //str.substring(str.indexOf("is"),str.indexOf("is") + "is".length());//extracting is
        System.out.println("The resultant String is: " + "Programming " + str.substring(str.indexOf("is"), str.indexOf("is") + "is".length()) + " " + str.substring(str.indexOf("fun"), str.indexOf("fun") + "fun".length()));
        System.out.println();

        //Program 3
        double myValue = 48.50;
        Math.sqrt(myValue); //statement returning square root of 48.50
        System.out.printf("The ceiling of the square root of %.2f is: " + Math.ceil(Math.sqrt(myValue)), myValue);
        System.out.println();
        System.out.printf("The flooring of the square root of %.2f is: " + Math.floor(Math.sqrt(myValue)), myValue );
        System.out.println();
        System.out.println();
        double myValue1 = 90;
        double myValue2 = 20;
        Math.sin(myValue1);//statement returning sine value of myValue1
        Math.tan(myValue1);//statement returning tan value of myValue1
        Math.sin(myValue2);//statement returning sine value of myValue2
        Math.tan(myValue2);//statement returning tan value of myValue2
        System.out.println("The sine and tangent of first variable is: " + Math.round(Math.sin(myValue1)) + " and " + Math.round(Math.tan(myValue1)));
        System.out.println("The sine and tangent of second variable is: " + Math.round(Math.sin(myValue2)) + " and " + Math.round(Math.tan(myValue2)));

        System.out.println();
        int myNumber1 = 3;
        int myNumber2 = 5;
        System.out.println(myNumber1 + " raised to the power to " + myNumber2 + ": " + Math.pow(myNumber1, myNumber2));
        System.out.println();

        System.out.println("The ceiling value of the given expression is: " + Math.ceil(Math.cosh((Math.sqrt((Math.pow(3, 2)) + (4 * 2 * 2) + 3)) / (2 * 4))));
        System.out.println();

        //Program 4
        Random robj = new Random(20L);
        System.out.println("First Random value: " + robj.nextInt(100));
        System.out.println("Second Random value: " + robj.nextInt(100));
        System.out.println("Third Random value: " + robj.nextInt(100));
        System.out.println("Fourth Random value: " + robj.nextInt(100));
        System.out.println("Fifth Random value: " + robj.nextInt(100));
        System.out.println();
        System.out.println("Answer 4b here ....The output gives same numbers for any number of executions ");

        System.out.println();
        System.out.println("No seed values:");
        Random robj1 = new Random();
        System.out.println("First Random value: " + robj1.nextInt(100));
        System.out.println("Second Random value: " + robj1.nextInt(100));
        System.out.println("Third Random value: " + robj1.nextInt(100));
        System.out.println("Fourth Random value: " + robj1.nextInt(100));
        System.out.println("Fifth Random value: " + robj1.nextInt(100));
        System.out.println();
        System.out.println("Answer 4c here…….The output gives different numbers for every execution ");
        System.out.println();
        System.out.println("Answer 4d here…….By comparing both results we can draw the conclusion that if we use the seed value, a set of random numbers would be repeated for any number of executions. Instead if we donot use the seed value, different random numbers would be generated for different executions. Hence if we want to use a same random number for the whole program, we can go for using seed value instead if we want different random numbers, we can go for not using the seed value.");

    }//end main

}//end class
