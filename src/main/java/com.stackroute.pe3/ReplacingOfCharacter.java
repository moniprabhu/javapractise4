package com.stackroute.pe3;
import java.util.*;

public class ReplacingOfCharacter {
    public static void main(String[] args)
    {
        System.out.println("Input String:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //replacing the letter d with f and l with t
        String str1=str.replace("d","f");
        str1=str1.replace("l","t");
        //displaying the output string
        System.out.println("Output String:" +str1);
        System.out.println("Original String:"+str);
        System.out.println("New String:"+ str1);

    }
}
