public class WordMatch{
    // not provided
    String given;

    WordMatch(String given){
        this.given = given;
    }

    public int ScoreGuess(String guess){
        int score = 0;
        for(int i=0; i<given.length()-guess.length()+1; i++){
            // System.out.println(given.substring(i, i+guess.length()));
            if(given.substring(i, i+guess.length()).equals(guess)){
                // score = score + 1;
                score++;
            }
        }
        return score * guess.length() * guess.length();
    }

    public String findBetterGuess(String first, String second){
        int output = ScoreGuess(first);
        String result = "";
        if(output < ScoreGuess(second)){
            result = second;
        } else if(output > ScoreGuess(second)){
            result = first;
        } 
        else{
            result = helper(first, second);
        }

        return result;
    }

    public String helper(String first, String second){
        String result = "";
        if (first.length() > second.length()){
            result = first;
        } else if (first.length() < second.length()){
            result = second;
        } else{
            for(int i=0; i<first.length(); i++){
                int f = (int)first.charAt(i);
                int s = (int)second.charAt(i);
                if(f == s){
                    continue;
                } else if(f > s){
                    result = first;
                    break;
                } else{
                    result = second;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String [] args){
        WordMatch wm = new WordMatch("libertasas");
        System.out.println(wm.given);
        System.out.println(wm.ScoreGuess("as"));
        System.out.println(wm.findBetterGuess("ten", "nation"));
        System.out.println(wm.findBetterGuess("con", "concat"));
    }
}