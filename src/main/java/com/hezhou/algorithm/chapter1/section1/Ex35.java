package com.hezhou.algorithm.chapter1.section1;

import edu.princeton.cs.algs4.StdRandom;

public class Ex35 {
  public static final int SIDES = 6;

  public static double[] getProbabilities() {
    double[] dist = new double[2 * SIDES + 1];
    for (int i = 1; i <= SIDES; i++) {
      for (int j = 1; j <= SIDES; j++) {
        dist[i + j] += 1.0;
      }
    }
    for (int k = 2; k <= 2 * SIDES; k++) {
      dist[k] /= 36.0;
    }
    return dist;
  }

  public static void main(String[] args) {
    System.out.println("理论概率分布为：");
    double[] theories = getProbabilities();
    for (int i = 2; i < theories.length; i++) {
      System.out.printf("%d:%.3f ", i, theories[i]);
    }
    System.out.println();

    int N = Integer.parseInt(args[0]);
    int[] num = new int[2 * 6 + 1];
    for (int i = 0; i < N; i++) {
      num[StdRandom.discrete(theories)]++;
    }

    double actuall;
    boolean isAccurate = true;
    System.out.println("实际概率分布:");
    for (int i = 2; i <= 2 * SIDES; i++) {
      actuall = (double) num[i] / N;
      System.out.printf("%d:%.3f ", i, actuall);
      if (Math.abs(actuall - theories[i]) > 0.001) {
        isAccurate = false;
      }
    }
    System.out.println();
    System.out.println("数据是否吻合：" + isAccurate);
  }
}