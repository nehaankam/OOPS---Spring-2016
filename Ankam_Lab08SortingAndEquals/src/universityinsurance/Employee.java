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
class Employee extends java.lang.Object implements java.lang.Comparable<Employee> {

    private int age;
    private String empID;
    private String empName;
    private int hiredYear;
    private String mobileNumber;

    public Employee(java.lang.String empName,
            java.lang.String mobileNumber,
            java.lang.String empId,
            int age,
            int hiredYear) {
        this.age = age;
        this.empID = empId;
        this.empName = empName;
        this.hiredYear = hiredYear;
        this.mobileNumber = mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public String getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public int getHiredYear() {
        return hiredYear;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setHiredYear(int hiredYear) {
        this.hiredYear = hiredYear;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public boolean checkMobileNumber(java.lang.String mobileNumber) throws IncorrectAreaCodeException, IncorrectLengthException, NonDigitFoundException {
        if (mobileNumber.length() != 10) {
            throw new IncorrectLengthException("The mobile number is invalid");
        }
        String areaCode = mobileNumber.substring(0, 3);
        if (areaCode != "660" || areaCode != "224") {
            throw new IncorrectAreaCodeException("IncorrectAreaCodeException: The area code is invalid");
        }
        char c;
        for (int i = 0; i < mobileNumber.length(); i++) {
            c = mobileNumber.charAt(i);
            int ch = c;
            if (ch < 30 || ch > 39) {
                throw new NonDigitFoundException("The mobile number is invalid");
            }
        }
        return true;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;

        if (!Objects.equals(this.empID, other.empID)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.empID);
        return hash;
    }

    @Override
    public int compareTo(Employee employee) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return Integer.compare(age, employee.age);

    }

    @Override
    public java.lang.String toString() {
        return String.format("%-10s %-10s %-10s %3d %3d", empName, mobileNumber, empID, age, hiredYear);
    }
}
