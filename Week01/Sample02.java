import java.util.Scanner;

public class Sample02 {
    public static void guessingGame(int value){
        Scanner sc = new Scanner(System.in);
        while(true){
            int temp = sc.nextInt();
            if(temp > value){
                System.out.println("Down");
            }else if(temp<value){
                System.out.println("UP");
            } else{
                System.out.println("BINGO");
                break;
            }
        }
        System.out.println("GAME IS OVER");
    }

    public static void main(String [] args){
        guessingGame(77);
        guessingGame(80);
        guessingGame(13);
    }   
}
