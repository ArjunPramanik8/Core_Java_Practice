package Practice;

import java.util.Scanner;

public class twoDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows");
        int rows=sc.nextInt();
        System.out.println("Please enter the number of rows");
        int cols=sc.nextInt();

        //Array declaration

        int[][] Mat= new int[rows][cols];

        //input array

        for (int i = 0; i <rows ; i++) {

            for (int j = 0; j <cols ; j++) {

                Mat[i][j]=sc.nextInt();
            }
            System.out.println("\n");

        }

        //display the array

        for (int i = 0; i <rows ; i++) {

            for (int j = 0; j <cols ; j++) {

                System.out.print(Mat[i][j]);
            }
            System.out.println("\n");
        }
    }

}
