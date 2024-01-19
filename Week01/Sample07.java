public class Sample07 {
    // global
    public String name;

    // Sample07(){

    // }

    Sample07(String given){
        name = given;
        System.out.println("This is your constructor");
    }



    public static void main(String [] arsg){
        // Sample07 s01 = new Sample07();
        Sample07 s02 = new Sample07("Adam");
        System.out.println(s02.name);
    
    
        // System.out.println(s01.name);
    }
}
