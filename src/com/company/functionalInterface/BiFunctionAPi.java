package com.company.functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionAPi {
    public static void main(String[] args) {
        BiFunction<Integer, String, String> bf = (num, str) -> String.valueOf(num) + str;
        String result = bf.apply(5, "678");
        System.out.println(result);


    }
}
