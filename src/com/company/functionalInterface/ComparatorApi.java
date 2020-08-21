package com.company.functionalInterface;

import java.util.Comparator;

public class ComparatorApi {
    public static void main(String[] args) {
        Comparator<String> c = (str1, str2) -> str1.compareTo(str2);
        int result = c.compare("aaa", "aaa"); ///0 이 같음 -1이 다름
        System.out.println(result);
        
    }
}
