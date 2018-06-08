package xyz.mattyb.openwest.kotlinprimer.chapter02;

public class Strings {
    public static void main(String[] args) {
        String firstName = "matt";
        String lastName = "berteaux";
        String name = firstName.substring(0, 1).toUpperCase() + firstName.substring(1) + " "
                + lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        System.out.println(name);

        String haiku = "Five syllables here.\n" +
                "Seven more syllables here.\n" +
                "Are you happy now?";

        System.out.println("\""+ haiku +"\"");
    }
}
