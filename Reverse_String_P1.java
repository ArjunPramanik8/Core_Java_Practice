package Practice;

import java.util.Scanner;

public class Reverse_String_P1
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String");
        String str= sc.nextLine();

        String rev="";

        for (int i = (str.length()-1); i >=0 ; i--)
        {
            rev= rev+ str.charAt(i);

        }

        System.out.println("The Reverse String is: "+ rev);
    }
}
