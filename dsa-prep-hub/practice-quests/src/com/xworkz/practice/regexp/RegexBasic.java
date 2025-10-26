package com.xworkz.practice.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasic {
    public static void main(String[] args) {
        String str = "ba";

        Pattern pattern = Pattern.compile(str);

        Matcher matcher = pattern.matcher("bbabaa");

        boolean matches = matcher.matches();


        System.out.println("matches: "+matches);
        System.out.println("lookingAt: "+ matcher.lookingAt());
        System.out.println("find: "+matcher.find(1));
        System.out.println("group: "+matcher.group());


    }
}
