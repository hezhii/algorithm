package com.hezhou.algorithm.chapter1.section1;

public class Ex09 {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    String r = "";
    while (n > 0) {
      r = ((n & 1) == 1 ? "1" : "0") + r;
      n >>= 1;
    }
    System.out.println(r);
  }
}