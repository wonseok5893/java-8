package com.company.functionalInterface;

import java.util.function.Predicate;

public class PredicateApi {
    public static void main(String[] args) {

    Predicate<String> p = str -> !str.isEmpty();
    boolean result = p.test("hello");
        System.out.println(result);
    }

    /*
    하나의 인자와 리턴타입을 가진다. Function과 비슷해보이지만 리턴타입을 지정하는 타입파라미터가 안보인다.
    반환타입은 boolean 타입으로 고정되어있다. Function<T, Boolean>형태라고 보면된다.

     */

}
