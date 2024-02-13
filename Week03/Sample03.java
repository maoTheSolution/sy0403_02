class Person{
    protected String name;
    protected int age;
    private double height;

    Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getHeight(){
        return height;
    }
}


class Teacher extends Person{
    String subject;
    String emailAddr;

    Teacher(String name, int age, double height, String subject, String emailAddr){
        super(name, age, height);
        this.subject = subject;
        this.emailAddr = emailAddr;
    }

    public String getSubject(){
        return subject;
    }

    public String getEmailAddr(){
        return emailAddr;
    }


}

public class Sample03 {
    public static void main(String [] args){
        // Person p01 = new Person("Adam", 13, 130.5);
        // System.out.println(p01.getHeight());
        // Teacher t01 = new Teacher("Adam", 100, 130.05, "Math", "nobody@gmail.com");
        // System.out.println(t01.getName());
        // System.out.println(t01.getSubject());
        // System.out.println(t01.getHeight());



        // Parent = new Parent  -> can use all functions in Parent
        Person p01 = new Person("Adam", 14, 130.55);
        // Parent = new Child   -> can use all functions in Parent 
        Teacher t02 = new Teacher("Adam", 10, 180.33, "CS", "mmmm@gmail.com");
        // p02.emailAddr();
        // Child = new Child -> can use all functions in Parent and Child
        Teacher t01 = new Teacher("Seoyoung", 10, 180.33, "CS", "mmmm@gmail.com");
        t01.getEmailAddr();
        // Child = new Parent
        // Teacher t01 =  new Person("Adam", 14, 130.55);




        Teacher [] t_arr = new Teacher[2];
        t_arr[0] = t01;
        t_arr[1] = t02;

        for(int i=0; i<t_arr.length; i=i+1){
            System.out.println(t_arr[i].getName());
        }

        for(Teacher target:t_arr){
            System.out.println(target.getName());
        }

    }
}
