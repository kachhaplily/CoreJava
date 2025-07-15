//  Example 2: Print  different a triangle of stars

package NestedLoop;

public class TaskThree {
    public static void main(String[] args) {
        // for (int i = 0; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }
        // op
        /**
         * 
         **
         ***
         ****
         *****
         */

        /**
         * 
         * right alight star
         */

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
