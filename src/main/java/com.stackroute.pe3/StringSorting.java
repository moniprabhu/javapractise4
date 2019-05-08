//Write a program that sets up a String variable containing a paragraph of text of your choice.
package com.stackroute.pe3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class StringSorting {


        public static void main(String[] args) {

            String str = "Industrial metrology’s Purpose Is To ensure that instruments, used in a wide variety of industries, are functioning properly. An example of this type of metrology might be seen in the production of products for the commercial industry, the testing and designing of aircraft, the functioning of large machinery, or even in factories using rotating equipment during the manufacturing of their products.";
            String str1= str.toLowerCase();
            String[] arr = str1.split(" ");
            ArrayList al=new ArrayList();
            for (String word : arr) {
                al.add(word);
            }
            //sorting the string in alphateic order
            Collections.sort(al);
            System.out.println(al);
        }
}
