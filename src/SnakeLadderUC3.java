package com.problems;

public class SnakeLadderUC3 {
    public static void main(String[] args) {
        int position = 20;
        int dicenumber = (int) Math.floor(Math.random() * 6 + 1);
        int value = (int) Math.floor(Math.random() * 3);

        /*
         * To check options for palyer using condition
         */

        if (value == 1) {
            position += dicenumber;
            System.out.println("Player got ladder");
            System.out.println("Player shifted forward by " + dicenumber + " number");
        } else if (value == 2) {
            position -= dicenumber;
            System.out.println("Player got snake");
            System.out.println("Player shifted backward by " + dicenumber + " number");
        } else {
            System.out.println("Player should stay on same position");
        }

    }
}
