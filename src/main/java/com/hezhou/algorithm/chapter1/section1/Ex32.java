package com.hezhou.algorithm.chapter1.section1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class Ex32 {
  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    double l = Double.parseDouble(args[1]);
    double r = Double.parseDouble(args[2]);
    double[] nums = StdIn.readAllDoubles();

    double step = (r - l) / N;
    int[] result = new int[N];
    int max = 0; // 统计最大值

    for (int i = 0; i < nums.length; i++) {
      double num = nums[i];
      if (num >= l && num <= r) {
        for (int j = 0; j < N; j++) {
          if (num >= l + step * j && num < l + step * (j + 1)) {
            result[j]++;
            if (max < result[j]) {
              max = result[j];
            }
          }
        }
      }
    }

    double width = 1.0 / N;
    double halfWidth = width / 2.0;
    for (int i = 0; i < N; i++) {
      double x = i * width + halfWidth;
      double y = result[i] / (max * 2.0);
      StdDraw.filledRectangle(x, y, halfWidth, y);
    }
  }
}