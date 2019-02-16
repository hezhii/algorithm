package com.hezhou.algorithm.chapter1.section3;

public interface Bag<T> extends Iterable<T> {
    void add(T t);

    boolean isEmpty();

    int size();
}
