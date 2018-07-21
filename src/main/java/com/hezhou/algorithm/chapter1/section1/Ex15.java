package com.hezhou.algorithm.chapter1.section1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex15 {
  public static int[] histogram1(int[] a, int M) {
    // 此实现方案有点没理解题意，并不用统计数组 a 中每个元素出现的次数，
    // 只用统计出值在 [0,M) 之间的数即可。

    int[] arr = new int[M];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
      int v = a[i];
      if (map.containsKey(v)) {
        map.put(v, map.get(v) + 1);
      } else {
        map.put(v, 1);
      }
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      arr[entry.getKey()] = entry.getValue();
    }
    return arr;
  }

  public static int[] histogram(int[] a, int M) {
    int[] result = new int[M];
    for (int i = 0; i < a.length; i++) {
      int v = a[i];
      if (v >= 0 && v < M) {
        result[v]++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 3, 2, 5, 1, 2 };
    int[] result = histogram(a, 6);
    System.out.println(Arrays.toString(result));

    int sum = 0;
    for (int i = 0; i < result.length; i++) {
      sum += result[i];
    }
    System.out.println(a.length == sum);
  }
}
