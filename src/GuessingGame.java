import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        //Prompt user to input random number guess
        System.out.println("Pick a random number.");
        // Collect user input
        Scanner reader = new Scanner(System.in);
        int randomNumber = reader.nextInt();
        int correctAnswer = 11;
        // if guess equals 11, print 'You are correct, Well Done!'
        // if guess < 11, print 'Too Low, try again'
        // otherwise, print 'Too High, try again'
        if (randomNumber == correctAnswer) {
            System.out.println("You are correct, Well Done!");
        } else if (randomNumber < 11) {
            System.out.println("Too Low, try again.");
        } else {
            System.out.println("Too High, try again");
        }
    }
}