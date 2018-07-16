package com.hezhou.algorithm.chapter1.section1;

public class Ex03 {
  public static void main(String[] args) {
    if (args.length == 3 && args[0].equals(args[1]) && args[0].equals(args[2])) {
      System.out.println("equal");
    } else {
      System.out.println("not equal");
    }
  }
}