package xyz.mattyb.openwest.kotlinprimer.chapter04;

import java.util.Random;

public class Ternary {
    public static void main(String[] args) {
        int x = rand();
        String outcome = x > 75 ? "Awesome Sauce" : "Not too shabby";

        System.out.println(x + " is " +outcome);

        String maybe = maybeNull();

        String result = maybe == null ? "Better luck next time" : maybe;

        System.out.println(result);
    }

    private static int rand() {
        return new Random().nextInt(100);
    }

    private static String maybeNull() {
        int rand = rand();
        if (rand % 2 == 0) {
            return null;
        }
        return "Totes not null";
    }
}
