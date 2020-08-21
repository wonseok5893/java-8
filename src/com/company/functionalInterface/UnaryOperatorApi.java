package com.company.functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorApi {

    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (str)-> {
            System.out.println("method run");return str+" wonseok";};
        String result = unaryOperator.apply("hello");
        System.out.println(result);
    /*
    하나의 인자와 리턴타입을 가진다. 그런데 제네릭의 타입파라미터가 1개인걸 보면 감이 오는가? 인자와 리턴타입의 타입이 같아야한다.
     */

    }
}
