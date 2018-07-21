package com.hezhou.algorithm.chapter1.section1;

public class Ex18 {
  public static int mastery(int a, int b) {
    /**
     * 求 a * b ，b 除一次 2，a 就乘一次 2，如果是奇数，还要再加上一次 a. 当于把 b 拆分成了 2*2*2*...*2(+1) 的形式。
     * 其实就是为了统计 b 的个数。
     */
    if (b == 0)
      return 0;
    if (b % 2 == 0)
      return mastery(a + a, b / 2);
    return mastery(a + a, b / 2) + a;
  }

  public static int mastery2(int a, int b) {
    // 求 a^b
    if (b == 0)
      return 1;
    if (b % 2 == 0)
      return mastery2(a * a, b / 2);
    return mastery2(a * a, b / 2) * a;
  }

  public static void main(String[] args) {
    System.out.println(mastery(2, 25));
    System.out.println(mastery(3, 4));
    System.out.println(mastery2(2, 5));
  }
}
