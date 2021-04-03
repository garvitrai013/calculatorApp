package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;

    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {

        if(operation == ADDITION) {
            Add a1 = new Add(argumentOne, argumentTwo);
            mOut.print(a1.toString());
        }
        else if(operation == SUBTRACTION) {
            Subtract s1 = new Subtract(argumentOne, argumentTwo);
            mOut.print(s1.toString());
        }
        else if (operation == MULTIPLICATION) {
            Multiply m1 = new Multiply(argumentOne, argumentTwo);
            mOut.print(m1.toString());
        }
        else {
            Divide d1 = new Divide(argumentOne, argumentTwo);
            mOut.print(d1.toString());
        }

    }
}
