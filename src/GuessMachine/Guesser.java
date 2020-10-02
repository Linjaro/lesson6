
package GuessMachine;


public class Guesser {
    private int num;
    private int guess;
    private int guesses;
    private boolean win, badAns;
    private String hint;
    
    public Guesser(){
        num = (int)(Math.random()*100+1);
        guesses =0;
        win =false;
        badAns = false;
    }
    public String giveHint(){
        
        
        if (badAns) {
            
            hint ="Enter a valid number";
            return hint;
        }
        else if (num<guess ) {
            guesses++;
            hint = "Guess was too high";
            return hint;
        }
        else if (num>guess){
            guesses++;
            hint = "Guess was too low";
            return hint;

        }
        else{
            win = true;
            hint = "You are right";
            return hint;
        }
        
    }
    public boolean setGuess(int number){
        boolean isValid= (number>=1 && number <=100 );
        if (isValid) {
            guess = number;
            badAns=false;
            return true;
        }
        else{
            badAns=true;
            return false;
        }
        
    }
    public int getGuesses(){
    
        return guesses;
    }
    
    public boolean won(){
        return win;
    }
}
