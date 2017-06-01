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
public class Player implements Comparable<Player> {

    private String firstName;
    private String lastName;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Player Name: " + lastName + ", " + firstName;
    }

    @Override
    public int compareTo(Player pl) {
        int result = 0;
        if (this.firstName.compareTo(pl.firstName) < 0) {
            result = -1;
        }
        if (this.firstName.compareTo(pl.firstName) > 0) {
            result = 1;
        }
        return result;
    }

}
