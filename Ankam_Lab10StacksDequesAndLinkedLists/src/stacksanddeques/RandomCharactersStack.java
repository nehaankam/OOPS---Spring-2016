/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksanddeques;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Neha Ankam
 */
public class RandomCharactersStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        AStack<Character> parentStack = new AStack<Character>();
        AStack<Character> resultantStack = new AStack<Character>();
        String str = "";
        String resStr = "";
        Scanner scan = new Scanner(new File("expressions.txt"));
        while (scan.hasNext()) {
            str = scan.next();

            for (int i = 0; i < str.length(); i++) {
                parentStack.push(str.charAt(i));
            }

            AStack<Character> temp = new AStack<Character>();
            char ch;
            int tp1;
            int tp2;
            char res = ' ';
            for (int i = 0; i < str.length(); i++) {

                if (parentStack.isEmpty() != true) {
                    tp1 = parentStack.pop();

                    if (parentStack.isEmpty() != true) {
                        tp2 = parentStack.pop();
                    } else {
                        tp2 = tp1;

                    }

                    while (parentStack.isEmpty() != true) {

                        if (tp1 < tp2) {

                            ch = (char) tp2;

                            temp.push(ch);

                            if (parentStack.isEmpty() != true)//co
                            {
                                tp2 = parentStack.pop();
                            }

                        } else {

                            ch = (char) tp1;
                            temp.push(ch);

                            tp1 = tp2;
                            if (parentStack.isEmpty() != true) {
                                tp2 = parentStack.pop();
                            }
                        }

                    }
                    if (tp1 < tp2) {

                        temp.push((char) tp2);
                        res = (char) tp1;
                        resultantStack.push(res);

                    } else {

                        temp.push((char) tp1);
                        res = (char) tp2;
                        resultantStack.push(res);

                        if (temp.size() == 1) {

                            resultantStack.push((char) tp1);
                            break;
                        }
                    }
                }

                while (temp.isEmpty() != true) {
                    char ch1 = temp.pop();

                    parentStack.push(ch1);
                }

            }

            char[] resChar = new char[resultantStack.size()];
            int index = 0;
            while (resultantStack.isEmpty() != true) {

                resChar[index] = resultantStack.pop();
                index++;

            }
            for (char c : resChar) {
                System.out.print(c);
            }

            
            System.out.println("");

        }
    }
}
