// import java.util.Scanner;
// import java.util.Random;
import java.util.*;


public class Sample06 {
    static Scanner sc;
    // contructor
    Sample06(){
        sc = new Scanner(System.in);
    }

    public static void main(String [] arsg){
        gugudanGame();
    }

    public static int guessNum(){
        System.out.println("Enter any number between 1 and 100 : ");
        int temp = sc.nextInt();

        return temp;
    }

    public static int genRand(){
        Random rand = new Random();
        return rand.nextInt(9) + 1;
    }

    public static int mul(int first, int second){
        return first * second;
    }

    public static boolean check(int first, int second){
        if (first == second){
            return true;
        }
         else {
            return false;
         }
    }

    public static void gugudanGame(){
        while(true){
            int temp01 = genRand();
            int temp02 = genRand();
            System.out.print(temp01);
            System.out.print(" * ");
            System.out.print(temp02);
            System.out.println(" = ");
            if (check( mul(temp01, temp02), guessNum())){
                System.out.println("BINGO");
                break;
            } else {
                System.out.println("Try it again");
            }
        }
        sc.close();
    }

}
