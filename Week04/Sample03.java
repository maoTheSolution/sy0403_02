public class Sample03 {
    public static void main(String[] args) {
        String sample[][] = {
            {"Adam", "Seoyeong", "Abby"}, 
            {"Daeju", "Joe", "Hayeong"}
        };


        String temp[] = {"Adam", "Seoyeong", "Daeju"};
        Sample03 s3 = new Sample03();
        s3.printer(s3.helper(temp, "Adam"));



        String tt[] = new String[3];
        for(String t: tt){
            System.out.println(t);
        }
    }

    public void printer(String given[]){

    }

    public String[] helper(String given[], String entered){
        String result[] = given;

        return result; 
    }

}




