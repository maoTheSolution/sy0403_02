<<<<<<< HEAD
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
=======
public class Sample01{
    Sample01(){
        System.out.println("This is the original constructor");
    }

    Sample01(String name){
        System.out.println(name + ", Hello");
    }
}
>>>>>>> fc90247654a61ac2f6465ee6699e021a32f62327
