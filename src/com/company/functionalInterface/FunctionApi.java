package com.company.functionalInterface;

import java.text.Format;
import java.util.function.Function;

public class FunctionApi {
    public static void main(String[] args) {
        Function<String,Integer> function = str->Integer.parseInt(str);
        Integer result = function.apply("10");
        System.out.println(result.getClass().getName());

        /*

        인터페이스 명칭에서부터 알 수 있듯이 전형적인 함수를 지원한다고 보면
         된다. 하나의 인자와 리턴타입을 가지며 그걸 제네릭으로 지정해줄수있다. 그래서 타입파라미터(Type Parameter)가 2개다.

         */
    }
}
