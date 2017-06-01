/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogs;

import static java.lang.Integer.compare;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Neha Ankam
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[] a = {2, 9, 4, 6, 1, 8, 5};
        List<Integer> nums = Arrays.asList(a);

        System.out.print("Integers in original order: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        nums.sort(Integer::compare);

        System.out.print("Integers in increasing order: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        nums.sort(Collections.reverseOrder());

        System.out.print("Integers in deccreasing order: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println("\n");

        List<Dog> dogList = new ArrayList();
        dogList.add(new Dog("Carmen", "Poodle", 11, 48));
        dogList.add(new Dog("Leonard", "Poodle", 6, 46));
        dogList.add(new Dog("Lucy", "Beagle", 3, 19));
        dogList.add(new Dog("Sally", "Saluki", 2, 54));
        dogList.add(new Dog("Zelda", "Poodle", 14, 43));
        dogList.add(new Dog("Sam", "Saluki", 8, 56));
        dogList.add(new Dog("Flash", "Greyhound", 7, 62));
        dogList.add(new Dog("Eve", "Poodle", 9, 51));
        dogList.add(new Dog("Ben", "Beagle", 5, 22));
        dogList.add(new Dog("Ralph", "Saluki", 6, 49));

        System.out.println("Dogs in original order:");

        for (Dog d1 : dogList) {
            System.out.println(d1);
        }
        
        
        System.out.println("\nDogs in alphabetical order by name:");

        dogList.sort((d1, d2) -> d1.getName().compareTo(d2.getName()));
        Collections.sort(
                dogList,
                (d1, d2) -> d1.getName().compareTo(d2.getName()));
        for (Dog dog : dogList) {
            System.out.println(dog);
        }

        System.out.println("\nDogs in increasing order by age:");
        dogList.sort((d1, d2) -> compare(d1.getAge(), d2.getAge()));

        for (Dog d1 : dogList) {
            System.out.println(d1);
        }

        System.out.println("\nDogs in decreasing order by weight:");
        dogList.sort((d1, d2) -> compare(d2.getWeight(), d1.getWeight()));
        for (Dog d1 : dogList) {
            System.out.println(d1);
        }

    }

}
