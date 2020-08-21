package com.company.functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateApi {
    public static void main(String[] args) {

    //인자 한개 이상
    BiPredicate<String, Integer> bp = (str, num) -> str.equals(Integer.toString(num));
    boolean result = bp.test("1", 1);
        System.out.println(result);
    //인자 한개 Predicate
    Predicate<Integer> pre = (num)-> num>10;
    boolean result1 = pre.test(9);
        System.out.println(result1);
    }

}
