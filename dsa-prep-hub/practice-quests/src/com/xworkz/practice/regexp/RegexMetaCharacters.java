package com.xworkz.practice.regexp;

import java.util.Scanner;

public class RegexMetaCharacters {
    public static void main(String[] args) {

        while(true){
            System.out.println("Enter the regex: ");
            Scanner sc=new Scanner(System.in);

            String re=sc.nextLine();

            System.out.println("enter the input: ");
            String input= sc.nextLine();

            RegexTest.check(re,input);

            System.out.println("Exit: Y/N");

            String loop =sc.nextLine();
            if(loop.equals("Y")||loop.equals("y")){
                break;
            }

        }

    }
}
