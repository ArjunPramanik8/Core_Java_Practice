package Practice;
//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class sumupton {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number upto which sum is to be added");
        int n= sc.nextInt();
        int sum=0;
        for (int i = 0; i <=n ; i++) {

            if (i %2==1) {

                 sum=sum+i;
            }
        }
        System.out.println("Sum of all number upto "+ n +"="+sum);
    }

}
