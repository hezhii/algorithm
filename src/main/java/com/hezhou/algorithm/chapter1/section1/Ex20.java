package com.hezhou.algorithm.chapter1.section1;

public class Ex20 {
  public static double ln(int n) {
    if (n == 1) {
      return 0;
    }
    return Math.log(n) + ln(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(ln(10));
  }
}