import java.util.Scanner;
import java.util.Random;

public class Main {
    public static int health = 100;
    public static int score = 0;

    public static void main(String[] args) {
    System.out.println("Welcome to the text adventure game!");
    System.out.println(); System.out.println();
        startGame();
        //clear();
    }

    private static void startGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You wake up in a bleak scenario. What will you do?: ");
        System.out.println("1. Explore the bleak scenario");
        System.out.println("2. Return home");
        System.out.print("Enter Your Choice: ");

        int choice = scanner.nextInt();
        System.out.println();
        //clear();

        if (choice == 1) {
            exploreScenario();
        } else if (choice == 2) {
            returnHome();
        } else {
            System.out.println("Invalid choice. Game over!");
        }

        //clear();
        scanner.close();
    }

    public static void exploreScenario() {
        System.out.println("You randomly walk to a lit area and find a open bunker. What will you do?");
        System.out.println("1. Enter the bunker");
        System.out.println("2. Ignore the bunker");
        System.out.print("Enter Your Choice: ");


    }
    public static void returnHome() {
        System.out.println("You come to the conclusion that an adventure is not worth the risk and return home.");
        System.out.println(); System.out.println();
        System.out.println("Game over!");

    }
}