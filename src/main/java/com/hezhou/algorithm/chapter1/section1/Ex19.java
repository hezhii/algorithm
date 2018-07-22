package com.hezhou.algorithm.chapter1.section1;

import java.util.Arrays;

public class Ex19 {
  public static long[] F(int N) {
    long[] arr = new long[N + 1];
    if (N == 0) {
      return arr;
    }
    arr[1] = 1;
    if (N == 1) {
      return arr;
    }
    for (int i = 2; i <= N; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }
    return arr;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(F(10)));
  }
}