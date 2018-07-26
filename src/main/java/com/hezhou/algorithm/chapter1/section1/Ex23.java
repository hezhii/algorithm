package com.hezhou.algorithm.chapter1.section1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex23 {
  public static int rank(int key, int[] a) {
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi) {
      int mid = lo + (hi - lo) / 2;
      if (key < a[mid]) {
        hi = mid - 1;
      } else if (key > a[mid]) {
        lo = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  // <code>mvn exec:java -Dexec.mainClass="com.hezhou.algorithm.chapter1.section1.Ex23" -Dexec.args="data/tinyW.txt +" < data/tinyT.txt</code>
  public static void main(String[] args) {
    In in = new In(args[0]);
    int[] whitelist = in.readAllInts();

    Arrays.sort(whitelist);

    // "-" 打印在白名单的值，"+" 打印不在白名单中的值
    Boolean showExisting = "-".equals(args[1]);

    while (!StdIn.isEmpty()) {
      int key = StdIn.readInt();
      int index = rank(key, whitelist);
      if (showExisting && index != -1 || index == -1)
        StdOut.println(key);
    }
  }
}
