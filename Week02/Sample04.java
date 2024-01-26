class Temp{
    private String name01;
    public String name02;
    String name03;
    // protected String name04;
    Temp(String first, String second, String third){
        name01 = first;
        name02 = second;
        name03 = third;
    }

    public String getName(){
        return name01;
    }

    public void setName(String newName){
        name01 = newName;
    }
}

class Sample04{
    public static void main(String [] args){
        Temp t01 = new Temp("Adam", "Seoyoung", "Joe");
        // System.out.println(t01.name01);
        t01.setName("Abby");
        System.out.println(t01.getName());
        System.out.println(t01.name02);
        System.out.println(t01.name03);


    }
}