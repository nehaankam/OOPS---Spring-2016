/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsandmaps;

/**
 *
 * @author Neha Ankam
 */
public class Team {

    private String nameOfTheTeam;
    private String coachOfTheTeam;
    private double teamPrice;
    private int noOfPlayersInTheTeam;
    private String[] ownerOfTheteam;

    public Team(String nameOfTheTeam, String coachOfTheTeam, double teamPrice, int noOfPlayersInTheTeam, String[] ownerOfTheteam) {
        this.nameOfTheTeam = nameOfTheTeam;
        this.coachOfTheTeam = coachOfTheTeam;
        this.teamPrice = teamPrice;
        this.noOfPlayersInTheTeam = noOfPlayersInTheTeam;
        this.ownerOfTheteam = ownerOfTheteam;
    }

    public String getNameOfTheTeam() {
        return nameOfTheTeam;
    }

    public void setNameOfTheTeam(String nameOfTheTeam) {
        this.nameOfTheTeam = nameOfTheTeam;
    }

    public String getCoachOfTheTeam() {
        return coachOfTheTeam;
    }

    public void setCoachOfTheTeam(String coachOfTheTeam) {
        this.coachOfTheTeam = coachOfTheTeam;
    }

    public double getTeamPrice() {
        return teamPrice;
    }

    public void setTeamPrice(double teamPrice) {
        this.teamPrice = teamPrice;
    }

    public int getNoOfPlayersInTheTeam() {
        return noOfPlayersInTheTeam;
    }

    public void setNoOfPlayersInTheTeam(int noOfPlayersInTheTeam) {
        this.noOfPlayersInTheTeam = noOfPlayersInTheTeam;
    }

    public String[] getOwnerOfTheteam() {
        return ownerOfTheteam;
    }

    public void setOwnerOfTheteam(String[] ownerOfTheteam) {
        this.ownerOfTheteam = ownerOfTheteam;
    }

    @Override
    public String toString() {
        String str = "";
        for (String s : ownerOfTheteam) {
            str = str + s + ", ";
        }
        str = str.substring(0, str.length() - 2);
        // System.out.println(str);
        return "Team Name: " + nameOfTheTeam + ", Coach: " + coachOfTheTeam + ", Team price: $" + teamPrice + " million, No: of Players: " + noOfPlayersInTheTeam + ", Team Owner(s): " + str;
    }

}
