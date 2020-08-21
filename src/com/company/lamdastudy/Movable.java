package com.company.lamdastudy;

@FunctionalInterface
public interface Movable {
    void move(String str);
    //void ride(String str); 시 에러 발생 @FunctinalInterface 로 인해
}
