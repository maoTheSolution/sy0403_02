public class Sample06 {
    public static void main(String [] args){
        System.out.println(ex01(7));
    }

    public static int ex01(int nth){
        if (nth==1){
            return 0;
        } else {
            return 3 + ex01(nth-1);
        }
    }
}
