/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeSalary;

/**
 *
 * @author Neha Ankam
 */
public class EmployeeSalary {

    /**
     * declaration of variable hourlyRate
     */
    private double hourlyRate;
    /**
     * declaration of variable bonus
     */
    private double bonus;
    /**
     * declaration of variable insuranceRate
     */
    private double insuranceRate;
    /**
     * declaration of variable taxRate
     */
    private double taxRate;
    /**
     * declaration of variable HOURS
     */
    public static final int HOURS = 40;

    /**
     * constructor initializing the values
     *
     * @param hourlyRate
     * @param insuranceRate
     * @param taxRate
     * @param bonus
     */
    public EmployeeSalary(double hourlyRate, double insuranceRate, double taxRate, double bonus) {
        this.hourlyRate = hourlyRate;
        this.bonus = bonus;
        this.insuranceRate = insuranceRate;
        this.taxRate = taxRate;
    }

    /**
     * no argument constructor in which no values are assigned to the variables
     */
    public EmployeeSalary() {

    }

    /**
     * returns the hourlyRate
     *
     * @return hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * returns the bonus
     *
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * returns the insuranceRate
     *
     * @return insuranceRate
     */
    public double getInsuranceRate() {
        return insuranceRate;
    }

    /**
     * returns the taxRate
     * @return taxRate
     */
    public double getTaxRate() {
        return taxRate;
    }

    /**
     * sets the hourlyRate value
     *
     * @param hourlyRate
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * sets the bonus value
     *
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * sets the insuranceRate
     *
     * @param insuranceRate
     */
    public void setInsuranceRate(double insuranceRate) {
        this.insuranceRate = insuranceRate;
    }

    /**
     * sets the taxRate
     *
     * @param taxRate
     */
    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * calculates monthly salary
     *
     * @return monthly salary
     */
    public double monthlySalary() {
        //(number of weeks for a month) * (number of hours per week) * (hourly pay rate) 
        return (4 * HOURS * hourlyRate);
    }

    /**
     * calculates monthly insurance
     *
     * @return monthly insurance
     */
    public double monthlyInsurance() {
        //(((number of weeks for a month) * (number of hours per week) * (hourly  rate)) * (insurance rate)) / 100
        return ((4 * HOURS * hourlyRate) * insuranceRate) / 100;
    }

    /**
     * calculates annual gross salary
     *
     * @return annual gross salary
     */
    public double annualGrossSalary() {
        //(annual income) + (annual bonus)
        //(annual income) = (monthlysalary * number of munths per year)
        //(monthly salary) = (number of weeks for a month) * (number of hours per week) * (hourly pay rate)
        return ((4 * HOURS * hourlyRate) * 12) + bonus;
    }

    /**
     * calculates annual net pay
     *
     * @return annual net pay
     */
    public double annualNetPay() {
        //tax excemption = (annual income + bonus)*taxRate/100
        //insurance deducted = (annual income) * insuranceRate/100
        //annualNetPay = annual income -(tax excemption + insurance deduction)
        return ((((4 * HOURS * hourlyRate) * 12) + bonus) - (((4 * HOURS * hourlyRate * 12 + bonus) * taxRate / 100) + (((4 * HOURS * hourlyRate) * 12) * insuranceRate / 100)));
    }

    /**
     * returns the string which contains the variables hourlyRate,
     * insuranceRate, taxRate and bonus
     *
     * @return string with variables
     */
    @Override
    public String toString() {
        return "Hourly pay rate: $" + hourlyRate + ", insurance rate: " + insuranceRate + "%, tax: " + taxRate + "%, annual bonus: $" + bonus + ", Hours per week: " + HOURS;
    }
}
