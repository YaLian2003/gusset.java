//Yangyang Lian

public class NumberGuesser { // class to get the code

    protected int minVal; // instance variables
    protected int maxVal;
    private int lowerBoundValue;
    private int upperBoundValue;

    public NumberGuesser(int lowerBound, int upperBound) { // constructor
        this.minVal = lowerBoundValue = lowerBound;
        this.maxVal = upperBoundValue = upperBound;
    }

    public void higher() { // method to get the higher number
        minVal = getCurrentGuess() + 1;
    }

    public void lower() { // method to get the lower number
        maxVal = getCurrentGuess() - 1;
    }

    public int getCurrentGuess() { // method to get the current number
        return (maxVal - minVal) / 2;
    }

    public void reset() { // method to reset
        minVal = lowerBoundValue;
        maxVal = upperBoundValue;
    }

}
