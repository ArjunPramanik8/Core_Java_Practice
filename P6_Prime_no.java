package Practice;

import java.util.Scanner;

public class P6_Prime_no {

    public static boolean isPrime(int n)
    {
        int c=0;
        if (n == 0 || n== 1)
        {
            System.out.println("Non Prime number");
            return false;
        }
        else
        {
            for (int i = 2; i < n-1 ; i++) {

                if (n % i == 0)
                {
                     c++;
                }
            }
            if (c>0)
            {
                System.out.println(" Non Prime Number");
                return false;

            }
            else
            {
                System.out.println(" Prime Number");
                return true;
            }
        }

    }

    public static void main(String[] args) {

        //capture the number to be checked
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to be checked");
        int n = sc.nextInt();

        boolean Result= isPrime(n);
        System.out.println(Result);

        }
}
