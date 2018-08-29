package com.hezhou.algorithm.chapter1.section1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

public class BruteForceSearch {
  public static int indexOf(int[] a, int key) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    In in = new In(args[0]);
    int[] whitelist = in.readAllInts();
    Arrays.sort(whitelist);

    while (!StdIn.isEmpty()) {
      int key = StdIn.readInt();
      if (indexOf(whitelist, key) < 0) {
        System.out.println(key);
      }
    }
    long endTime = System.currentTimeMillis();
    System.out.println("Brute sorce search time: " + (endTime - startTime));
  }
}