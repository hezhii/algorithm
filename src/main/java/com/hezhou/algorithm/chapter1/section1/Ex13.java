package com.hezhou.algorithm.chapter1.section1;

public class Ex13 {
  public static void printTransposedMatrix(int[][] matrix) {
    for (int i = 0; i < matrix[0].length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[j][i]);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
    printTransposedMatrix(matrix);
  }
}