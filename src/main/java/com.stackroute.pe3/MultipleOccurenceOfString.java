//program to find out the multiple occurrences of the given word in a string using Matchermethods.
package com.stackroute.pe3;

import java.util.regex.*;
public class MultipleOccurenceOfString {
    public static void main(String[] args) {

        String text    ="She sells seashells by the seashore";
        String patternString = "se";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);
//finding the starting and ending of the string along with count
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
        }
    }
}
