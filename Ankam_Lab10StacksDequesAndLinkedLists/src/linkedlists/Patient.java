/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

/**
 *
 * @author Neha Ankam
 */
class Patient {
    private String patientID;
    private String patientName;
    private int patientAge;
    private String patientDisease;

    public Patient(String patientID, String patientName, int patientAge, String patientDisease) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.patientDisease = patientDisease;
    }

    @Override
    public String toString() {
        return patientID + " " + patientAge + " " + patientName + " " + "- " + patientDisease;
    }


}
