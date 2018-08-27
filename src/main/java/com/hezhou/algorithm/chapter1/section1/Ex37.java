package com.hezhou.algorithm.chapter1.section1;

import edu.princeton.cs.algs4.StdRandom;

public class Ex37 {
  public static void shuffle(int[] a) {
    int n = a.length;
    for (int i = 0; i < n; i++) {
      // int r = i + StdRandom.uniform(n - i); // between i and n-1
      int r = StdRandom.uniform(n); // between 0 and n-1
      int temp = a[i];
      a[i] = a[r];
      a[r] = temp;
    }
  }

  public static void main(String[] args) {
    int M = Integer.parseInt(args[0]);
    int N = Integer.parseInt(args[1]);

    int[] arr = new int[M];
    int[][] result = new int[M][M];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        arr[j] = j;
      }
      shuffle(arr);
      for (int j = 0; j < M; j++) {
        result[arr[j]][j]++;
      }
    }
    for (int i = 0; i < M; i++) {
      for (int j = 0; j < M; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }
}