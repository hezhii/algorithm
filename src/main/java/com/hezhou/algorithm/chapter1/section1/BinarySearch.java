package com.hezhou.algorithm.chapter1.section1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

public class BinarySearch {
  public static int indexOf(int[] a, int key) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
      // Key is in a[lo..hi] or not present.
      int mid = lo + (hi - lo) / 2;
      if (key < a[mid])
        hi = mid - 1;
      else if (key > a[mid])
        lo = mid + 1;
      else
        return mid;
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
    System.out.println("Binary search time: " + (endTime - startTime));
  }
}