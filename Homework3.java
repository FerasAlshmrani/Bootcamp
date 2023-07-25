import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Task 1
        System.out.println("//// Task 1 ////");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }

        // Task 2
        System.out.println("//// Taske 2 ////");

        System.out.println("Input a string");
        String string1 = input.nextLine();
        String reverse = "";


        for (int i = string1.length() - 1; i < string1.length(); i--) {
            if (i != -1) {
                reverse += string1.charAt(i);
            } else {
                break;
            }
        }
        System.out.println("Reverse string " + reverse);

        // Task 3
        System.out.println("//// Task 3 ////");

        System.out.println("Enter positive number to multiply");
        int multinum = input.nextInt();
        for (int i = 1; i <= 12; i++) {
            if (i < 0) {
                break;
            }
            System.out.println("The multi " + i + " * " + multinum + " = " + (i * multinum));
        }


        // Task 4
        System.out.println("//// Task 4 ////");

        System.out.println("enter any number to find Factorial");
        int fact = input.nextInt();
        int sum = fact;

        for (int i = fact; i != 0; i--) {
            if (i == sum) {
                continue;
            }
            sum *= i;
        }
        System.out.println("The Factorial of " + fact + " is " + sum);

        // Task 5
        System.out.println("//// Task 5 ////");

        System.out.println("Enter 2 numbers to use power of another");

        int number = input.nextInt();
        int power = input.nextInt();
        int total = number;
        for (int i = 1; i < power; i++) {
            total *= number;
        }
        System.out.println("The total of number " + number + " power of " + power + " = " + total);

        // Task 6
        System.out.println("//// Task 6 ////");

        System.out.println("Enter to check how many even and odds");
        int enter_number = input.nextInt();
        int sum_even = 0;
        int sum_odd = 0;
        for (int i = 0; i <= enter_number; i++) {
            if (i % 2 == 0) {
                sum_even += i;
            } else {
                sum_odd += i;
            }
        }
        System.out.println("The sum of even is " + sum_even + " The sum of odd is " + sum_odd);

        // Task 7
        System.out.println("//// Task 7 ////");

        int counter= 0;
        System.out.println("Enter number to check if its prime or not");
        int prime = input.nextInt();
        for(int i = 1;i <= prime;i++){
            if(i<0) {
                System.out.println("This "+" Prime Should be Positive");
            }
            if(prime%i == 0){
                counter++;
            }

        }
        if(counter == 2){
            System.out.println("this "+prime+" is a prime number");
        }
        else{
            System.out.println("this "+prime+" is not a prime number");
        }


        // Task 8
        System.out.println("//// Task 8 ////");

        int positive_counter = 0;
        int negative_counter = 0;
        for (int i = 1; i >= 0; i++) {
            System.out.println("Enter positive number to count or negative if you want to stop press 0 ");
            int j = input.nextInt();
            if (j > 0) {
                positive_counter++;
            } else if (j < 0) {
                negative_counter++;
            } else {
                break;
            }
        }
        System.out.println("The counter of positive number is " + positive_counter + " and the counter of negative number is " + negative_counter);

        // Task 9
        System.out.println("//// Task 9 ////");

        for (int i = 1; i <= 4 ; i++){
            System.out.println("Week "+i);
            for(int j = 1 ; j<=7 ; j++){
                System.out.println("Day"+j);
            }
        }
    }
}