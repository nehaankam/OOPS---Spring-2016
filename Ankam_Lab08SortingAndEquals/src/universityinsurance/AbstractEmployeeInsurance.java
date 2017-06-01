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
public abstract class AbstractEmployeeInsurance extends Employee implements UniversityInsurance {

    private int totalYearsOfPayment;

    public AbstractEmployeeInsurance(java.lang.String name,
            java.lang.String mobileNumber,
            java.lang.String empId,
            int age,
            int hiredYear,
            int totalYearsOfPayment) {

        super(name, mobileNumber, empId, age, hiredYear);
        this.totalYearsOfPayment = totalYearsOfPayment;
    }

    public abstract double calcDiscount(int age);

    @Override
    public double calcPremiumAmount(int totalYearsOfPayment,
            int age)
            throws IncorrectYearsException {//check

        if (totalYearsOfPayment < 0 || totalYearsOfPayment > INSURANCE_PERIOD) {
            throw new IncorrectYearsException("IncorrectYearsException: The total number of years is either less than 0 or greater than 3");
        }
        if (INSURANCE_PERIOD == totalYearsOfPayment) {
            return ANNUAL_INSURANCE_AMOUNT * totalYearsOfPayment - calcDiscount(age);
        }
        if (totalYearsOfPayment == 2) {
            return ANNUAL_INSURANCE_AMOUNT - ((ANNUAL_INSURANCE_AMOUNT * totalYearsOfPayment) * .20) - calcDiscount(age);
        }
        if (totalYearsOfPayment == 1) {
            return ANNUAL_INSURANCE_AMOUNT - ((ANNUAL_INSURANCE_AMOUNT * totalYearsOfPayment) * .25) - calcDiscount(age);
        } else {
            return ANNUAL_INSURANCE_AMOUNT;
        }
    }

    public int getTotalYearsOfPayment() {
        return totalYearsOfPayment;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
