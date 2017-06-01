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
public class FacultyHiredYearComparator extends java.lang.Object
        implements java.util.Comparator<FacultyInsurance> {

    public FacultyHiredYearComparator() {
    }

    @Override
    public int compare(FacultyInsurance f1, FacultyInsurance f2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        return Integer.compare(f1.getHiredYear(), f2.getHiredYear());

    }

}
