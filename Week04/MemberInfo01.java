import java.util.*;

public class MemberInfo01 {
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    MemberInfo01(String name, int gradY, boolean hasGoodStanding){
        this.name = name;
        gradYear = gradY;
        this.hasGoodStanding = hasGoodStanding;
    }

    // getter
    public String getName(){
        return name;
    }

    public int getGradYear(){
        return gradYear;
    }

    public boolean inGoodStanding(){
        return hasGoodStanding;
    }

    public static void main(String [] arsg){
        ClubMembers01 c01 = new ClubMembers01();
        try {
            String [] temp = {"arsg", "adam", "seo"};
            // System.out.println("here");
            c01.addMembers01(temp, 2024);
            // System.out.println("there");
            System.out.println(c01.getArrayList());
            for(MemberInfo01 m: c01.getArrayList()){
                System.out.println(m.getName());
            }
        } catch(NullPointerException e){
            System.err.println((e));
        }
    }   
}

class ClubMembers01{
    private ArrayList<MemberInfo01> memberList = new ArrayList<>();
    // private ArrayList<MemberInfo01> memberList = ;

    ClubMembers01(){

    }

    public void addMembers01(String[] names, int gradYear){
        for(int i=0; i<names.length; i++){
            MemberInfo01 memb = new MemberInfo01(names[i], gradYear, true);
            memberList.add(memb);
        }
    }

    public ArrayList<MemberInfo01> getArrayList(){
        return memberList;
    }

}
