public class Sample01 {
    public static void main(String[] args) {
        String temp[];
        temp = new String[3];   // put them on the memory 
        // initialize the array
        temp[0] = "Hayeoung";
        temp[1] = "Seoneun";
        temp[2] = "Abby";

        String sample[] = {"Adam", "Seoyeong", "Daeju"};

        System.out.println(temp.length);
        System.out.println(sample.length);

        System.out.println(temp[0]);
        System.out.println(sample[0]);

    }
}
