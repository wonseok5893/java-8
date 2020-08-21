package com.company.functionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorApi {
    public static void main(String[] args) {

        BinaryOperator<String> b = (str1, str2) -> str1 + " " + str2;
        String result = b.apply("hello", "binary");
        System.out.println(result);
        /*
        동일한 타입의 인자 2개와 인자와 같은 타입의 리턴타입을 가진다.
         */

    }
}
