package ugadajcifru;

import java.util.*;

class ComputerPlayer extends Player {

    private int tryCount = 0;
    private int numberInMind;

    int getNumberInMind() {
        return numberInMind;
    }

    @Override
    public void takeTurn() {
        System.out.println("Computer: Calculating optimal picking number...");
        {
            numberInMind = (int) (Math.random() * 10 + 1);
            /* System.out.println("Operator: (ILLEGAL USER HINT) Computer has picked (" + numberInMind + ") as a random number");  //Remove when finished */
        }
    }

    private static int Randomizer(int minBorder, int maxBorder) {
        Random rand = new Random();
        return rand.nextInt(maxBorder - minBorder + 1) + minBorder;
    }

    @Override
    public void guess(int refVar) {
        int maxBorder = 10;
        int minBorder = 1;
        int cpuGuess = -1;

        while (cpuGuess != refVar) {
            cpuGuess = Randomizer(minBorder, maxBorder);

            if (cpuGuess > refVar) {
                tryCount = tryCount + 1;
                maxBorder = cpuGuess-1;
            } else {
                tryCount = tryCount + 1;
                minBorder = cpuGuess+1;
            }
            System.out.println("Computer: For my " + tryCount + "guess, I choose "+ cpuGuess + " as a number you might've picked.");
        }
        System.out.println("Computer: See, it took me just " + tryCount + " tries to guess! " + cpuGuess + " is the correct answer!");
        tryCount = 0;
    }
}