package ugadajcifru;

import java.util.Scanner;

class HumanPlayer extends Player {

    private int tryCount = 0;
    private int numberInMind;
    int getNumberInMind() {
        return numberInMind;
    }

    @Override
    public void takeTurn() {
        System.out.println("You: It is my turn, I am a human being standing on top of the intellectual evolutionary ladder!");

        Scanner scanmind = new Scanner(System.in);
        numberInMind = scanmind.nextInt();
        while ((numberInMind > 10) || (numberInMind < 1)) {
            System.out.println("Operator: Number has to be from 1 to 10, please!");
            numberInMind = Integer.parseInt(scanmind.next());
        }
        System.out.println("Operator: (ILLEGAL USER HINT) You've picked " + numberInMind + ", great choice!");   //Remove when finished
    }

    @Override
    public void guess(int refVar) {

        Scanner humGuess = new Scanner(System.in);
        numberInMind = humGuess.nextInt();
        while
                (refVar != numberInMind)

            if (refVar < numberInMind) {
                tryCount = tryCount + 1;
                System.out.println("Computer: Incorrect! try thinking of a smaller number!");
                numberInMind = humGuess.nextInt();
            } else {
                tryCount = tryCount + 1;
                System.out.println("Computer: Are you kidding me? Time to think big!");
                numberInMind = humGuess.nextInt();
            }
        tryCount = tryCount + 1;
        System.out.println("Computer: Damn you! You've bested me, you Turing child object, you!");
        System.out.println("Computer: It took you " + tryCount+" guesses to win!");

    }


}