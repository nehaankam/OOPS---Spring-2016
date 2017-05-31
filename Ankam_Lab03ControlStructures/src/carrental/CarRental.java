/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

/**
 *
 * @author Neha Ankam
 */
public class CarRental {
    /**
     * declaration of variable baseCarRentalAmount
     */
    private double baseCarRentalAmount;
    /**
     * declaration of variable weekEndRae
     */
    private double weekEndRate;
    /**
     * declaration of variable numberOfDays
     */
    private int numberOfDays;
    /**
     * declaration of variable age
     */
    private int age;
    /**
     * declaration of variable insuranceAmount
     */
    private double insuranceAmount;
    /**
     * declaration of variable startDay
     */
    private int startDay;
    /**
     * constructor assigning the values to the variables
     * @param baseCarRentalAmount
     * @param weekEndRate
     * @param numberOfDays
     * @param age
     * @param insuranceAmount
     * @param startDay 
     */
    public CarRental(double baseCarRentalAmount, double weekEndRate, int numberOfDays, int age, double insuranceAmount, int startDay)
    {
        this.baseCarRentalAmount= baseCarRentalAmount;
        this.weekEndRate= weekEndRate;
        this.numberOfDays= numberOfDays;
        this.age= age;
        this.insuranceAmount= insuranceAmount;
        this.startDay= startDay;
    }
    /**
     * getter method which returns baseCarRentalAmount
     * @return baseCarRentalAmount
     */
    public double getBaseCarRentalAmount() {
        return baseCarRentalAmount;
    }
    /**
     * getter method which returns weekEndRate
     * @return weekEndRate
     */
    public double getWeekEndRate() {
        return weekEndRate;
    }
    /**
     * getter method which returns numberOfDays
     * @return numberOfDays
     */
    public int getNumberOfDays() {
        return numberOfDays;
    }
    /**
     * getter method which returns age
     * @return age
     */
    public int getAge() {
        return age;
    }
    /**
     * getter method which returns insuranceAmount
     * @return insurance Amount
     */
    public double getInsuranceAmount(){
        return insuranceAmount;
    }
    /**
     * getter method which returns startDay
     * @return startDay
     */
    public int getStartDay() {
        return startDay;
    }
    /**
     * calculates insurance amount based on the age
     * @param age
     * @return insuranceAmount
     */
    public double getInsuranceAmount(int age)
    {
        if(age<25)
            return (insuranceAmount + insuranceAmount*10/100);
        return insuranceAmount;
    }
    /**
     * calculates the day rental based on the start day given
     * @return dayRental
     */
    public double getDayRental(int startDay){
        if(startDay == 0 || startDay == 6)
            return baseCarRentalAmount+(baseCarRentalAmount*weekEndRate/100);
        else
            return baseCarRentalAmount;
    }
    /**
     * calculates weekly rental based on the number of weeks given 
     * @param numberOfWeeks
     * @return weeklyRental
     */
    public double getWeeklyRental(int numberOfWeeks){
      // return numberOfWeeks*((5*baseCarRentalAmount)+(2*(baseCarRentalAmount + ((baseCarRentalAmount*weekEndRate/100)/2))));
    double weekDayAmount = 0.0;
    for(int i=0;i<5;i++){
        weekDayAmount = weekDayAmount + getDayRental(i+1);
    }
    double weekEndAmount = 2*(baseCarRentalAmount + ((baseCarRentalAmount*weekEndRate/100)/2));
    return numberOfWeeks*(weekDayAmount + weekEndAmount);
    }
    /**
     * calculates the total Rental based on the start day, number of days and age given
     * @param startDay
     * @param numberOfDays
     * @param age
     * @return totalReantal
     */
    public double getTotalRental(int startDay, int numberOfDays, int age){
        int noOfWeeks= numberOfDays/7;
        int noOfExtraDays= numberOfDays%7;
        double extraDaysRent=0.0;
        for(int i=0;i<noOfExtraDays;i++){
            extraDaysRent+=getDayRental(startDay);
            if(startDay == 6){
                startDay=0;
            }else{
            startDay++;
            }
        }
        return (getWeeklyRental(noOfWeeks)+ extraDaysRent+ getInsuranceAmount(age));
    }
    /**
     * prints the values of the variable
     * @return String in a given format 
     */
    @Override
    public String toString(){
        return "The base car rental amount is: $"+baseCarRentalAmount+", weekend rate: "+weekEndRate+"%, number of days are: "+numberOfDays+", age of the driver is: "+age+", insurance amount is: $"+insuranceAmount+", starting day is: "+startDay;
    }
    
}