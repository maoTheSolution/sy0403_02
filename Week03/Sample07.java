import java.util.ArrayList;

public class Sample07 {
    public static void main(String [] arsg){
        ArrayList<Student> al = new ArrayList<Student>();
        Student s01 = new Student("Adam");
        Student s02 = new Student("Seoyeong");
        Student s03 = new Student("Abby");
        Student s04 = new Student("Joe");
        al.add(s01);
        al.add(s02);
        al.add(s03);
        al.add(s04);

        for(Student s:al){
            System.out.println(s.getName());
        }

        System.out.println("============================updated===========================");
        // al.remove(2);
        for(Student s:al){
            if(s.getName().equals("Seoyeong")){
                al.remove(s);
                break;
            }
        }

        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i).getName());
        }

    }
}

class Student{
    private String name;

    Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    } 
}
