/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogs;

/**
 *
 * @author Neha Ankam
 */
public class Dog implements Comparable<Dog> {

    private String name;
    private String breed;
    private int age;
    private int weight;

    public Dog(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format(
                "%-10s  %-10s  %3d  %3d", name, breed, age, weight);
    }

    @Override
    public int compareTo(Dog o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return name.compareTo(o.getName());

    }

}
