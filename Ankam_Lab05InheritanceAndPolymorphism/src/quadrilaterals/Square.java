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
public class Square extends Rhombus {
    /**
     * no arg constructor
     */
    public Square(){
        super();
    }
    /**
     * one arg constructor 
     * @param side 
     */
    public Square(double side){
        super(side,side);
    }
    /**
     * sets diagonal1 value
     * @param side 
     */
    @Override
    public void setDiagonal1(double side){
        super.setDiagonal1(side);
        super.setDiagonal2(side);
    }
    /**
     * prints the variables, area and perimeter in given format
     * @return string
     */
    @Override
    public String toString(){
        return super.toString();
    }
}
