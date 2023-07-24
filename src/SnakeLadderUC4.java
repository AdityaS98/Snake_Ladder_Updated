package com.problems;

public class SnakeLadderUC4 {
    public static void main(String[] args) {
        int position = 0;

        /*
         * Used while loop to insure our player should reach the winning position
         */

        while (position != 100) {

            /*
             * To get dice value
             */

            int dicenumber = (int) Math.floor(Math.random() * 6 + 1);

            /*
             * To check player chance to play or get snake or ladder using random
             */

            int value = (int) Math.floor(Math.random() * 3);

            /*
             * To check options for player using if condition
             */

            if (value == 1) {
                position += dicenumber;
                System.out.println("Player got ladder");
                System.out.println("Player shifted forward by " + dicenumber + " number");
            } else if (value == 2) {
                position -= dicenumber;
                System.out.println("Player got snake");
                System.out.println("Player shifted backward by " + dicenumber + " number");

                /*
                 * As mentioned in problem statement if value of position is less than zero
                 * player should start from zero position
                 */
                if (position < 0) {
                    position = 0;
                }
            } else {
                System.out.println("Player should stay on same position");
            }
        }
        System.out.println("Player win the game");
    }
}
