/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityinsurance;

import java.util.Objects;

/**
 *
 * @author Neha Ankam
 */
public class NonResidentialInsurance extends BuildingInsurance {

    public NonResidentialInsurance(String buildingAddress, String buildingName, int noOfFloors, String managerName, String managerSSN, int totalYearsOfPayment) {
        super(buildingAddress, buildingName, noOfFloors, managerName, managerSSN, totalYearsOfPayment);
    }

    @Override
    public int compareTo(Building building) {
        return Integer.compare(super.getNoOfFloors(), building.getNoOfFloors());
    }

    @Override
    public boolean equals(java.lang.Object object) {
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        final Building other = (Building) object;
        if (!Objects.equals(this.getManagerSSN(), other.getManagerSSN())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.getManagerSSN());
        return hash;
    }

    @Override
    public java.lang.String toString() {
        return super.toString();
    }

}
