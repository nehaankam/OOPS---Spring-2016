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
public class BuildingInsurance
        extends Building
        implements UniversityInsurance {

    private int totalYearsOfPayment;

    public BuildingInsurance(String buildingAddress, String buildingName, int noOfFloors, String managerName, String managerSSN, int totalYearsOfPayment) {
        super(buildingAddress, buildingName, noOfFloors, managerName, managerSSN);
        this.totalYearsOfPayment = totalYearsOfPayment;
    }

    public double calcExemption(int noOfFloors) {
        if (noOfFloors < 10) {
            return (ANNUAL_INSURANCE_AMOUNT * .20);
        }
        if (noOfFloors >= 10 && noOfFloors <= 20) {
            return (ANNUAL_INSURANCE_AMOUNT * .10);
        }
        if (noOfFloors > 20 && noOfFloors <= 30) {
            return (ANNUAL_INSURANCE_AMOUNT * .05);
        }
        return 0;
    }

    public int getTotalYearsOfPayment() {
        return totalYearsOfPayment;
    }

    @Override
    public double calcPremiumAmount(int totalYearsOfPayment, int noOfFloors) throws IncorrectYearsException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (totalYearsOfPayment > INSURANCE_PERIOD || totalYearsOfPayment < 0) {
            throw new IncorrectYearsException("IncorrectYearsException: total years of repayment shouldn't be greater than the insurance duration or less than equal to zero.");
        } else if (totalYearsOfPayment == INSURANCE_PERIOD) {
            return (ANNUAL_INSURANCE_AMOUNT * totalYearsOfPayment) - calcExemption(noOfFloors);
        } else if (totalYearsOfPayment == 2) {
            return (ANNUAL_INSURANCE_AMOUNT - ANNUAL_INSURANCE_AMOUNT * .25) - calcExemption(noOfFloors);
        } else if (totalYearsOfPayment == 1) {
            return (ANNUAL_INSURANCE_AMOUNT - ANNUAL_INSURANCE_AMOUNT * .27) - calcExemption(noOfFloors);
        }

        return ANNUAL_INSURANCE_AMOUNT;

    }

    @Override
    public java.lang.String toString() {
        return super.toString() + String.format("%2d", totalYearsOfPayment);
    }

}
