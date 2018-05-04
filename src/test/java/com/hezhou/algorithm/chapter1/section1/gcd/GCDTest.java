package com.hezhou.algorithm.chapter1.section1.gcd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * GCDTest
 */
public class GCDTest {

  @Test
  public void test() {
    assertEquals("36 和 23 的最大公约数为 12", 12, GCD.euclid(36, 24));
  }
}