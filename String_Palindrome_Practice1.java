package Practice;

import java.util.Scanner;

public class String_Palindrome_Practice1 {
    //Palindrome String Checker

    public static void main(String[] args) {

        //Input the string to be analysed

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String to be checked");
        String str= sc.nextLine();

        String rev="";

        // Reversing teh string

        for (int i = (str.length()-1); i >=0 ; i--)
        {
            rev=rev+ str.charAt(i);
        }

        //Comparing teh String for palindrome

        if (rev.equals(str))
        {
            System.out.println("The String is a Palindrome");
        }
        else
        {
            System.out.println("The String is Not a Palindrome");
        }
    }
}
