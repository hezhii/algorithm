package com.hezhou.algorithm.chapter1.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

public class Ex28 {
  public static void main(String[] args) {
    In in = new In(args[0]);
    int[] whitelist = in.readAllInts();
    Arrays.sort(whitelist);

    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < whitelist.length - 1; i++) {
      if (whitelist[i] != whitelist[i + 1]) {
        list.add(whitelist[i]);
      }
    }
    list.add(whitelist[whitelist.length - 1]);

    whitelist = new int[list.size()];
    for (int i = 0; i < whitelist.length; i++) {
      whitelist[i] = list.get(i);
      System.out.print(whitelist[i] + " ");
    }
    System.out.println();
    while (!StdIn.isEmpty()) {
      int key = StdIn.readInt();
      if (BinarySearch.indexOf(whitelist, key) < 0) {
        System.out.println(key);
      }
    }
  }
}