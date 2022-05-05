//Yangyang Lian
import java.util.Random; // required imports

public class RandomNumberGuesser extends NumberGuesser { // class that extends the main class to get a subclass

    private int randMidPt; // instance variables
    private boolean testVal;
    private Random newRandVal;

    public RandomNumberGuesser(int lowerBound, int upperBound) { // constructor with the parameters
        super(lowerBound, upperBound);

        testVal = true;
        newRandVal = new Random();
    }

    @Override
    public int getCurrentGuess() { // overriden method

        if (testVal) {
            randMidPt = minVal + (newRandVal.nextInt((maxVal - minVal) + 1)); // returns a random value from the higher and the lower values
            testVal = false;
        }

        return randMidPt;
    }

    @Override
    public void higher() { // overriden method
        super.higher();
        testVal = true;
    }

    @Override
    public void lower() { // overriden method
        super.lower();
        testVal = true;
    }

    @Override
    public void reset() { // overriden method
        super.reset();
        testVal = true;
    }
}
