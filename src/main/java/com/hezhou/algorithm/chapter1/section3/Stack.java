package com.hezhou.algorithm.chapter1.section3;

public interface Stack<T> extends Iterable<T> {
    void push(T t);

    T pop();

    boolean isEmpty();

    int sieze();
}
