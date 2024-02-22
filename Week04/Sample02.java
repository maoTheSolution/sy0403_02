public class Sample02 {
    public static void main(String[] args) {
        String temp [][] = new String[3][];
        // String tmep [][] = new String[3][];
        String sample[][] = {
                                {"Adam", "Seoyeong", "Abby"}, 
                                {"Daeju", "Joe", "Hayeong"}
                            };


        System.out.println(temp.length);
        System.out.println(sample.length);
        System.out.println(sample[1].length);

        // Sample02 s2 = new Sample02();
        // s2.printer(sample);
        new Sample02().printer(sample);
    }   


    public void printer(String given[][]){
        for(int row=0;row<given.length; row++){
            for(int col=0; col<given[0].length; col++){
                System.out.println(given[row][col]);
            }
        }
    }
}
