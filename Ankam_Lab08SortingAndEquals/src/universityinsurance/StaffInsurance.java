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
public class StaffInsurance extends AbstractEmployeeInsurance {

    public StaffInsurance(java.lang.String name,
            java.lang.String mobileNumber,
            java.lang.String empId,
            int age,
            int hiredYear,
            int totalYearsOfPayment) {
        super(name, mobileNumber, empId, age, hiredYear, totalYearsOfPayment);
    }

    @Override
    public double calcDiscount(int age) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (age < 20) {
            return ANNUAL_INSURANCE_AMOUNT * 2 / 100;
        }
        if (age >= 20 && age <= 40) {
            return ANNUAL_INSURANCE_AMOUNT * 1 / 100;
        } else {
            return 0.0;
        }

    }

    @Override
    public boolean equals(java.lang.Object object) {
        if (object == null) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        final Employee other = (Employee) object;
        if (!Objects.equals(this.getEmpName(), other.getEmpName())) {
            return false;
        }
        return true;
    }

}
