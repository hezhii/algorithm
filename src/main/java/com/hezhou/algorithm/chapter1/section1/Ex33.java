package com.hezhou.algorithm.chapter1.section1;

import java.util.Arrays;

public class Ex33 {
  public static void main(String[] args) {
    // 向量 x
    double[] x = { 1, 2, 3 };
    // 向量 y
    double[] y = { 4, 5, 6 };
    // 矩阵 a
    double[][] a = { { 1, 2, 3 }, { 4, 5, 6 } };
    // 矩阵 b
    double[][] b = { { 1, 4 }, { 2, 5 }, { 3, 6 } };

    System.out.println("dot(x, y):");
    System.out.println(Matrix.dot(x, y));

    System.out.println("mult(a, b):");
    double[][] matrix = Matrix.mult(a, b);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("transpose(a):");
    matrix = Matrix.transpose(a);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("mult(a, x):");
    double[] array = Matrix.mult(a, x);
    System.out.println(Arrays.toString(array));

    System.out.println("mult(y, b):");
    array = Matrix.mult(y, b);
    System.out.println(Arrays.toString(array));
  }
}