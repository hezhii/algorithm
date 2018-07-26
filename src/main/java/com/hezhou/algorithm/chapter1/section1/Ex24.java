package com.hezhou.algorithm.chapter1.section1;

public class Ex24 {
  public static int euclid(int p, int q) {
    // 确保 p > q
    System.out.printf("p: %d, q: %d\n", p, q);
    if (p < q) {
      int temp = p;
      p = q;
      q = temp;
    }
    int r = p % q;
    return r == 0 ? q : euclid(q, r);
  }

  public static void main(String[] args) {
    int p = 1234567, q = 1111111;
    System.out.printf("计算 %d 和 %d 的最大公约数：\n", p, q);
    euclid(p, q);
  }
}