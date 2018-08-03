package ugadajcifru;

import java.util.Random;

class ComPlayer extends Player {

    private int tryCount = 0;
    private int numberInMind;


    public int getNumberInMind() {
        return numberInMind;
    }

    @Override
    void takeTurn() {
        System.out.println("Компьютер: Computing... Turn... Possibilities...");

        {
            numberInMind = (int) (Math.random() * 10 + 1);
            System.out.println("Ведущий: (НЕЛЕГАЛЬНАЯ ПОДСКАЗКА) компьютер загадал (" + numberInMind + ") как случайное число!");  //Remove when finished
        }
    }

    private static int Randomizer(int minBorder, int maxBorder) {
        Random rand = new Random();
        int min = minBorder;
        int max = maxBorder;
        int randomGuess = rand.nextInt((max - min) + 1) + min;
        return randomGuess;
    }

    @Override
    void guess(int refVar) {
        int maxBorder = 10;
        int minBorder = 1;
        int cpuGuess = -1;

        while (cpuGuess != refVar) {
            cpuGuess = Randomizer(minBorder, maxBorder);

            if (cpuGuess > refVar) {
                tryCount = tryCount + 1;
                maxBorder = cpuGuess;

            } else {
                tryCount = tryCount + 1;
                minBorder = cpuGuess;
            }
            System.out.println("Компьютер: Ok, my " + tryCount + " guess: " + cpuGuess + " is the answer!");
        }
        System.out.println("Компьютер: I finally got it from " + tryCount + " tries: " + cpuGuess + " is the answer!");
        tryCount = 0;


    }

}





