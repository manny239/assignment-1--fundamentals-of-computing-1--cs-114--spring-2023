import java.util.Scanner;   //Imports scanner class
import java.util.Random;    //Imports class for generating random numbers

public class Assignment1 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    //First part: Displays first and last initials in a pattern
    System.out.println("EEEEEEEEEE\tKK    KKKKK\nEE\t\tKK   KKKK\nEE\t\tKK  KKK\n"+
    "EE\t\tKK KK\nEEEEEEEEEE\tKKK" +
     "\nEE\t\tKK KK\nEE\t\tKKK  KKK\nEE\t\tKK    KKKK\nEEEEEEEEEE\tKK     KKKKK\n");

    //Second part: Takes temperature input, and converts into celsius
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a temp in fahrenheit:");

    //allocating input
    int temp = input.nextInt();

    //displays converted temperature value
    final double FACTOR = 5.0/9.0;
    double newTemp = (temp-32) * FACTOR;
    System.out.println("You entered: \"" + newTemp + "\"");

    //Third part: Takes input and reverses, program then displays only 3 digits
    String newWord;
    Scanner toBeReversed = new Scanner(System.in);
    System.out.println("Type in any string, this is gonna be reversed");
    newWord = toBeReversed.nextLine();

    //Declaring a method to reverse input
    StringBuilder reversedString = new StringBuilder(newWord);
    reversedString.reverse();  // Reversing value stored
    String result = reversedString.toString();

    String mutated = result.substring(1,4);
    System.out.println("Reversed string without first and last characters: " + mutated);

    //Fourth part: Generating random number between 32 and 16,384
    Random guess = new Random();
    int number = guess.nextInt(32,16384);
    System.out.println("A random integer: " + number);

    //This line of code displays final output as requested
    System.out.println("Your new string is: " + newTemp + mutated + number);
    input.close();
    toBeReversed.close();

  }
}
