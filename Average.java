package Practice;

import java.util.Scanner;

//Enter 3 numbers from the user & make a function to print their average.
public class Average {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the first number");
        int First= sc.nextInt();
        System.out.println("Please enter the Second number");
        int Second= sc.nextInt();
        System.out.println("Please enter the Third number");
        int Third= sc.nextInt();
        int average= (First+Second+Third)/3;

        System.out.println("Average of three number is "+ average);

    }
}
