package com.xworkz.practice.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void check(String re, String input){
        Pattern pattern = Pattern.compile(re);

        Matcher matcher = pattern.matcher(input);

        boolean result = matcher.matches();

        System.out.println("result: "+result);

    }

    public static void main(String[] args) {

        while(true){
            System.out.println("Enter the regex: ");
            Scanner sc=new Scanner(System.in);

            String re=sc.nextLine();

            System.out.println("enter the input: ");
            String input= sc.nextLine();

            check(re,input);

            System.out.println("Exit: Y/N");

            String loop =sc.nextLine();
            if(loop.equals("Y")||loop.equals("y")){
                break;
            }

        }

    }
}
