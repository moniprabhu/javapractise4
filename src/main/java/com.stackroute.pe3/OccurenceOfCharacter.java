//Write a java program to count the total number of occurrences of a given character in a string
//without using any loop?
package com.stackroute.pe3;
import java.util.*;

public class OccurenceOfCharacter {
        public static void main(String[] args) {
            String str = "Java is java again java again";
            //finding the count of specified letter
            int charcount = str.length() - str.replaceAll("a", "").length();
            System.out.println("Occurrence of a char in given String: " + charcount);
        }
    }
