
/*
 * Head - Student - Student - Student - ... - Student - tail
 */

class LinkedList{
    public static void main(String [] argS){
        Student s1 = new Student("Adam", 11, null);
        Student s2 = new Student("Hayeoung", 12, null);
        s1.addList(s1, s2);

        System.out.println(s1.name);
        System.out.println(s1.next.name);



        /**
         * class screen 
         * data =[p-p-p-p-p] [p-p-p-p-p-p-p-] [p-p-p-p-p-p] [] []
         *          0            1                2   
         * 
         */
    }
}


class Student{
    String name;
    int age;
    Student next;

    Student(String name, int age, Student next){
        this.name = name;
        this.age = age;
        this.next = next;
    }

    public void addList(Student first, Student second){
        first.next = second;
    }
}