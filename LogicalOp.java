// Write a program that checks if a number is between 10 and 20 (inclusive).

import java.util.Scanner;

public class LogicalOp{
    public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isInit = number>=10 && number<=20;

        System.out.println(isInit);


         //eligibility check
// A person is eligible to vote if age >= 18 and is an Indian citizen. Use logical operators to verify.

System.out.print("Enter your age");
int age = scanner.nextInt();

boolean isEligible= age>=18;

if(isEligible==true){

System.out.println("Your are eligible");
}
else{
      System.out.println("Your are not eligible");  
}

    }
   

}