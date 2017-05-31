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
public class Quadrilateral {
    /**
     * calculates area
     * @return area
     */
    public double calculateArea(){
        return 0.0;
    }
    /**
     * calculates the perimeter
     * @return perimeter
     */
    public double calculatePerimeter(){
        return 0.0;
    }
    /**
     * displays the area and perimeter of the given figure
     * @return string
     */
    @Override
    public String toString(){
        return "Area = "+String.format("%.2f",(calculateArea()))+"\n"+"Perimeter = "+String.format("%.2f",(calculatePerimeter()));
    }
}
