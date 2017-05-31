/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrilaterals;

/**
 *
 * @author Neha Ankam
 */
public class RightTrapezoid extends Trapezoid {
    /**
     * no arg constructor
     */
    public RightTrapezoid(){
        super();
    }
    /**
     * four arg constructor initializing variables with given values
     * @param side1
     * @param side2
     * @param base1
     * @param base2 
     */
    public RightTrapezoid(double side1,double side2,double base1,double base2){
        
        super(base1,base2,side1,side1,side2);
    }
    /**
     * sets side1 and height value
     * @param side1 
     */
    @Override
    public void setSide1(double side1){
       super.setSide1(side1); 
       super.setHeight(side1);
    }
    /**
     * returns the variables, area and perimeter in given format
     * @return string
     */
    @Override
    public String toString(){   
      return super.toString();
    }
}
