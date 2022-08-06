package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

        // Put your code here
        int m = matrix1.length;
        int n = matrix1[0].length;
        int p = matrix2.length;
        int q = matrix2[0].length;

        int i, j;
        int[][] matrix3 = new int[m][q];

        if(n != p) {
            System.out.println("Matrix Multiplication is not Possible");
        } else {
            for(i = 0; i < m; i++) {
                for(j = 0; j < q; j++) {
                    matrix3[i][j] = 0;
                    for(int k = 0; k < n; k++) {
                        matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            //return matrix3;
        }

        return matrix3;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
