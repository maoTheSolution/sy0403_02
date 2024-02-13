class Shinhan{
    public String user;
    public double income;

    Shinhan(){

    }

    public void makeAccount(String name, double money){
        user = name;
        income = money;
    }
}


public class Bank {
    public static void main(String [] args){
        Shinhan s01 = new Shinhan();
        s01.makeAccount("Seoyoung", 1234555.65);
        System.out.println(s01.user);
        System.out.println(s01.income);

        s01.user ="Adam";
        System.out.println(s01.user);
        s01.income = -99999.999;
        System.out.println(s01.income);

    }  
}
