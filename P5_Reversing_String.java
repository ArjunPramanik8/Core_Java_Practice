package Practice;

import javax.xml.transform.Result;
import java.util.Scanner;

public class P5_Reversing_String
{
    public static String reverseString( String str)
    {
        String rev="";
        for (int i = (str.length()-1); i >= 0; i--)
        {
            rev= rev + str.charAt(i);

        }

        return rev;

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the String to be reversed");
        String str = sc.nextLine();

        String Result= reverseString(str);
        System.out.println(Result);
    }
}
