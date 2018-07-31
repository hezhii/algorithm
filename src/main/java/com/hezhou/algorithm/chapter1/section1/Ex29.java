package com.hezhou.algorithm.chapter1.section1;

import java.util.Arrays;

public class Ex29 {
  public static int rank(int key, int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < key) {
        count++;
      } else {
        break;
      }
    }
    return count;
  }

  public static int count(int key, int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        count++;
      } else if (arr[i] > key) {
        break;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 7, 6, 8, 8, 9, 9, 10, 11 };
    Arrays.sort(arr);

    int key = 4;
    int i = rank(key, arr);
    int j = count(key, arr);

    System.out.println("数组: " + Arrays.toString(arr));
    System.out.println("key: " + key);
    System.out.printf("数组中比 %d 小的元素数量为: %d\n", key, i);
    System.out.printf("数组中等于 %d 的元素数量为: %d\n", key, j);

    if (j > 0) {
      for (int k = i; k < i + j - 1; k++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }
}