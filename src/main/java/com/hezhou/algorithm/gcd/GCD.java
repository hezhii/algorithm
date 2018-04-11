package com.hezhou.algorithm.gcd;

/**
 * 求两个正整数的最大公约数
 */
public class GCD {
  /**
   * 欧几里得算法
   * 
   * @param a 较大的数
   * @param b 较小的数
   * @return a 和 b 的最大公约数
   */
  public static int euclid(int a, int b) {
    if (a == 0 || b == 0) {
      throw new RuntimeException("参数不能为 0");
    }
    int r = a % b;
    return r == 0 ? b : euclid(b, r);
  }
}