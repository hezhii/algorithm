package com.hezhou.algorithm.chapter1.section1;

public class Ex27 {
  // 暂不考虑超出 dobule 型的情况
  // 计算 n * n-1 * ... * m + 1
  public static double factorial(int n, int m) {
    double result = 1;
    while (n >= m) {
      result *= n--;
    }
    return result;
  }

  public static double combination(int n, int m) {
    return factorial(n, m + 1) / factorial(n - m, 1);
  }

  public static double binomial(int N, int k, double p) {
    return combination(N, k) * Math.pow(p, k) * Math.pow(1 - p, N - k);
  }

  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    int k = Integer.parseInt(args[1]);
    double p = Double.parseDouble(args[2]);

    double r = binomial(N, k, p);
    System.out.printf("N: %d, k: %d, p: %.2f, result: %.10f\n", N, k, p, r);
  }
}