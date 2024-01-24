public class Sample03{

    public void printer(String name){
        System.out.println(name + "! This is a nice name!");
    }

    public String printer(int age){
        return "I am "+Integer.toString(age)+" years old.";
    }

    public static void main(String [] args){
        Sample03 s00 = new Sample03();
        s00.printer("Adam");
        System.out.println(s00.printer(13));
    } 
}