package com.company.functionalInterface;

import java.util.function.Supplier;

public class SupplierApi {
    public static void main(String[] args) {

    Supplier<String> s = ()->"Wonseok";
    String result = s.toString();
    String result1 = s.get();
    Class result2 = s.getClass();
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }

}
