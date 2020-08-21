package com.company;

import com.company.lamdastudy.Car;
import com.company.lamdastudy.Movable;

public class Main {

    public static void main(String[] args) {
        //람다
        Movable movable = new Movable(){
            @Override
            public void move(String str) {
                System.out.println("익명클래스 활용: "+str);
            }
        };
        Movable movable1 = (str)->{
            System.out.println("람다 적용 해당 인터페이스 메소드가 1개일때 사용가능 : "+ str);
        };
        movable1.move("wonseok");
        movable.move("wonseok");
    //--------------------------------------------------------------------------------------------------------
        new Car(){
            @Override
            public void move(String str) {
                System.out.println("구현 클래스의 익명클래스 : "+str);
            }
        }.move("wonseok");

        // 안되는 예시  람다는 추상메소드가 1개인 인터페이스에서만 사용가능 -> 1개인지 알려주는 어노테이션 @FunctionalInterface
//        Car car = (str)->{
//            System.out.println("wonseok");
//        };
//        구현 클래스 람다 x

    }
}
