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
public class Rhombus extends Parallelogram {
    /**
    * diagonal1 variable of type double
    */
    private double diagonal1;
    /**
    * diagonal2 variable of type double
    */
    private double diagonal2;
    /**
     * no arg constructor initializing variables to 0
     */
    public Rhombus() {
    diagonal1=0.0;
    diagonal2=0.0;
    }
    /**
     * two arg constructor initializing variables with given values
     * @param diagonal1
     * @param diagonal2 
     */
    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    /**
     * sets diagonal1 value
     * @param diagonal1 
     */
    public void setDiagonal1(double diagonal1){
        this.diagonal1=diagonal1;
    }
    /**
     * sets diagonal2 value
     * @param diagonal2 
     */
    public void setDiagonal2(double diagonal2){
        this.diagonal2=diagonal2;
    }
    /**
     * calculates area of the rhombus
     * @return area
     */
    @Override
    public double calculateArea(){
        return 0.5*(diagonal1*diagonal2);
    }
    /**
     * calculates perimeter of the rhombus
     * @return perimeter
     */
    @Override
    public double calculatePerimeter(){
        return 2*(Math.sqrt(diagonal1*diagonal1 + diagonal2*diagonal2));
    }
    /**
     * prints the variables, area and perimeter in given format
     * @return string
     */
    @Override
    public String toString(){
        return "Diagonal1 = "+String.format("%.2f",diagonal1)+"\nDiagonal2 = "+String.format("%.2f",diagonal2)+"\nArea = "+String.format("%.2f",calculateArea())+"\nPerimeter = "+String.format("%.2f",calculatePerimeter());
    }
}
