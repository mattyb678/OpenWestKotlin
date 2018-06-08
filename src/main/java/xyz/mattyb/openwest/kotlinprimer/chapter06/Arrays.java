package xyz.mattyb.openwest.kotlinprimer.chapter06;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.summingInt;

public class Arrays {
    public static void main(String[] args) {
        String[] arr = {"Hello", "World"};

        System.out.println(java.util.Arrays.stream(arr).collect(joining(" ")));

        Integer[] intArr = new Integer[] {1, 2, 3, 4};

        System.out.println((Integer) java.util.Arrays.stream(intArr).mapToInt(Integer::intValue).sum());
    }
}
