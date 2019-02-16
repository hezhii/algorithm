package com.hezhou.algorithm.chapter1.section3;

public interface Queue<T> extends Iterable<T> {
    void enqueue(T t);

    T dequeue();

    boolean isEmpty();

    int sieze();
}
