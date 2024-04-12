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
    /*
    public static void confir()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Start The Game");
        System.out.println("2. End The Game");
        System.out.print("Enter Your Choice: ");

        int choice = scanner.nextInt();

        if(choice == 1) {
            startGame();
        } else {
            System.out.println();
            System.out.println("Game Over!");
            System.out.println("Your Health: "+ health);
            System.out.println("Your Score: "+ score);
        }
        pause();
        clear();
        */
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

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        System.out.println(); System.out.println();

        if (choice == 1) {
            int random = exploreRandom();
            if (random == 0) {
                System.out.println("You enter the bunker and a rotting creature bites your neck.");
                System.out.println("You die on the spot from bloodloss.");
                System.out.println("Your score: " + score);
                pause();
            } else {
                System.out.println("You enter the bunker and find a revolver with one remaining bullet.");
                score = score + 50;
                System.out.println("Your score: " + score);
                System.out.println("What's your next move?");
                insideBunker();
            }
        } else if (choice == 2) {
            System.out.println("You ignore the bunker and keep walking.");
            System.out.println("Soon enough you get surrounded by rotting monsters, but luckily you find a house");
            System.out.println("Turns out the house isn't so safe. A corpse surprises you!");
        } else {
            System.out.println("Invalid choice. Game over!");
        }
    }
    public static void returnHome() {
        System.out.println("You come to the conclusion that an adventure is not worth the risk and return home.");
        System.out.println(); System.out.println();
        System.out.println("Game over!");
    }

    public static void insideBunker() {
        System.out.println("1. Exit the bunker.");
        System.out.println("2. Look for more supplies inside the bunker.");
        System.out.print("Enter Your Choice: ");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        System.out.println();

        if (choice == 1) {
        System.out.println("You exit the bunker hastily, but end up getting surprised by a corpse.");
        System.out.println("Luckily, you have a newly acquired .357 Magnum loaded with a bullet.");
        System.out.println("You slay the beast with a clear shot through it's head!");
        score = score + 50;
        System.out.println("Your score: " + score);
        System.out.println("You walk down a dirt road and find an abandoned house.");
        System.out.println("After a lengthy scan, you discover that there is no threat in the house. You're safe for now.");
        pause();
        clear();
        confir();
        }
}