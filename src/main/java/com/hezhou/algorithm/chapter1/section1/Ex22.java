package com.hezhou.algorithm.chapter1.section1;

public class Ex22 {
  public static int rank(int key, int[] a) {
    return rank(key, a, 0, a.length - 1, 0);
  }

  public static int rank(int key, int[] a, int lo, int hi, int count) {
    for (int i = 0; i < count; i++) {
      System.out.print("\t");
    }
    System.out.printf("lo:%d, hi:%d\n", lo, hi);
    if (lo > hi) {
      return -1;
    }
    int mid = lo + (hi - lo) / 2;
    if (key < a[mid]) {
      return rank(key, a, lo, mid - 1, ++count);
    } else if (key > a[mid]) {
      return rank(key, a, mid + 1, hi, ++count);
    } else {
      return mid;
    }
  }

  public static void main(String[] args) {
    rank(3, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
  }
}