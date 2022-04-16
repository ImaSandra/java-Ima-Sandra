package Game;
import java.util.Scanner;

/*** 
 * @author Ima Sandra
 * Un algoritmo per un semplice gioco che chieda di indovinare un codice numerico di cinque cifre.
 * @param int number che genera i numeri a random
 * @param int K che indica quante volte l'utente può indovinare (numero di pova)
 * @param int i - Used for the cycling
 * @param inputUtente; il numero inserito dall'utente
 * 
 * @result Quando l'utente scrive la risposta,il programma restituisce due valori:
 * il numero di cifre al posto giusto e la somma di queste cifre.
 * 
 * ---
 * @hidden
 * //Il programma perciò restituirebbe in output i numeri 2 (cifre corrette) e 7 (somma).
 * //System.out.println("Somma delle cifre corrette e numeri indovinati: " + inputUtente +number);
 * THe above code was written to have an output of the sum of both the right number and the numbers inserted by the user but it didn't work.
*/

public class GuessingGame {
 
    // Function that implements the
    // number guessing game
    public static void Game(){
        Scanner inputUtente = new Scanner(System.in);

        int number = 1 + (int)(20 * Math.random());
        int K = 5; //5 trials
        int i, guess;
        System.out.println(
            "A number is chosen"
            + " between 1 to 20."
            + "Guess the number"
            + " within 5 trials.");
 
        // Iterate over K Trials
        for (i = 0; i < K; i++) {
            System.out.println( "Guess the number:");
            guess = inputUtente.nextInt(); // Take input for guessing
 
            // If the number is guessed
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is " + " less than " + guess);
            }
        }
 
        if (i == K) {
            System.out.println("You have exhausted " + " K trials.");
            System.out.println("The number was " + number);
        }
    }
 
    // Driver Code
    public static void main(String arg[]){
         // Function Call
       Game();
    }
}