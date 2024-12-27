package Practice;

import java.util.Scanner;

public class Sbreverse {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the string");
        StringBuilder sb= new StringBuilder(sc.nextLine());



        for (int i = 0; i <sb.length()/2 ; i++) {
            int front=i;
            int back=sb.length()-1-i;

            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);

            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);

        }

        System.out.println(sb);

    }
}
