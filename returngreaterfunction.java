package Practice;

import java.util.Scanner;

public class returngreaterfunction {

    public static int greater(int a, int b){

        if (a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a= sc.nextInt();
        System.out.println("Please enter the first number");
        int b= sc.nextInt();

        System.out.println(greater(a,b));

    }
}
