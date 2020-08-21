package com.company.functionalInterface;

import java.util.function.Consumer;

public class ConsumerApi {
    public static void main(String[] args) {

        Consumer<String> consumer = (str)-> System.out.println(str+" ##description : return이 없는 void 이고 인자를 받는 메소드를 갖고있음");
        consumer.accept("wonseok");

        Consumer<Integer> consumer1 = (a)-> System.out.println(a);
   /*
   리턴을 하지않고(void), 하나의 인자를 받는 메서드를 갖고있다. 인자를 받아 소모한다는 뜻으로 인터페이스 명칭을 이해하면 될듯 하다.
    */

    }

}
