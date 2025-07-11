 import java.util.Scanner;

 
 class Conditionalop{
    public static void main(String args[]){

        //if  else

        int a =10;
        if(a!=10){
            System.out.println("A is not equal to 10");
        }
        else{
            System.out.println("A is equal to 10");
        }


            //else if condition
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }


            //ternary oprator

             System.out.print("Enter your fav number ");
        int favNum = scanner.nextInt();

         String result = (favNum % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number is " + result);

        scanner.close();
    


    }
}