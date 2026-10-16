
import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        String again = "y";

        while (again.equalsIgnoreCase("y")) {

            int die1, die2, die3;
            int roll = 0;

            System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
            System.out.println("--------------------------------");

            do {
                die1 = rand.nextInt(6) + 1;
                die2 = rand.nextInt(6) + 1;
                die3 = rand.nextInt(6) + 1;

                roll++;

                int sum = die1 + die2 + die3;

                System.out.printf("%d\t%d\t%d\t%d\t%d%n",
                        roll, die1, die2, die3, sum);

            } while (die1 != die2 || die2 != die3);

            System.out.println("You rolled a triple!");
            System.out.print("Play again? (y/n): ");
            again = input.nextLine();
        }

        System.out.println("Game Over!");
    }
}
