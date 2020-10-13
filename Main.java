import java.util.Scanner;
/**
 * Fibonacci sequence
 * @author Eric
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user what number they want to find
    System.out.println("What Fibonacci number would you like to find");

    // gets the number from the user
    int numFind = input.nextInt();

    // sets up an array and sets the store value to numfind
    int[] num = new int[numFind];

    // declares variables for future calculations
    int sum = 0;
    int num2 = 0;
    int num3 = 1;

    // adds num2 and num3 and gets the sum and repeats until i reaches the user's input
    for(int i = 0; i < num.length; i++){
      sum = num2 + num3;
      num2 = num3;
      num3 = sum;
    }

    // tells the user the answer
    System.out.println("The " + numFind + " Fibonacci number is " + num2);
  }
}