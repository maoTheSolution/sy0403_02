import Week01.Room01.Sample001;

class Temp{
    String name;

    // Temp(){

    // }

    Temp(String name){
        this.name = name;
    }
}


public class Sample02 {
    public static void main(String [] args){
        Temp t01 = new Temp("Seoyoung");
        System.out.println(t01.name);

        Helper01 h01 = new Helper01();
        System.out.println(h01.name);

        // Sample00 s0 = new Sample00("This is Sample00.");
        // System.out.println(s0.name);

        // Sample001 s1 = new Week01.Room01.Sample001();
        // System.out.println(s1.name);
    }
}
