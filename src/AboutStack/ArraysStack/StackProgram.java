package AboutStack.ArraysStack;


import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/7/5.
 */
//Program to test the various operations of a stack
public class StackProgram {
    public static void main(String[] args)
    {
        StackClass intStack = new StackClass(50);
        StackClass tempStack = new StackClass();

        try
        {
            intStack.push(23);
            intStack.push(45);
            intStack.push(56);
        }
        catch (StackOverflowException sofe)
        {
            out.println(sofe.toString());
            System.exit(0);
        }
        tempStack.copyStack(intStack);//copy intStack into tempStack
        out.println("tempStack elements:  ");

        while (!tempStack.isEmptyStack()) //print tempStack
        {
            out.println(tempStack.top() + "");
            tempStack.pop();
        }
        out.println();

        out.println("The top element of the intStack:  " + intStack.top());
    }
}
