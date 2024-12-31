package Practice;
//Q.Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class Circumferencefun {

    public static void circumference(Double r)
    {
        Double Circumference= 2*3.14*r;
        System.out.println("Circumference of the circle is " + Circumference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius");
        Double radius= sc.nextDouble();

        circumference(radius);
    }

}
