package Week06;

import java.util.ArrayList;
import java.util.List;

public class FRQ02 {
    public static void main(String [] arsg){
        FormLetter fl = new FormLetter();
        // fl.repalceAll(fl.getLines().get(2), "oh", "aah");
        fl.createPersonalizedLetters();
    }
}

class Customer{
    private String name;
    private String city;
    private String state;

    Customer(String name, String city, String state){
        this.name = name;
        this.city = city;
        this.state = state;
    }

    public String getName(){
        return name;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }
}


class FormLetter{
    private List<String> lines;
    private List<Customer> customers;

    FormLetter(){
        lines = new ArrayList<String>();
        // lines.add("oh me oh my");
        // lines.add("sing to me a sin");
        // lines.add("ooh la la");
        customers = new ArrayList<Customer>();
        customers.add(new Customer("Joan", "Glendale", "California"));
        customers.add(new Customer("Adam", "Gangnam", "Seoul"));
        customers.add(new Customer("Daeju", "Giheung", "Gyeong-gi"));
        lines.add("Dear @,");
        lines.add("If you buy a garden gnome you will");
        lines.add("have the best-looking house in &,");
        lines.add("heck, @, in the whole state of $!");
        lines.add("@, @, @, don't delay.");
    }

    public List<String> getLines(){
        return lines;
    }

    public List<String> makeCopy(){
        List<String> newLines = new ArrayList<String>();
        for(String line:lines){
            newLines.add(line);
        }

        return newLines;
    }

    public String repalceAll(String line, String sub, String repl){
        List<String> temp = new ArrayList<String>();
        String tempS = "";
        String result = "";

        for(int i=0; i<line.length(); i++){
            if(line.charAt(i) != ' '){
                tempS = tempS + line.charAt(i);
            } else{
                temp.add(tempS);
                tempS = "";
            }
        }
        if(tempS != ""){
            temp.add(tempS);
        }

        for(String s: temp){
            if(s.equals(sub)){
                result = result + repl + " ";
            } else if(s.equals(sub+"!")){
                result = result + repl + "!" + " ";
            } else if(s.equals(sub+",")){
                result = result + repl + "," + " ";
            } else {
                result = result + s + " ";
            }
        }
        System.out.println(result);
        return result;
    }

    public void createPersonalizedLetters(){
        for(Customer c: customers){
            for(String l:lines){
                String temp = "";
                for(int i=0; i<l.length(); i++){
                    if(l.charAt(i) != ' '){
                        if(l.charAt(i) == '@'){
                            temp = temp + c.getName();
                        }else if(l.charAt(i) == '&'){
                            temp = temp + c.getCity();
                        } else if (l.charAt(i) == '$'){
                            temp = temp + c.getState();
                        } else {
                            temp = temp + l.charAt(i);
                        }
                    } else{
                        temp = temp + " ";
                        System.out.print(temp);
                        temp = "";
                    }
                }
                if(temp != ""){
                    System.out.print(temp);
                }
                System.out.println();
            }
        }
    }

    public void printList(List<String> l){
        for(String s:l){
            System.out.println(s);
        }
    }
}
