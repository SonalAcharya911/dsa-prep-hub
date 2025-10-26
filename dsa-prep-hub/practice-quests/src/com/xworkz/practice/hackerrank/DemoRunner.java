
package com.xworkz.practice.hackerrank;

public class DemoRunner {
    static {
        System.out.println("running static block");
    }

    public DemoRunner(){
        System.out.println("created DemoRunner");
    }
    public static void main(String[] args) {
        DemoRunner demoRunner=new DemoRunner();
        demoRunner.product();
        sum();
    }

    public static void sum(){
        System.out.println("running sum");
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("sum="+sum);
    }

    public void product(){
        System.out.println("running product");
        DemoRunner.sum();
    }
    static {
        System.out.println("running another static block");
    }
}
