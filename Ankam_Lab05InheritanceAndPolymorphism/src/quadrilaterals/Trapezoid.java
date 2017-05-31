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
public class Trapezoid extends Quadrilateral {
    /**
    * base1 variable of type double
    */
    private double base1;
    /**
    * base2 variable of type double
    */
    private double base2;
    /**
    * height variable of type double
    */
    private double height;
    /**
    * side1 variable of type double
    */
    private double side1;
    /**
    * side2 variable of type double
    */
    private double side2;
    /**
     * no arg constructor initializing all variables to 0
     */
    public Trapezoid() {
        base1=0.0;
        base2=0.0;
        height=0.0;
        side1=0.0;
        side2=0.0;
    }
    /**
     * five arg constructor initializing variables with respective values
     * @param base1
     * @param base2
     * @param height
     * @param side1
     * @param side2 
     */
    public Trapezoid(double base1, double base2, double height, double side1, double side2) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    /**
     * sets side1 value
     * @param side1 
     */
    public void setSide1(double side1){
        this.side1=side1;
    }
    /**
     * sets height value
     * @param height 
     */
    public void setHeight(double height){
        this.height=height;
    }
    /**
     * calculates area of trapezoid
     * @return area
     */
    @Override
    public double calculateArea(){
       return (0.5*(base1+base2)*height);  
    }

    /**
     *calculates perimeter of trapezoid
     * @return perimeter
     */
    @Override
    public double calculatePerimeter(){
        return (base1+base2+side1+side2);
    }
    /**
     * returns the variables, area and perimeter in given format
     * @return string
     */
    @Override
    public String toString(){
        return "Base1 = "+String.format("%.2f",base1)+"\nBase2 = "+String.format("%.2f",base2)+"\nHeight = "+String.format("%.2f",height)+"\nSide1 = "+String.format("%.2f",side1)+"\nSide2 = "+String.format("%.2f",side2)+"\n"+super.toString();
    }
}
