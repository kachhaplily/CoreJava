package NestedLoop;

public class TaskOne {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) { // Outer loop → rows
            for (int j = 0; j <= 7; j++) { // Inner loop → columns
                System.out.println(j + " ");
            }
            System.out.println(); // Go to the next line after each row
        }
    }
}
