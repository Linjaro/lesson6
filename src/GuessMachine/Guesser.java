
package GuessMachine;


public class Guesser {
    private int num;
    private int guess;
    private int guesses;
    
    public Guesser(){
        num = (int)(Math.random()*100+1);
        guesses =0;
    }
    public String giveHint(){
        if (num<guess) {
            return "Guess was too high";
        }
        else{
            return "Guess was too low";

        }
    }
    public boolean setGuess(int number){
        boolean isValid= (number>=1 && number <=100 );
        if (isValid) {
            guess = number;
            return true;
        }
        else{return false;}
        
    }
}
