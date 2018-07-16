package com.hezhou.algorithm.chapter1.section1;

public class Ex05 {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("请指定参数 x 和 y");
      return;
    }
    try {
      Double x = Double.parseDouble(args[0]);
      Double y = Double.parseDouble(args[1]);
      System.out.println(x > 0 && x < 1 && y > 0 && y < 1);
    } catch (NumberFormatException err) {
      System.out.println(false);
    }
  }
}