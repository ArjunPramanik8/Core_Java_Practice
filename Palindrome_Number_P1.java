package Practice;

import java.util.Scanner;

public class Palindrome_Number_P1
{
    public static void main(String[] args) {

        int r=0;
        int sum =0;
        int temp=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to be checked");
        int n = sc.nextInt();

         temp=n;


        //reversing the integer
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;

        }

        System.out.println(sum);

        if(temp == sum)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Non Palindrome");
        }
    }
}
