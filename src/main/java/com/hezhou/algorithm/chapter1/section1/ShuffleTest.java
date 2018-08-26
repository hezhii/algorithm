package com.hezhou.algorithm.chapter1.section1;

import edu.princeton.cs.algs4.StdRandom;

public class ShuffleTest {
  public static void main(String[] args) {
    int M = Integer.parseInt(args[0]);
    int N = Integer.parseInt(args[1]);

    int[] arr = new int[M];
    int[][] result = new int[M][M];

    for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[j] = j;
			}
			StdRandom.shuffle(arr);
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