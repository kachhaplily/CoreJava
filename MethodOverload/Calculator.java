package MethodOverload;

public class Calculator {
    public static void main(String[] args) {
        InnerCalculator inc = new InnerCalculator();
        int a = inc.add(4, 5, 6);
        int b = inc.add(2, 4);
        double c = inc.add(3.5, 4.2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}

class InnerCalculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
