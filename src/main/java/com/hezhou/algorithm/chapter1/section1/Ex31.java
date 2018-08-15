package com.hezhou.algorithm.chapter1.section1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Ex31 {
  static class Point {
    double x;
    double y;

    public Point(double x, double y) {
      this.x = x;
      this.y = y;
    }
  }

  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    double p = Double.parseDouble(args[1]);

    double radius = 0.5;
    StdDraw.circle(0.5, 0.5, radius);
    StdDraw.setPenRadius(0.05);
    StdDraw.setPenColor(StdDraw.RED);

    double average = Math.PI * 2 / N;
    Point[] points = new Point[N];
    for (int i = 0; i < N; i++) {
      double angle = average * i;
      double x = radius + radius * Math.cos(angle);
      double y = radius + radius * Math.sin(angle);
      points[i] = new Point(x, y);
      StdDraw.point(x, y);
    }

    StdDraw.setPenRadius(0.01);
    StdDraw.setPenColor(StdDraw.GRAY);
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if (StdRandom.bernoulli(p)) {
          StdDraw.line(points[i].x, points[i].y, points[j].x, points[j].y);
        }
      }
    }
  }
}