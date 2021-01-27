package com.company.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) {
        // type: Integer
        IntStream.of(1, 2, 3, 4).forEach(System.out::println);
        // Array
        Arrays.stream(new int[]{1, 2, 3, 4})
                .map(e -> e + 1)
                .filter(e -> e > 2).asDoubleStream()
                .anyMatch(e -> e == 3);
        IntStream.of(1, 2, 3, 4, 5, 6).mapToDouble(Double::valueOf).peek(System.out::println).average().getAsDouble();

        /// db에 현재와 같은 리스트 저장
        List<Person> lists = Arrays.asList(new Person("최원석", 27, "남", "01012345617"),
                new Person("정현정", 24, "녀", "12345617"),
                new Person("최진성", 26, "남", "01045645623"));
        //Collections map
        // <나이 , 이름>
        Map<Integer, List<String>> collect = lists.stream().collect(
                Collectors.groupingBy(Person::getAge,
                        Collectors.mapping(Person::getName, Collectors.toList())));

//        collect.forEach((key, value) -> {
//            System.out.print(key + " : ");
//            value.forEach(e -> System.out.print(" " + e + " "));
//            System.out.println();
//        });

        //그래프
        //인접 리스트
        String[][]graph = new String[][]{{"1","2"},{"3","5"},{"2","3"},{"4","5"},{"1","5"}};
        Map<String, List<String>> collect1 = Arrays.stream(graph).collect(Collectors.groupingBy(e -> e[0],
                Collectors.mapping(e -> e[1], Collectors.toList())));
        collect1.forEach((k,v)->{
            System.out.print(k + " : ");
            v.forEach(e -> System.out.print(" " + e + " "));
            System.out.println();
        });
        // 그래프 키
        Arrays.stream(graph).collect(Collectors.mapping(e -> e[0], Collectors.toSet())).forEach(e-> System.out.println(e));

    }

    private static class Person {
        String name;
        int age;
        String sex;
        String phoneNumber;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Person(String name, int age, String sex, String phoneNumber) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.phoneNumber = phoneNumber;
        }
    }
}
