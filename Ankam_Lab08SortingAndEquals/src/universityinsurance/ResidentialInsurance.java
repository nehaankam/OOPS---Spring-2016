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
public class ResidentialInsurance extends BuildingInsurance {

    public ResidentialInsurance(String buildingAddress, String buildingName, int noOfFloors, String managerName, String managerSSN, int totalYearsOfPayment) {
        super(buildingAddress, buildingName, noOfFloors, managerName, managerSSN, totalYearsOfPayment);
    }

    @Override
    public double calcExemption(int noOfFloors) {
        if (noOfFloors < 10) {
            return (ANNUAL_INSURANCE_AMOUNT * .25);
        }
        if (noOfFloors >= 10 && noOfFloors <= 20) {
            return (ANNUAL_INSURANCE_AMOUNT * .15);
        }
        if (noOfFloors > 20 && noOfFloors <= 30) {
            return (ANNUAL_INSURANCE_AMOUNT * .10);
        }
        return 0;
    }

    @Override
    public int compareTo(Building building) {
        //  return noOfFloors.compareTo(building.noOfFloors);
        return Integer.compare(getNoOfFloors(), building.getNoOfFloors());
    }

    @Override
    public java.lang.String toString() {
        return super.toString();
    }

}
