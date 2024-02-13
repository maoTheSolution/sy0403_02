public class Sample05{
    public static void main(String [] arsg){
        // System.out.println(fibo(6));

        // int i;
        // for(i=1; i<10; i++){
        //     System.out.println(fibo(i));
        // }
        // System.out.println(i);

        Sample05 s05 = new Sample05();
        System.out.println(s05.fibo02(3));




    }

    // static 
    public static int fibo(int nth){
        // base
        if(nth <= 2){
            return 1;
        } else {
            return fibo(nth-1) + fibo(nth-2);
        }
    }


    public int fibo02(int nth){
        // base
        if(nth <= 2){
            return 1;
        } else {
            return fibo(nth-1) + fibo(nth-2);
        }
    }
}