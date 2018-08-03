package ugadajcifru;

import java.util.Scanner;

class HumPlayer extends Player {

    private int tryCount = 0;
    private int numberInMind;

    public int getNumberInMind() {
        return numberInMind;
    }

    @Override
    void takeTurn() {
        System.out.println("Вы: It's my turn, I'm human, YOLO!");

        Scanner scanmind = new Scanner(System.in);
        numberInMind = scanmind.nextInt();
        while ((numberInMind > 10) || (numberInMind < 1)) {
            System.out.println("Ведущий: Число в интервале от 1 до 10, пожалуйста!");
            numberInMind = Integer.parseInt(scanmind.next());
        }
        System.out.println("Ведущий: (НЕЛЕГАЛЬНАЯ ПОДСКАЗКА) Вы загадали " + numberInMind + ", отличный выбор!");   //Remove when finished
    }

    @Override
    void guess(int refVar) {

        Scanner humGuess = new Scanner(System.in);
        numberInMind = humGuess.nextInt();

        while
                (refVar != numberInMind)

            if (refVar < numberInMind) {
                tryCount = tryCount + 1;
                System.out.println("Компьютер: No way, my number is way smaller!");
                numberInMind = humGuess.nextInt();
            } else {
                tryCount = tryCount + 1;
                System.out.println("Компьютер: Are you kiddin' me? My number is greater than that!");
                numberInMind = humGuess.nextInt();
            }
        tryCount = tryCount + 1;
        System.out.println("Компьютер: Damn you! You have outsmarted me, you Turing child object!");
        System.out.println("Компьютер: It took you " + tryCount+" tries!");

    }


}