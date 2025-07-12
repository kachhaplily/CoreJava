class LoopTask {
    public static void main(String args[]) {

        // 1. Print numbers from 1 to 10 (using while)

        // int u=0;
        // while(u<=10){
        // u++;
        // System.out.println(u);
        // }

        // 2 Print even numbers between 1 and 20 (using for)

        // for(int f=1;f<=20;f++){
        // if( f%2==0){
        // System.out.println(f);
        // }
        // }

        // 3 Print numbers from 10 to 1 (using do-while)

        // int b=10;
        // do{
        // System.out.println(b);
        // b--;

        // }while(b>=1);

        // 4/. Calculate the sum of first 100 natural numbers (using for)
        // int sum=0;
        // for(int x=0; x<=100;x++){
        // sum+=x;

        // }
        // System.out.println(sum);

        // 5. Count digits of a number (e.g., 4567) (using while)

        // int num = 54645756;
        // int count = 0;
        // while (num != 0) {
        // num /= 10;
        // count++;
        // }
        // System.out.println("Digits = " + count);

        // 6 reverse the number
        // int num = 1255;
        // int reverse = 0;
        // while (num != 0) {
        // int digit = num % 10;

        // reverse = reverse * 10 + digit;

        // num /= 10;
        // }
        // System.out.println("Reversed: " + reverse);

        // 7 check number is prime or not

        // int num = 7;
        // boolean isPrime = true;

        // if (num <= 1)
        // isPrime = false;

        // for (int i = 2; i <= num / 2; i++) {
        // if (num % i == 0) {
        // isPrime = false;
        // break;
        // }
        // }

        // System.out.println(num + " is prime? " + isPrime);

        // print a to z;

        char ch = 'a';
        while (ch <= 'z') {
            System.out.println(ch);
            ch++;

        }
    }
}