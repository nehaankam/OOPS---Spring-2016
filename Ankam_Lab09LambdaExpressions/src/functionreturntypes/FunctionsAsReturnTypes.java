/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionreturntypes;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 *
 * @author Neha Ankam
 */
public class FunctionsAsReturnTypes {

    /**
     * @param args the command line arguments
     */
    public static IntFunction divideBy(int divisor) {
        return x -> x / divisor;
    }

    public static Function<Double, Double> divideBy(double divisor) {
        return y -> y / divisor;
    }

    public static BiFunction<String, String, Boolean> contains() {
        return (String s1, String s2) -> s1.contains(s2);
    }

    public static Function<String, Boolean> contains(String str) {
        return (String s) -> s.contains(str);
    }

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println(divideBy(3).apply(47));
        System.out.println(divideBy(2).apply(18));
        System.out.println(divideBy(17).apply(3));
        System.out.println(divideBy(5).apply(17));
        System.out.println();

        System.out.println(divideBy(3.0).apply(47.0));
        System.out.println(divideBy(2.0).apply(18.0));
        System.out.println(divideBy(17.0).apply(3.0));
        System.out.println(divideBy(5.0).apply(17.0));
        System.out.println();

        System.out.println(contains().apply("bearcats", "bear"));
        System.out.println(contains().apply("bearcats", "arc"));
        System.out.println(contains().apply("bearcats", "arce"));
        System.out.println();

        System.out.println(contains("bear").apply("bearcats"));
        System.out.println(contains("arc").apply("bearcats"));
        System.out.println(contains("arce").apply("bearcats"));

    }

}
