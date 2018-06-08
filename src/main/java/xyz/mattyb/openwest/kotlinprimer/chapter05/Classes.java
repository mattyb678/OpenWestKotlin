package xyz.mattyb.openwest.kotlinprimer.chapter05;

public class Classes {
    public static void main(String[] args) {
        Object toCheck = "Checking";
        boolean isObject = toCheck instanceof Object;
        boolean isNumber = toCheck instanceof Number;
        System.out.println("String is object: " + isObject);
        System.out.println("String is number: " + isNumber);

        if (toCheck instanceof String) {
            String upper = ((String) toCheck).toUpperCase();
            System.out.println(upper);
        }

        String indented = ((String) toCheck).replaceFirst("C", "\tC");
        System.out.println(indented);
    }
}
