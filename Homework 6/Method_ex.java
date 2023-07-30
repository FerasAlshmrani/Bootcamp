import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;


//try catch in line 19 ,43
public class Method_ex {
    public static void main(String[] args) {

        ArrayList<String> results = new ArrayList<String>();
        int i = 0;
        do {
            System.out.println("Enter 2 Numbers ");
            int num1 = 0;
            int num2 = 0;

            for(int j = 1 ; j > 0 ;j++) {
                try {
                    Scanner scanner = new Scanner(System.in);
                     num1 = scanner.nextInt();
                     num2 = scanner.nextInt();
                } catch (InputMismatchException e2) {
                    System.out.println("Please Enter 2 number not String ");
                    continue;
                }
                break;
            }


            System.out.println("Enter 1 to addition the numbers");
            System.out.println("Enter 2 to subtraction the numbers");
            System.out.println("Enter 3 to multiplication the numbers");
            System.out.println("Enter 4 to division the numbers");
            System.out.println("Enter 5 to modulus the numbers");
            System.out.println("Enter 6 to find minimum number");
            System.out.println("Enter 7 to find maximum number");
            System.out.println("Enter 8 to find the average of numbers");
            System.out.println("Enter 9 to print the last result in calculator");
            System.out.println("Enter 10 to print the list of all results in calculator");
            System.out.println("Enter 11 to leave");

            for(int j = 1 ; j > 0 ;j++) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    i = scanner.nextInt();
                } catch (InputMismatchException e2) {
                    System.out.println("Please Enter number not String ");
                    continue;
                }
                break;
            }

            switch (i) {

                case 1:
                    results.add(addition(num1,num2));
                    break;

                case 2:
                    results.add(sub(num1,num2));
                    break;

                case 3:
                    results.add(multi(num1,num2));
                    break;

                case 4:
                    results.add(divide(num1,num2));
                    break;

                case 5:
                    results.add(mod(num1,num2));
                    break;

                case 6:
                    results.add(min(num1,num2));
                    break;

                case 7:
                    results.add(max(num1,num2));
                    break;

                case 8:
                    results.add(avg(num1,num2));
                    break;

                case 9:
                    last_result(results);
                    break;

                case 10:
                    all_results(results);
                    break;


                case 11:
                    break;

                default:
                    System.out.println("Invalid number please press from 1 to 11");
                    break;


            }
        } while (i != 11);
    }

    public static String addition(int num1,int num2){
        int result = num1+num2;
        System.out.println("The sum of 2 numbers is "+(num1+num2));
        String s_result = "add method :"+result;
        return s_result;

    }

    public static String sub(int num1,int num2){
        int result = num1-num2;
        System.out.println("The sub of 2 numbers is "+(num1-num2));
        String s_result = "sub method :"+result;
        return s_result;

    }


    public static String multi(int num1,int num2){
        int result = num1*num2;
        System.out.println("The multi of 2 numbers is "+(num1*num2));
        String s_result = "Multi method :"+result;
        return s_result;
    }


    public static String divide(int num1,int num2){
        int result = num1/num2;
        System.out.println("The divide of 2 numbers is "+(num1/num2));
        String s_result = "Divide method :"+result;
        return s_result;
    }


    public static String mod(int num1,int num2){
        int result = num1%num2;
        System.out.println("The modulus of 2 numbers is "+(num1%num2));
        String s_result = "mod method :"+result;
        return s_result;
    }


    public static String min(int num1,int num2){

        int result = 0;
        if(num1>num2){
            System.out.println("The minimum number is: "+num2);
            result = num2;

        } else if (num2>num1) {
            System.out.println("The minimum number is "+num1);
            result = num1;
        }else{
            System.out.println("They are equal");
            result = num1;
        }
        String s_result = "min method :"+result;
        return s_result;
    }


    public static String max(int num1,int num2){

        int result = 0;
        if(num1<num2){
            System.out.println("The Maximum number is: "+num2);
            result = num2;

        } else if (num2>num1) {
            System.out.println("The Maximum number is "+num1);
            result = num1;
        }else{
            System.out.println("They are equal");
            result = num1;
        }
        String s_result = "max method :"+result;
        return s_result;
    }


    public static String avg(int num1,int num2){
        int result = (num1+num2)/2;
        System.out.println("The avg of 2 numbers is "+((num1+num2))/2);
        String s_result = "avg method :"+result;
        return s_result;
    }


    public static void last_result(ArrayList<String> results){

        System.out.println("The last results"+results.get(results.size()-1));
    }


    public static void all_results(ArrayList<String> results){

        System.out.println("All result"+results);

    }





}