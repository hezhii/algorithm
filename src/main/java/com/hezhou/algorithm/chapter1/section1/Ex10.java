package com.hezhou.algorithm.chapter1.section1;

public class Ex10 {
  public static void main(String[] args) {
    Boolean[][] arr = { { true, false, true, false }, { false, true, true, true } };
    // System.out.println("# 1 2");
    int rowNum = arr.length;
    int colNum = arr[0].length;
    System.out.print("# ");
    for (int i = 0; i < colNum; i++) {
      System.out.print(i + 1);
      if (i == colNum - 1) {
        System.out.print("\n");
      } else {
        System.out.print(" ");
      }
    }
    for (int i = 0; i < rowNum; i++) {
      System.out.print(i + 1 + " ");
      for (int j = 0; j < colNum; j++) {
        System.out.print(arr[i][j] ? "*" : " ");
        if (j == colNum - 1) {
          System.out.print("\n");
        } else {
          System.out.print(" ");
        }
      }
    }
  }
}
