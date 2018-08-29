package ugadajcifru;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        HumanPlayer human = new HumanPlayer();
        ComputerPlayer cpu = new ComputerPlayer();

        System.out.println("Operator: Welcome to our guesser! Who picks a number first?");
        System.out.println("Operator: Enter 1, if you wish to pick a number;");
        System.out.println("Operator: Enter 0, if you let the soulless machine pick first.");

        //user decides who goes first
        Scanner scan = new Scanner(System.in);
        int whoseTurn = scan.nextInt();
        while (!(whoseTurn == 0) && !(whoseTurn == 1)) {
            System.out.println("Operator: Make up your mind, please! 0 is for Computer, and 1 is for you.");
            whoseTurn = Integer.parseInt(scan.next());
        }
        System.out.println("Operator: Thank You!");

        if (whoseTurn == 0) {
            System.out.println("Operator: Computer picks a number.");
            cpu.takeTurn();
            int refVar = cpu.getNumberInMind();
            System.out.println("Operator: Try guessing the number it picked!");
            human.guess(refVar);
        }
         if (whoseTurn == 1) {
            System.out.println("Operator: Pick a number from one to ten - and enter it below!");
            human.takeTurn();
            int refVar = human.getNumberInMind();
            cpu.guess(refVar);
        }
    }
}




