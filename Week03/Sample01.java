import java.util.Scanner;


class Student{
    String name;
    int age;
    double height;

    Student(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    //setter

    //getter
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


class Sample01{
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println(name +", Welcome!");
        sc.close();
        // Student [] stdList = new Student[5];
        // for(int i=0; i<stdList.length; i++){
        //     stdList[i] = new Student("Adam", 18, 160.59);
        // }

        // for(int i=0; i<5; i++){
        //     System.out.println(stdList[i].getName());
        // }
    }
}