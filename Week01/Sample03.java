public class Sample03 {
    public static void main(String [] args){
        printer();
        System.out.println(adder(3, 10));
        adder02(13, 77);
        System.out.println(mul(3.3, 7.73));
    }


    public static void printer(){
        System.out.println("Hello, Mr. ");
    }

    public static int adder(int first, int second){
        return first + second;
    }

    public static void adder02(int first, int second){
        System.out.println(first * 10);
        System.out.println(second * 7);
    }

    public static double mul(double first, double second){
        return first * second * 0.01;
    }
}
