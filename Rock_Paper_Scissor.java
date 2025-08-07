import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random random = new Random();
      String[] choices = {"rock", "paper", "scissors"};
      String playerChoice;
      String computerChoice;
      String playAgain;

      do { 
           System.out.print("Enter your move (rock, paper, scissors): ");
      playerChoice = sc.nextLine().toLowerCase();

      if(!playerChoice.equals("rock") && 
         !playerChoice.equals("paper") && 
         !playerChoice.equals("scissors")){
            System.out.println("Invalid Choice!");
         }

      computerChoice = choices[random.nextInt(3)];
      System.out.println("Computer choice: " + computerChoice);

      if (playerChoice.equals(computerChoice)) {
          System.out.println("It's a tie!");
      }
      else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))||
               (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
               (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
          System.out.println("you Won!");
      }
      
      else{
        System.out.println("You lose!");
      }

      System.out.println("Play again (yes/no): ");
      playAgain = sc.nextLine().toLowerCase();
      } while (playAgain.equals("yes"));

      sc.close();
  }  
}
