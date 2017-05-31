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
public class Parallelogram extends Quadrilateral {
    /**
    * base variable of type double
    */
    private double base;
    /**
    * side variable of type double
    */
    private double side;
    /**
    * height variable of type double
    */
    private double height;
    /**
     * no arg constructor initializing variables to 0
     */
    public Parallelogram(){
        base=0.0;
        side=0.0;
        height=0.0;
    }
    /**
     * three arg constructor initializing variables with respective values
     * @param base
     * @param side
     * @param height 
     */
    public Parallelogram(double base,double side,double height){
        this.base=base;
        this.side=side;
        this.height=height;
    }
    /**
     * calculates area of parallelogram
     * @return area
     */
    @Override
    public double calculateArea(){
        return (base*height);
    }
    /**
     * calculates perimeter of parallelogram
     * @return perimeter
     */
    @Override
    public double calculatePerimeter(){
        return (2*(base+side));
    }
    /**
     * prints the variables, area and perimeter in given format
     * @return string
     */
    @Override
    public String toString(){
        return "Base = "+String.format("%.2f",base)+"\nSide = "+String.format("%.2f",side)+"\nHeight = "+String.format("%.2f",height)+"\n"+super.toString();
    }
}
