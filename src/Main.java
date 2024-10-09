import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);
        String playAgain;
        String playerA;
        String playerB;
        String rock = "r";
        String paper = "p";
        String scissors = "s";
        boolean validValue = false;

        do {
            do { //Player A input
                System.out.println("Player A please enter your move (R, P, S):");
                playerA = scan.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                    validValue = true;
                } else {
                    System.out.println("You have entered an invalid value. Please try again. \n"); //I like to make a new line after errors to improve readability
                }
            } while (!validValue);
            validValue = false; //resetting to be reused

            do { //Player B input
                System.out.println("Player B please enter your move (R, P, S):");
                playerB = scan.nextLine();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                    validValue = true;
                } else {
                    System.out.println("You have entered an invalid value. Please try again. \n"); //I like to make a new line after errors to improve readability
                }
            } while (!validValue);
            validValue = false; //resetting to be reused

            //determines the winner
            if (playerA.equalsIgnoreCase(rock) && playerB.equalsIgnoreCase(rock)) {
                System.out.println("It's a tie!");
            } else if (playerA.equalsIgnoreCase(rock) && playerB.equalsIgnoreCase(paper)) {
                System.out.println("Paper covers Rock, Player B wins!");
            } else if (playerA.equalsIgnoreCase(rock) && playerB.equalsIgnoreCase(scissors)) {
                System.out.println("Rock breaks Scissors, Player A wins!");
            } else if (playerA.equalsIgnoreCase(paper) && playerB.equalsIgnoreCase(rock)) {
                System.out.println("Paper covers Rock, Player A wins!");
            } else if (playerA.equalsIgnoreCase(paper) && playerB.equalsIgnoreCase(paper)) {
                System.out.println("It's a tie!");
            } else if (playerA.equalsIgnoreCase(paper) && playerB.equalsIgnoreCase(scissors)) {
                System.out.println("Scissors cuts Paper, Player B wins");
            } else if (playerA.equalsIgnoreCase(scissors) && playerB.equalsIgnoreCase(rock)) {
                System.out.println("Rock breaks Scissors, Player B wins!");
            } else if (playerA.equalsIgnoreCase(scissors) && playerB.equalsIgnoreCase(paper)) {
                System.out.println("Scissors cuts Paper, Player A wins!");
            } else if (playerA.equalsIgnoreCase(scissors) && playerB.equalsIgnoreCase(scissors)) {
                System.out.println("It's a tie!");
            }

            System.out.println("Do you want to play again (Y/N)?");
            playAgain = scan.nextLine();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing!");
    }
}