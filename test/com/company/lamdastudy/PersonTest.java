package com.company.lamdastudy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void anonymousClassTest(){
        Movable movable = new Movable() {
            @Override
            public void move(String str) {
                System.out.println(str+"anonymous class executed");
            }
        };
        movable.move("1: ");
    }
    @Test
    void landaTest(){
        Movable movable = (System.out::println);
        Movable movable1 = (str-> System.out.println(str+"lamda expression"));

        movable.move("2: ");
        movable1.move("3: ");
    }


}