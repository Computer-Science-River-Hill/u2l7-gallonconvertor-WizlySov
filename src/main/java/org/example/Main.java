package org.example; //DO NOT DELETE

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of gallons:");
        x = input.nextInt();
        input.close();
        double q;
        double p;
        double c;
        double t;
        q=x*4;
        p=q*2;
        c=p*2;
        t=c*16;
        System.out.println("In "+x+" gallons there are:");
        System.out.println(q+" quarts");
        System.out.println(p+" pints");
        System.out.println(c+" cups");
        System.out.println(t+" tablespoons ");

    }
  
  }