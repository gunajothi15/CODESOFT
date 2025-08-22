package CODESOFT;
import java.util.Scanner;
import java.util.Random;
public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Random r = new Random();
        
        
        System.out.println("Welcome to the Number Guessing Game!");
        while(true){ 
        System.out.println("Choose an option:\n1.play again\n2.exit");
        System.out.println("Please enter your choice: ");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                int guess = -1;
                int count=0;
                int number = r.nextInt(100) + 1;
                System.out.println("Starting the game you have only 7 attempts...");
                 while(count<7 && guess != number){
                    System.out.print("Enter your guess: ");
                    guess = scanner.nextInt();
                    count++;
                    if (guess > number) {
                        System.out.println("Your guess is too high.");
                    } else if (guess < number) {
                        System.out.println("Your guess is too low.");
                    } else {
                        System.out.println("Congratulations! You guessed the right number.");
                    }
                    System.out.println("Attempts left: " + (7 - count));
                    if(count == 7 && guess != number){
                        System.out.println("Sorry, you've used all your attempts.You lose. The number was: " + number);
                    }
                    if(1<=count && count<=3 && guess==number){
                        System.out.println("great!You get 5 stars.");
                    }
                    if(4<=count && count<=6 && guess==number){
                        System.out.println("Nice try! You get 3 stars.");
                    }

                }
                break;
            case 2:
                System.out.println("Exiting the game. Goodbye!");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
      
            }
        
        }
    }
}

        
    


