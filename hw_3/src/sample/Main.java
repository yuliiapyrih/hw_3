package sample;


import java.util.Scanner;

public class Main  {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Input radius: ");
        double radius=in.nextFloat();
        double area, perimeter;
        area= Math.PI*Math.pow(radius,2);
        perimeter=2*Math.PI*radius;
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);

        System.out.println("What is your name?");
        String name = in.next();

        System.out.println("Where are you live, "+name+"?");
        String address = in.next();

        System.out.printf("Name: %s \nAddress: %s \n", name, address);

        System.out.println("How much is a call per minute to countries A, B, C?");
        int c1 = in.nextInt();
        int c2 = in.nextInt();
        int c3 = in.nextInt();

        System.out.println("How long the calls lasted to countries A, B, C?");
        int t1 = in.nextInt();
        int t2 = in.nextInt();
        int t3 = in.nextInt();

        int ring1=c1*t1;
        int ring2=c2*t2;
        int ring3=c3*t3;
        int sum = ring1+ring2+ring3;
        System.out.println("Price call:\n1: "+ring1+"\n2: "+ring2+"\n3: "+ring3+"\nSum: "+sum);

    }
}
