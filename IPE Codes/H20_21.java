/*

20: Write a Java Program to Create a class Account.
     It has three data member account id, name and balance.
     Define method to assign value and display value.
     Define method that search account number given by the user
     by passing array to method.
     If account number exists, print detail of that account.
     Write a program using array of object.
     Declare at least 5 account and print details.

21: Write a Program to find maximum element from 3*3 Matrices

22: Write a program to display transpose of given 3*3 matrix.

*/


import java.util.*;

class H20_21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter rows: ");
        int r = sc.nextInt();

        System.out.println("Enter columns: ");
        int c = sc.nextInt();


        int[][] A = readMatrix(r, c);
        int[][] B = readMatrix(r, c);


        int[][] C = multiplyMatrices(A, B, r, c);


        System.out.println();
        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println();
        System.out.println("Matrix B:");
        printMatrix(B);

        System.out.println();
        System.out.println("Matrix C: ");
        printMatrix(C);


        int[][] D = transposeMatrix(C, r, c);

        System.out.println();
        System.out.println("Transpose of Matrix C:");
        printMatrix(D);

        System.out.println();
        System.out.println("Maximum element from C is " + maxElement(C));

    }

    static int[][] readMatrix(int rows, int cols) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements for the matrix:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.println("Enter element at " + (i + 1) + ", " + (j + 1) + ":");
                matrix[i][j] = sc.nextInt();

            }
        }
        return matrix;
    }


    static int[][] multiplyMatrices(int[][] A, int[][] B, int r, int c) {

        int[][] C = new int[r][c];

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                for (int k = 0; k < c; k++) {

                    C[i][j] += A[i][k] * B[k][j];

                }
            }
        }
        return C;
    }

    static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {

            for (int value : row) {

                System.out.print(value + " ");

            }
            System.out.println();
        }
    }


    static int[][] transposeMatrix(int[][] matrix, int rows, int cols) {

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                transposed[j][i] = matrix[i][j];

            }
        }
        return transposed;
    }

    static int maxElement(int[][] matrix) {

        int max = matrix[0][0];

        for (int[] row : matrix) {

            for (int value : row) {

                if (value > max)
                    max = value;

            }

        }
        return max;

    }
}