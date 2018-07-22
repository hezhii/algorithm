package com.hezhou.algorithm.chapter1.section1;

import edu.princeton.cs.algs4.StdIn;

public class Ex21 {
  public static void main(String[] args) {
    String[] lines = StdIn.readAllLines();
    for (int i = 0; i < lines.length; i++) {
      String[] arr = lines[i].split("\\s");
      System.out.print(arr[0] + " ");
      int a = Integer.parseInt(arr[1]);
      int b = Integer.parseInt(arr[2]);
      System.out.print(a + " ");
      System.out.print(b + " ");
      System.out.printf("%.3f\n", (float) (a / b));
    }
  }
}