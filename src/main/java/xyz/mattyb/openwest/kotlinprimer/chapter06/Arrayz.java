package xyz.mattyb.openwest.kotlinprimer.chapter06;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class Arrayz {
    public static void main(String[] args) {
        String[] arr = {"Hello", "World"};

        System.out.println(Arrays.stream(arr).collect(joining(" ")));

        Integer[] intArr = new Integer[] {1, 2, 3, 4};

        System.out.println(Arrays.stream(intArr).mapToInt(Integer::intValue).sum());
    }
}
