package com.hezhou.algorithm.chapter1.section1;

public class Matrix {
  /**
   * 向量点乘：两个向量对应位一一相乘之后求和。 要求列数相同。
   */
  public static double dot(double[] x, double[] y) {
    if (x.length != y.length) {
      throw new RuntimeException("列数不同");
    }

    double result = 0;
    for (int i = 0; i < x.length; i++) {
      result += x[i] * y[i];
    }
    return result;
  }

  /**
   * 矩阵乘法
   */
  public static double[][] mult(double[][] a, double[][] b) {
    if (a[0].length != b.length) {
      throw new RuntimeException("A 的列数应该等于 B 的行数");
    }

    double[][] r = new double[a.length][b[0].length];
    for (int i = 0; i < r.length; i++) {
      for (int j = 0; j < r[0].length; j++) {
        for (int k = 0; k < b.length; k++) {
          r[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    return r;
  }

  /**
   * 矩阵转置
   */
  public static double[][] transpose(double[][] a) {
    double[][] r = new double[a[0].length][a.length];
    for (int i = 0; i < r.length; i++) {
      for (int j = 0; j < r[0].length; j++) {
        r[i][j] = a[j][i];
      }
    }
    return r;
  }

  /**
   * 矩阵和向量之积
   */
  public static double[] mult(double[][] a, double[] x) {
    if (a[0].length != x.length) {
      throw new RuntimeException("A 的列数应该等于 B 的行数");
    }

    double[] r = new double[a.length];
    for (int i = 0; i < r.length; i++) {
      for (int j = 0; j < x.length; j++) {
        r[i] += a[i][j] * x[j];
      }
    }
    return r;
  }

  /**
   * 向量和矩阵之积
   */
  public static double[] mult(double[] y, double[][] a) {
    if (y.length != a.length) {
      throw new RuntimeException("A 的列数应该等于 B 的行数");
    }

    double[] r = new double[a[0].length];
    for (int i = 0; i < r.length; i++) {
      for (int j = 0; j < y.length; j++) {
        r[i] += y[j] * a[j][i];
      }
    }
    return r;
  }
}