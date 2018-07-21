package com.hezhou.algorithm.chapter1.section1;

public class Ex14 {
  public static int lg(int N){
    int count = 0;
    while(N!=0){
      N >>=1;
      count++;
    }
    return count-1;
  }

  public static void main(String[] args) {
    System.out.println(lg(Integer.parseInt(args[0])));
  }
}
