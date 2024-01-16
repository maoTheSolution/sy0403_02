import java.util.Scanner;

public class Sample01{
    public static void main(String [] args){
        // get the target value and save it in the variable, temp
        int temp = Integer.valueOf(args[0]);
        Scanner helper = new Scanner(System.in);

        while(true){
            System.out.print("Guess : ");
            int guess = helper.nextInt();

            if(temp<guess){
                System.out.println("DOWN");
            }else if(temp>guess){
                System.out.println("UP");
            }else {
                System.out.println("BINGO");
                break;
            }
        }
        System.out.println("GAME IS OVER");

    }
}