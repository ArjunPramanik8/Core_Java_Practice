public class MatrixMultiplication {
    public static void main(String[] args) 
    {
        int[][] matrixA = {
            {1, 2},
            {3, 4}
        };
        int[][] matrixB = {
            {2, 0},
            {1, 2}
        };

        int[][] product = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Product of the matrices:");
        for (int[] row : product) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
