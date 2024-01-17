public class Sample04 {
    public static void main(String [] args){
        gugudan(3);
        counterTable(5, 11);
    }

    public static void gugudan(int dan){
        for(int i=1; i<10; i=i+1){
            System.out.println(Integer.toString(dan) +  "*" + Integer.toString(i) + "=" +  Integer.toString(mul(dan, i)));
        }
    }

    public static void counterTable(int row, int col){
        System.out.println(mul(row, col));
    }
    public static int mul(int first, int second){
        return first * second;
    }
}
