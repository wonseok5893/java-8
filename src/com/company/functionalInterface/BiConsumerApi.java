package com.company.functionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerApi {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (str, num) -> System.out.println(str + " " + num);
        biConsumer.accept("숫자",5);
        //서로 다른 타입의 2개의 인자를 받아 소모(void)한다.

    }
}
