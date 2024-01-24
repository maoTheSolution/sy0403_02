public class Sample01 {
    String name;
    
    Sample01(String newName){
        name = newName;
    }
}

class Temp{
    public static void main(String [] args){
        Sample01 s01 = new Sample01("Adam");
        System.out.println(s01.name);
    }
}
