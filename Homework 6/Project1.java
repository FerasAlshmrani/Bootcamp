import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


//Exceptions
// try catch example inside user_input method line number 180 if user tried to use String
// there's new method throwsExpection in line 299 inside   ^=> this try catch


public class Project1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] tictac = new String[3][3];

        // To make all array with spaces
        String value = " ";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tictac[i][j] = value;
            }
        }

        // 0 Game is still playing , 1 User wins , 2 Computer wins , 3 Draw
        int win = 0;

        System.out.println(tictac[0][0]+ " | "+tictac[0][1]+" | "+tictac[0][2]);
        System.out.println("- + - +-");
        System.out.println(tictac[1][0]+ " | "+tictac[1][1]+" | "+tictac[1][2]);
        System.out.println("- + - +-");
        System.out.println(tictac[2][0]+ " | "+tictac[2][1]+" | "+tictac[2][2]);


        int i = 0;
        int row = 0;
        int col = 0;

        do{

            win = check_win(tictac,win);


            if(win == 0 ){
                i = user_input(tictac,i);

                // to get row and col values
                int counter = 0 ;
                boolean break_loop = false;
                for(int j = 0 ; j < 3 ;j++){
                    for(int k = 0 ; k < 3;k++){

                        // if counter found i then let row , col in took that position.
                        if(i-1==counter){
                            row = j ;
                            col = k ;
                            break_loop = true;
                            break;
                        }
                        counter++;}
                        if(break_loop == true){
                            break;
                        }


                }
                tictac[row][col] = "X";
                row = 0 ; col = 0 ;
            }
            System.out.println(tictac[0][0]+ " | "+tictac[0][1]+" | "+tictac[0][2]);
            System.out.println("- + - +-");
            System.out.println(tictac[1][0]+ " | "+tictac[1][1]+" | "+tictac[1][2]);
            System.out.println("- + - +-");
            System.out.println(tictac[2][0]+ " | "+tictac[2][1]+" | "+tictac[2][2]);


            win = check_win(tictac,win);
            if(win == 1){
                break;
            }

            System.out.println("====================================");

            if(win == 0) {
                i = computer_input(tictac, i);
                System.out.println(i+ " computer ");

                // to get row and col values
                int counter = 0 ;
                boolean break_loop = false;
                for(int j = 0 ; j < 3 ;j++){
                    for(int k = 0 ; k < 3;k++){
                        if(i-1==counter){
                            row = j ;
                            col = k ;
                            break_loop = true;
                            break;
                        }
                        counter++;}

                        if(break_loop == true){
                            break;
                        }


                }
                tictac[row][col] = "O";
                row = 0 ; col = 0 ;
                System.out.println("Computer Choose: "+i);
            }


            System.out.println(tictac[0][0]+ " | "+tictac[0][1]+" | "+tictac[0][2]);
            System.out.println("- + - +-");
            System.out.println(tictac[1][0]+ " | "+tictac[1][1]+" | "+tictac[1][2]);
            System.out.println("- + - +-");
            System.out.println(tictac[2][0]+ " | "+tictac[2][1]+" | "+tictac[2][2]);



            System.out.println("====================================");

            win = check_win(tictac,win);
            if(win == 2){
                break;
            }

            if(win == 3){
                System.out.println("Draw !");
                break;
            }


            i=0;;

        }while (win != 4);

    }
    public static int user_input(String[][] tictac , int i  ){
        Scanner input = new Scanner(System.in);
        boolean check = false;
        boolean check_exception= false;

        while(check == false) {

            if(i >= 1 && i <= 9 ) {


                // to get row and col values from user input
                int row = 0 ;
                int col = 0 ;
                int counter = 0 ;
                boolean break_loop = false;
                for(int j = 0 ; j < 3 ;j++){
                    for(int k = 0 ; k < 3;k++){

                        if(i-1==counter){
                            row = j ;
                            col = k ;
                            break_loop = true;
                            break;
                        }
                        counter++;}

                        if(break_loop == true){
                            break;
                        }


                }

                if (tictac[row][col].equals("X")  || tictac[row][col].equals("O") ) {

                    System.out.println(i+" is not valid move.");
                    i = input.nextInt();
                    continue;
                } else {
                    check = true;
                }
            }else{
                System.out.println("Where would you like to play? (1-9)");
                try{
                    i = input.nextInt();
                    throwException(i);
                }catch (InputMismatchException e1){
                    System.out.println("You tried to add a String please Enter a number ");
                    check_exception = true;
                    break;
                }catch (Exception e2){
                    System.out.println(e2.getMessage());
                }


            }
        }
        if(check_exception == true){
            i = user_input(tictac,i);
        }
        return i;
    }

    public static int computer_input(String[][] tictac , int i){
        Random rand = new Random();
        boolean check = false;
        while(check == false) {
            i = rand.nextInt(9);
            if(i >= 1 && i <= 9 ) {

                // to get row and col values from Computer input
                int col = 0;
                int row = 0;
                int counter = 0 ;
                boolean break_loop = false;
                for(int j = 0 ; j < 3 ;j++){
                    for(int k = 0 ; k < 3;k++) {
                        if (break_loop == true) {
                            break;
                        }
                        if (i - 1 == counter) {
                            row = j;
                            col = k;
                            break_loop = true;
                            break;
                        }
                        counter++;
                    }
                        if(break_loop == true){
                            break;
                        }


                }
                if (tictac[row][col].equals("X")  || tictac[row][col].equals("O") ) {
                i = rand.nextInt(9);
                continue;

            } else {
                check = true;
            }
        }else{
            System.out.println("please press from (1-9)");
        }
    }

        return i;
}
    public static int check_win(String[][] tictac ,int win){
        // if some1 already win from this last method i used then quit
        if(win == 1 || win == 2){
            return win;
        }else{
            // check if User wins
            if (tictac[0][0].equals("X") && tictac[0][1].equals("X") && tictac[0][2].equals("X") ||
                    tictac[1][0].equals("X") && tictac[1][1].equals("X") && tictac[1][2].equals("X") ||
                    tictac[2][0].equals("X") && tictac[2][1].equals("X") && tictac[2][2].equals("X") ||
                    // Y
                    tictac[0][0].equals("X") && tictac[1][0].equals("X") && tictac[2][0].equals("X") ||
                    tictac[0][1].equals("X") && tictac[1][1].equals("X") && tictac[2][1].equals("X") ||
                    tictac[0][2].equals("X") && tictac[1][2].equals("X") && tictac[2][2].equals("X") ||
                    // Z
                    tictac[0][0].equals("X") && tictac[1][1].equals("X") && tictac[2][2].equals("X") ||
                    tictac[0][2].equals("X") && tictac[1][1].equals("X") && tictac[2][0].equals("X")) {
                System.out.println("You win !");
                return win = 1;

                // check if Computer wins
            } else if (tictac[0][0].equals("O") && tictac[0][1].equals("O") && tictac[0][2].equals("O") ||
                    tictac[1][0].equals("O") && tictac[1][1].equals("O") && tictac[1][2].equals("O") ||
                    tictac[2][0].equals("O") && tictac[2][1].equals("O") && tictac[2][2].equals("O") ||
                    // Y
                    tictac[0][0].equals("O") && tictac[1][0].equals("O") && tictac[2][0].equals("O") ||
                    tictac[0][1].equals("O") && tictac[1][1].equals("O") && tictac[2][1].equals("O") ||
                    tictac[0][2].equals("O") && tictac[1][2].equals("O") && tictac[2][2].equals("O") ||
                    // Z
                    tictac[0][0].equals("O") && tictac[1][1].equals("O") && tictac[2][2].equals("O") ||
                    tictac[0][2].equals("O") && tictac[1][1].equals("O") && tictac[2][0].equals("O")) {
                System.out.println("Computer Win");
                return win = 2;

                // check if array is full so its draw
            } else if((tictac[0][0].equals("X") || tictac[0][0].equals("O")) &&
                    (tictac[0][1].equals("X") || tictac[0][1].equals("O")) &&
                    (tictac[0][2].equals("X") || tictac[0][2].equals("O")) &&
                    (tictac[1][0].equals("X") || tictac[1][0].equals("O")) &&
                    (tictac[1][1].equals("X") || tictac[1][1].equals("O")) &&
                    (tictac[1][2].equals("X") || tictac[1][2].equals("O")) &&
                    (tictac[2][0].equals("X") || tictac[2][0].equals("O")) &&
                    (tictac[2][1].equals("X") || tictac[2][1].equals("O")) &&
                    (tictac[2][2].equals("X") || tictac[2][2].equals("O"))) {

                return win = 3;
            } else {
                // no one Win and its still array empty so continue playing
                return win = 0;
            }

        }
    }

    public static void throwException(int i ) throws Exception{
        if (i <= 1 || i >= 9){
            throw new Exception("you number is not in a range from 1 to 9");
        }
    }


    }


