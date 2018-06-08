package xyz.mattyb.openwest.kotlinprimer.chapter07;

import java.util.*;

import static java.util.stream.Collectors.joining;

public class Collectionz {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Kotlin", "So", "Hot");

        System.out.println(strings.stream().collect(joining(". ")));

        Map<String, Integer> ratings = new HashMap<>();
        ratings.put("Java", 70);
        ratings.put("Clojure", 90);
        ratings.put("Kotlin", 95);

        System.out.println(ratings.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)));

        // No ranges
    }
}
