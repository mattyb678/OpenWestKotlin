package xyz.mattyb.openwest.kotlinprimer.chapter01;

public class Variables {
    public static void main(String[] args) {
        final int percentLuck  = 10;
        final Integer perentSkill = 20;

        System.out.println("This is " + percentLuck + " percent luck");
        System.out.println(perentSkill + " percent skill");

        // Will it compile?
        // percentLuck = 100;

        int percentConcentratedPowerOfWill = 3;
        percentConcentratedPowerOfWill *= 5;
        System.out.println(percentConcentratedPowerOfWill + "percent concentrated power of will");
    }
}
