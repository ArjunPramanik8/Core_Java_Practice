package Practice;

import java.util.Scanner;
// Q.Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
public class Voteeligilibility {

    public static void Iseligible(int age)
    {
        if (age>18)
        {
            System.out.println("Eligible for vote");
        }
        else
        {
            System.out.println("Not eligible for vote");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the age");
        int age= sc.nextInt();

        Iseligible(age);
    }
}
