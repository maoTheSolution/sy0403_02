public class Sample04 {
    public static void main(String [] args){
        int arr01 [] = new int[10];
        // int [] arr01 = new int[10];

        for(int i=100; i< 110; i=i+1){
            arr01[i-100] = i;
        }

        System.out.println(arr01);
        for(int i=0; i<arr01.length; i++){
            System.out.println(arr01[i]);
        }

        int l = arr01.length;
        System.out.println(l);

        int [] arr02 = new int[l*2];

        for(int i=0; i<arr01.length; i++){
            arr02[i] = arr01[i];
        }

        arr02[10] = 11;

        for(int i=0; i<arr02.length; i=i+1){
            System.out.println(arr02[i]);
        }


        arr01 = arr02;

        for(int i=0; i<arr01.length; i++){
            System.out.println(arr01[i]);
        }
    }
}
