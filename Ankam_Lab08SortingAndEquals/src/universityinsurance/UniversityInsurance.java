/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityinsurance;

/**
 *
 * @author Neha Ankam
 */
public interface UniversityInsurance {

    static final double ANNUAL_INSURANCE_AMOUNT = 1200;
    static final double INSURANCE_PERIOD = 3;

    double calcPremiumAmount(int totalYearsOfPayment,
            int age)
            throws IncorrectYearsException;
}
