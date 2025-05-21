/*

Write a complete multi-threaded program to meet following
requirements:
- Read matrix [A] m x n
- Create m number of threads
- Each thread computes summation of elements of one row,
  i.e. ith row of the matrix is processed by ith thread. Where 0 <= i< m.
- Print the results

*/

import java.util.Scanner;

public class Program174 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = 2;
        int n = 3;

        int[][] matrix = new int[m][n];


        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();


        for (int i = 0; i < m; i++){
            RowSum rs = new RowSum(matrix[i]);
            rs.start();
        }

    }

}

class RowSum extends Thread{
    int[] row;
    int sum = 0;

    RowSum(int[] row){
        this.row = row;
    }

    public void run(){
        for(int i : row)
            sum += i;
        System.out.println("Sum of row is " + sum);
    }

}