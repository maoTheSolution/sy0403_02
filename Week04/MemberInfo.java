import java.util.ArrayList;

public class MemberInfo {
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    MemberInfo(String name, int gradY, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradY;
        this.hasGoodStanding = hasGoodStanding;
    }

    public int getGradYear() {
        return gradYear;
    }

    public boolean inGoodStanding() {
        return hasGoodStanding;
    }

    public static void main(String[] args) {
        ClubMembers cm = new ClubMembers();
        String temp[] = { "Lucy", "jake" };
        // String temp[] = new String[5];
        cm.addMembers(temp, 0);

        System.out.println(cm.getArrayList());

    }
}

class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    ClubMembers() {
        memberList.add(new MemberInfo("Adam", 9, true));
    }

    public void addMembers(String[] names, int gradYear) {
        for (int i = 0; i < names.length; i++) {
            MemberInfo memb = new MemberInfo(names[i], gradYear, true);
            memberList.add(memb);
        }
    }

    public ArrayList<MemberInfo> getArrayList() {
        return memberList;
    }

}