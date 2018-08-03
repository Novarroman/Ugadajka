package ugadajcifru;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int whoseTurn;

        HumPlayer human = new HumPlayer();
        ComPlayer cpu = new ComPlayer();


        System.out.println("Ведущий: Добро пожаловать в Угадайку! Кто загадывает первым?");
        System.out.println("Ведущий: Введите 1, если хотите загадать число;");
        System.out.println("Ведущий: или 0, если первой загадывает бездушная машина.");

        //user decides who goes first
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        while (!(number == 0) && !(number == 1)) {
            System.out.println("Ведущий: Определитесь, пожалуйста! 0 - это компьютер, 1 - это вы.");
            number = Integer.parseInt(scan.next());
        }

        {
            whoseTurn = number;
            System.out.println("Ведущий: Спасибо!");
        }

        if (whoseTurn == 0) {
            System.out.println("Ведущий: Компьютер загадывает число.");
            cpu.takeTurn();

        }
        if (whoseTurn == 1) {
            System.out.println("Ведущий: Загадайте число от одного до десяти - и введите его!");
            human.takeTurn();
        }

        //guessing starts
        if (whoseTurn == 1) {
            int refVar = human.getNumberInMind();
            cpu.guess(refVar);
        }

        if (whoseTurn == 0) {
            int refVar = cpu.getNumberInMind();
            System.out.println("Ведущий: попробуйте угадать число, загаданное компьютером!");
            human.guess(refVar);

        }
    }
}




