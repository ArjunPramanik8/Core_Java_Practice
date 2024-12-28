package Practice;

import java.util.Scanner;
//Q.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
public class numchecker {


    public static void ispositive(int n)
    {
        if(n>0)
        {
            System.out.println("The Number is Positive");
        } else if (n<0) {
            System.out.println("The Number is Negative");
        } else if (n==0) {
            System.out.println("Numbe is zero");
        }


    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the number to be checked");
        int num= sc.nextInt();

        ispositive(num);
    }
}
