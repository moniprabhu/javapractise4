//Program of Regular Expression to find the presence of the name
package com.stackroute.pe3;
import java.lang.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
        System.out.println(" enter the string");
    String str = in.nextLine();
        System.out.println("enter the pattern string");
    String patterString = in.next();

    Pattern pattern = Pattern.compile(patterString);
    Matcher matcher = pattern.matcher(str);
//finding the patternstring with the wholestring
        if (matcher.find()) {
        System.out.println("Is " + patterString + " here ? : " +true);

    }
    }
}