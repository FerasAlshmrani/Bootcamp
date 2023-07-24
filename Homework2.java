import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        // Task 1
        System.out.println("//// Task 1 ////");

        System.out.print("input first number: ");
        int num1 = Integer.parseInt(input.nextLine());;
        System.out.print("input second number: ");
        int num2 = Integer.parseInt(input.nextLine());;
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
        System.out.println(num1+" / "+num2+" = "+(num1/num2));
        System.out.println(num1+" % "+num2+" = "+(num1%num2));


        // Task 2
        System.out.println("//// Task 2 ////");

        System.out.print("Input a String: ");

        String string1 = input.nextLine();

        System.out.println(string1.toLowerCase());

        // Task 3
        System.out.println("//// Task 3 ////");

        System.out.println("Input a string: ");
        String string2= input.nextLine();
        System.out.println("Input a number: ");
        int num3 = Integer.parseInt(input.nextLine());
        System.out.println(string2.charAt(num3));

        // Task 4
        System.out.println("//// Task 4 ////");

        System.out.println("Enter a number");
        int num4 = Integer.parseInt(input.nextLine());;
        if(num4 % 2 == 0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

        // Task 5
        System.out.println("//// Task 5 ////");

        System.out.print("what role you are :");
        String role = input.nextLine();
        if(role.equals("admin")){
            System.out.println("Welcome admin");
        } else if (role.equals("superuser")) {
            System.out.println("Welcome superuser");
        } else if (role.equals("user")) {
            System.out.println(("Welcome user"));
        }else{
            System.out.println("INVALID");
        }

        // Task 6
        System.out.println("//// Task 6 ////");

        System.out.print("Input the first number: ");
        int number1 = Integer.parseInt(input.nextLine());;
        System.out.print("Input the second number: ");
        int number2 = Integer.parseInt(input.nextLine());;
        System.out.print("Input the third number: ");
        int number3 = Integer.parseInt(input.nextLine());;

        if(number1 + number2 == number3){
            System.out.println("The result is: "+true);
        }
        else{
            System.out.println("The result is: "+false);
        }

        // Task 7
        System.out.println("//// Task 7 ////");

        System.out.println("enter 3 number to get the biggest number");
        System.out.print("Input the 1st number: ");
        int bignum1 = Integer.parseInt(input.nextLine());
        System.out.print("Input the 2nd number: ");
        int bignum2 = Integer.parseInt(input.nextLine());
        System.out.print("Input the 3rd number: ");
        int bignum3 = Integer.parseInt(input.nextLine());

        if(bignum1>bignum2 && bignum1>bignum3){
            System.out.println("The greatest: "+ bignum1);
        } else if (bignum2>bignum1 && bignum2>bignum3) {
            System.out.println("The greatest: "+ bignum2);
        }
        else{
            System.out.println("The greatest "+ bignum3);
        }

        // Task 8
        System.out.println("//// Task 8 ////");

        int daynum=Integer.parseInt(input.nextLine());;
        switch (daynum){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}