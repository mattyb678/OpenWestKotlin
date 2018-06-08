package xyz.mattyb.openwest.kotlinprimer.chapter03;

public class Nulls {
    public static void main(String[] args) {
        final String title = null;

        // will it compile?
        // long salary = null;
        Long salary = null;

        System.out.println("salary before job: " + salary);

        salary = 1_000_000_000_000_000L;

        System.out.println("salary after job: " + salary);

        Employee bob = new Employee();

        Integer headNameLength = null;
        if (bob.getDepartment() != null) {
            if (bob.getDepartment().getHead() != null) {
                if (bob.getDepartment().getHead().getName() != null) {
                    headNameLength = bob.getDepartment().getHead().getName().length();
                }
            }
        }

        System.out.println("head name length: " + headNameLength);
    }
}
