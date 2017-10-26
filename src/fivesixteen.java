import java.util.*;

public class fivesixteen{
  // Main method
	private static Scanner input;
  public static void main(String args[]) {
    
	  input = new Scanner(System.in);

    // Prompt the user to enter a positive integer
    System.out.print(
      "Enter a positive integer: ");
    int number = input.nextInt();

    // Find all the smallest factors of the integer
    System.out.println("The factors for " + number + " is");
    int factor = 2;
    while (factor <= number) {
      if (number % factor == 0) {
        number = number / factor;
        System.out.println(factor);
      }
      else {
        factor++;
      }
    }
  }
}
