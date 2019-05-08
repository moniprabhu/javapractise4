//program to transpose the given string.
package com.stackroute.pe3;
import java.util.*;
public class TransposeOfString {
    public static void main(String[] args) {
        System.out.println("Enter string to reverse:");

        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
//spliting all string
        String[] arr = str.split(" ");
        for (String word : arr) {

            char[] wordofArray = word.toCharArray();
            //reversing all string
            for (int i = wordofArray.length-1; i >=0; i--) {
                System.out.print(wordofArray[i]);
            }
            System.out.println();
        }
    }
}
