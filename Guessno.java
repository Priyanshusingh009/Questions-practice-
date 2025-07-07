import java.util.Scanner;
import java.util.Random;
class NumberGame{
    private int targetNo;
    private int attempts;
// CREATING CONTRUCTOR
    public  NumberGame(){
        Random random=new Random();
        targetNo=random.nextInt(100) + 1;
        attempts=0;
    }
    public void startGame(){
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        System.out.println(targetNo);

        System.out.println("Welcome to Guess the Number!");

        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

        while (guess != targetNo) {
             
            guess=scanner.nextInt();

            attempts++;

            if(guess>targetNo){
                System.out.println("Too high! Try again.");

            }
            else if(guess<targetNo){
                System.out.println("Too low! Try again.");
            }
            else{    
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
            
        }
        scanner.close();
    }

}
public class Guessno {
    public static void main(String[] args) {
        NumberGame game = new NumberGame();
        game.startGame();
    }
    
}
