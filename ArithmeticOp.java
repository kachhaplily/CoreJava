 class ArithmeticOp{
    public static void main(String[] args) {

        int num1 = 7;
        int num2 = 5;

        // Basic Arithmetic
        int sum = num1 + num2;         // Addition
        int diff = num1 - num2;        // Subtraction
        int product = num1 * num2;     // Multiplication
        int division = num1 / num2;    // Integer Division
        int remainder = num1 % num2;   // Modulus

        // Increment / Decrement
        int postInc = num1++;          // Post-increment
        int preInc = ++num1;           // Pre-increment
        int postDec = num2--;          // Post-decrement
        int preDec = --num2;           // Pre-decrement

        // Output
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + remainder);

        System.out.println("Post-increment (num1++): " + postInc);
        System.out.println("After Post-increment, num1: " + num1);
        System.out.println("Pre-increment (++num1): " + preInc);

        System.out.println("Post-decrement (num2--): " + postDec);
        System.out.println("After Post-decrement, num2: " + num2);
        System.out.println("Pre-decrement (--num2): " + preDec);
    }
}
