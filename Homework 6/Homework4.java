import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// try, catch 140,170,195
public class Homework4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Task 1
        System.out.println("//// Task 1 ////");

        int[] first_last = {50, -20, 0, 30, 40, 60, 10};
        boolean check = false;
        if (first_last.length >= 2) {
            if (first_last[0] == first_last[first_last.length - 1]) {
                check = true;
            }
            System.out.println(check);
        } else {
            System.out.println("array must be greater than or equal to 2");
        }

        // Task 2
        System.out.println("//// Task 2 ////");

        int[] nums = {1, 4, 17, 25, 3, 100};

        for (int i = 0; i < nums.length; i++) {
            int sort = 0;
            for (int j = i; j < nums.length; j++) {

                if (nums[i] < nums[j]) {
                    sort = nums[j];
                    nums[j] = nums[i];
                    nums[i] = sort;
                }
            }
        }
        System.out.println("3 largest elements of the said array are: " + nums[0] + " " + nums[1] + " " + nums[2]);

        // Task 3
        System.out.println("//// Task 3 ////");

        int[] find_avg = {1, 4, 17, 7, 25, 3, 100};
        ArrayList<Integer> add_avg = new ArrayList<Integer>();

        int sum = 0;
        int counter = 0;
        int avg = 0;

        for (int n : find_avg) {
            sum += n;
            counter++;
        }
        avg = sum / counter;
        for (int n : find_avg) {
            if (n > avg) {
                add_avg.add(n);
            }
        }
        System.out.println("The average of the said array is: " + avg + " The numbers in the said array that are greater than the average are: " + add_avg);

        // Task 4
        System.out.println("//// Task 4 ////");

        int[] first_last_greater = {20,30,40};
        if (first_last_greater.length >= 2) {
            if (first_last_greater[0] > first_last_greater[first_last_greater.length - 1]) {
                System.out.println("Larger Value between first and last elemnt: " + first_last_greater[0]);
            } else if (first_last_greater[0] < first_last_greater[first_last_greater.length - 1]) {
                System.out.println("Larger Value between first and last elemnt: " + first_last_greater[first_last_greater.length - 1]);
            }else{
                System.out.println("They are equal");
            }
        } else {
            System.out.println("array must be greater than or equal to 2");
        }

        // Task 5
        System.out.println("//// Task 5 ////");

        int[] first_last_swap = {20,30,40};
        ArrayList<Integer> first_last_after_swap = new ArrayList<Integer>();

        if (first_last_swap.length >= 2) {

            for (int n:first_last_swap) {
                first_last_after_swap.add(n);
            }

            first_last_after_swap.set(0,first_last_swap[first_last_swap.length-1]) ;
            first_last_after_swap.set(first_last_after_swap.size()-1,first_last_swap[0]);

            System.out.println("New array after swapping the first and last elemnts: "+first_last_after_swap);
        } else {
            System.out.println("array must be greater than or equal to 2");
        }

        // Task 6
        System.out.println("//// Task 6 ////");

        ArrayList<String> find_longest = new ArrayList<String>();
        ArrayList<String> longest_add = new ArrayList<String>();

        find_longest.add("cat");
        find_longest.add("dog");
        find_longest.add("red");
        find_longest.add("is");
        find_longest.add("am");

        int total = 0 ;
        for (String n:find_longest) {
            if(total < n.length()) {
                total = n.length();
            }
        }
        for(String n : find_longest){
            if(n.length() == total){
                longest_add.add(n);
            }
        }
        System.out.println("Result: "+longest_add);

        // Task 7
        System.out.println("//// Task 7 ////");

        System.out.println("Please put range of the array");
        int len = 0;
        do {
            if(len < 0 ){
                System.out.println("You cant put array Negative number please try to add positive number");
            }

            len = 0 ;
            String str = len+"";

            try {
                str = input.nextLine();
                len = Integer.parseInt(str);
            }catch (NumberFormatException e1){
                System.out.println("You tried to wrtie a String please Enter number to put a range of the array");
            }

        }while (len <= 0);
        int[] user_array = new int[len];
        int i = 0 ;
        counter = 0 ;
        do{
            System.out.println("press 1 to add number , 2 to display the array , 3 to search the element within array , 4 Sort the array 5 Stop ");

            for(int j = 1 ; j > 0 ;j++) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    i = scanner.nextInt();
                } catch (InputMismatchException e2) {
                     i = 0 ;
                    System.out.println("Please Enter number not String please enter from 1 - 5 ");
                    continue;
                }
                break;
            }

            switch (i) {
                case 1:
                    if (counter != user_array.length) {
                        System.out.println("Please Enter number to add it in array");
                        for(int j = 1 ; j > 0 ;j++) {
                            try {
                                Scanner scanner = new Scanner(System.in);
                                user_array[counter] = scanner.nextInt();
                            } catch (InputMismatchException e2) {
                                System.out.println("Please Enter number not String to add it in array ");
                                continue;
                            }
                            break;
                        }
                        counter++;

                    } else {
                        System.out.println("You array is full");
                        continue;
                    }
                    break;

                case 2:
                    System.out.println("Your array is "+Arrays.toString(user_array));
                    break;

                case 3:
                    System.out.println("Choose the element you want to find within array");
                    int search = 0;
                    for(int j = 1 ; j > 0 ;j++) {
                        try {
                            Scanner scanner = new Scanner(System.in);
                            search = scanner.nextInt();
                        } catch (InputMismatchException e2) {
                            System.out.println("Please Enter number not String ");
                            continue;
                        }
                        break;
                    }
                    boolean found = false;
                    for (int n:user_array) {
                        if(n == search){
                            found = true;
                        }
                    }
                    if(found) {
                        System.out.println("the number " + search + " is there ");
                    }
                    else{
                        System.out.println("the number " + search + " is not there ");
                    }
                    break;

                case 4:

                    for(int j = 0 ; j <user_array.length;j++){
                        int sort = 0;
                        for(int k = j ; k <user_array.length;k++){
                            if(user_array[j] > user_array[k] ){
                                sort = user_array[k];
                                user_array[k] = user_array[j];
                                user_array[j] = sort;
                            }
                        }
                    }

                    System.out.println("Sorted");
                    break;

                case 5:
                    break;

                default:
                    System.out.println("please choose from 1 to 5");
                    break;

            }
        }while (i != 5);

        // Task 8
        System.out.println("//// Task 8 ////");

        int[] numbers = {1, 1, 1, 3, 3, 5};

        int index = 0;
        for( int j = 0 ; j<numbers.length ; j++){
            int count= 0 ;
            if(numbers[j] == index){
                continue;
            }
            for( int k = j ; k<numbers.length ; k++){
                if(numbers.length != k) {
                    if (numbers[j] == numbers[k]) {
                        count++;
                    }
                }
            }
            index = numbers[j];
            System.out.println(numbers[j]+" occurs "+count+" times");
        }

        // Task 9
        System.out.println("//// Task 9 ////");

        int[] odd_even_numbers = {2, 3, 40, 1, 5, 9,4,10,7};

        for(int j = 0 ; j <odd_even_numbers.length;j++){
            int sort = 0;

            for(int k = j ; k <odd_even_numbers.length;k++){

                if(odd_even_numbers[j]%2 == 1){
                    sort = odd_even_numbers[k];
                    odd_even_numbers[k] = odd_even_numbers[j];
                    odd_even_numbers[j] = sort;
                }

            }
            for(int k = j ; k <odd_even_numbers.length;k++){

                if(odd_even_numbers[j]%2 == 0){
                    sort = odd_even_numbers[k];
                    odd_even_numbers[k] = odd_even_numbers[j];
                    odd_even_numbers[j] = sort;
                }

            }

        }
        System.out.println("odd numbers in the first half and even numbers in the second half "+Arrays.toString(odd_even_numbers));

        // Task 10
        System.out.println("//// Task 10 ////");

        int[] is_equal = {2,3,6,6,4};
        int[] is_equal2 = {2,3,6,6,4};

        int a = 0 ;
        int b = 0 ;
        boolean check2 = true;
        if(is_equal2.length == is_equal.length) {

            for (int j = 0; j < is_equal.length; j++) {
                if(is_equal[j] == is_equal2[j]){
                    continue;
                }
                else{
                    check2=false;
                    break;
                }
            }
            System.out.println(check2);
        }
        else{
            System.out.println("the length of arr 1 not equal of arr 2");
        }

    }

}