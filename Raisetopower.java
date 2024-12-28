package Practice;
//Q.Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.Scanner;
import java.math.*;
public class Raisetopower {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the number");
        int num= sc.nextInt();
        System.out.println("Please enter the power");
        int power = sc.nextInt();

        int result= (int) Math.pow(num,power);
        System.out.println("The result is "+ result);
    }

}
