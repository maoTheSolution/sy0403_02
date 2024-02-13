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

    public static void main(String [] args){
        WordMatch wm = new WordMatch("libertasas");
        // System.out.println(wm.given);
        System.out.println(wm.ScoreGuess("as"));
    }
}