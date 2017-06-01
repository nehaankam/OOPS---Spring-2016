/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setsandmaps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Neha Ankam
 */
public class TeamDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        HashSet<Team> hashTeams = new HashSet<Team>();

        TreeMap<Player, HashSet<Team>> treeMaps = new TreeMap<Player, HashSet<Team>>();

        Scanner scan = new Scanner(new File("teams.txt"));
        String playerLName, playerFName, teamName, coachName, owner;
        double teamPrice;
        int players;
        String[] owners;
        while (scan.hasNext()) {
            playerLName = scan.nextLine();//System.out.println(playerLName);
            playerFName = scan.nextLine();//System.out.println(playerFName);
            teamName = scan.nextLine();//System.out.println(teamName);
            coachName = scan.nextLine();//System.out.println(coachName);
            teamPrice = scan.nextDouble();//System.out.println(teamPrice);
            players = scan.nextInt();//System.out.println(players);
            scan.nextLine();
            owner = scan.nextLine();//System.out.println(owner);

            owners = owner.split(",");
            Player p = new Player(playerFName, playerLName);
            Team t = new Team(teamName, coachName, teamPrice, players, owners);

            if (treeMaps.containsKey(p) == false) {
                HashSet<Team> temp = new HashSet<Team>();
                temp.add(t);
                treeMaps.put(p, temp);

            } else if (treeMaps.get(p) == null) {
                treeMaps.put(p, hashTeams);
            } else {
                treeMaps.get(p).add(t);

            }


        }


        System.out.println("Print the key and value pair using for loop:");
        for (Map.Entry<Player, HashSet<Team>> entry : treeMaps.entrySet()) {
            System.out.println(entry.getKey() + "; Team Details: " + entry.getValue());
        }
        System.out.println("");
        System.out.println("*************************************************");
        System.out.println("Print the TreeMap:");
        System.out.println(treeMaps);
        System.out.println("*************************************************");    
    }

}
