import java.util.Random;

public class Sample05 {
    public static void main(String [] args){
        Random rand = new Random();
        int value = rand.nextInt(10);

        System.out.println(value);
    }
}
