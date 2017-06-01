/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

/**
 * Interface with a constant variable and a public method
 * @author Neha Ankam
 */
public interface VehicleFactory {
    double STANDARD_MILEAGE = 30.00;
    double calculateActualMileage();
}
