import java.util.Scanner;

public class MultiplicationLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table number:");
        int table = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "" + "*" + table + "=" + i * table);
        }
        sc.close();
    }

}
