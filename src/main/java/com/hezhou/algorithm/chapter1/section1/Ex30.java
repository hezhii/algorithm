package com.hezhou.algorithm.chapter1.section1;

public class Ex30 {
  public static int euclid(int p, int q) {
    if (p == 0 || q == 0) {
      return 1;
    }
    if (p < q) {
      int t = p;
      p = q;
      q = t;
    }
    int r = p % q;
    return r == 0 ? q : euclid(q, r);
  }

  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    boolean[][] a = new boolean[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        a[i][j] = euclid(i, j) == 1;
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}