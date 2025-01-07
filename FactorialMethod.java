package Practice;

import java.util.Scanner;

public class FactorialMethod {

    public static void printFactorial(int n)
    {
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*i;
        }

        System.out.println("Factorial "+fact);

    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        printFactorial(num);
    }
}
