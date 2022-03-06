package com.company;

import java.util.Scanner;

public class Integer implements MyInteger{
    Scanner scanner=new Scanner(System.in);
    String str=scanner.nextLine();
    int integer= java.lang.Integer.parseInt(str);
    public void number(){
        System.out.println("my integer is = "+ integer);
    }

    @Override
    public void isEven() {
        if(integer % 2 == 0)
            System.out.println("the integer is even.");
    }

    @Override
    public void isOdd() {
        if(integer % 2 != 0)
            System.out.println("the integer is odd.");
    }

    @Override
    public void isPositive() {
        if (integer > 0)
            System.out.println("the integer is positive.");
    }

    @Override
    public void isNegative() {
        if (integer < 0)
            System.out.println("the integer is negative.");
    }

    @Override
    public void isZero() {
        if (integer == 0)
            System.out.println("the integer is zero.");
    }
}
