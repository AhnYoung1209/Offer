package AboutStack.ArraysStack;

/**
 * Created by BoGummyYoung on 2017/7/4.
 * Define the stack as ADT.
 * Define the stack using array.
 */
public class StackClass {

    //define instance variable
    private int maxStackSize;//variable to store the maximum stack size
    private int stackTop; //variable to point to the top of the stack
    private int[] list;  //array of reference variable

    //instance function and constructor
    public void initializeStack()
    {
        for (int i = 0; i < maxStackSize; i++)
        {
            list[i] = 0;
        }
        stackTop = 0;
    }
    public boolean isEmptyStack()
    {
//        if (stackTop == 0)
//            return true;
//        else
//            return false;
        //using this way
        return(stackTop == 0);
    }

    public boolean isFullStack()
    {
        //the range of "stackTop":0~maxStackSize
        return(stackTop == maxStackSize);
    }

    //Push
    public void push(int newItem) throws StackOverflowException
    {
        //learn how to throw exceptions
        if (isFullStack())
        {
            throw new StackOverflowException();
        }
        //Notice: stackTop-1 is the location of the top element of the stack
//        list[stackTop] = newItem.getCopy();
        list[stackTop] = newItem;
        stackTop++;
    }

    //return stackTop
    public int top() throws StackUnderflowException
    {
        if (isEmptyStack())
        {
            throw new StackUnderflowException();
        }
        int temp = list[stackTop-1];
        return temp;
    }

    //pop
    public void pop() throws StackUnderflowException
    {
        if (isEmptyStack())
        {
            throw new StackUnderflowException();
        }
        stackTop--;
        list[stackTop] = 0;
    }

    //copy function
    private void copy(StackClass otherStack)
    {
        list = null;
        System.gc();

        maxStackSize = otherStack.maxStackSize;
        stackTop = otherStack.stackTop;

        list = new int[maxStackSize];

        //copy otherStack into this stack
        for (int i = 0; i < stackTop; i++) {
            list[i] = otherStack.list[i];
        }
    }


    //constructor with a parameter
    public StackClass(int stackSize)
    {
        if (stackSize <= 0)
        {
            System.err.println("The size of the array to implement the stack must be positive.");
            System.err.println("Creating an array of size 100.");

            maxStackSize = 100;
        }
        else
        {
            maxStackSize = stackSize;
        }

        //set stackTop to 0
        stackTop = 0;
        list = new int[maxStackSize];//create the array
    }

    //default constructor
    public StackClass()
    {
        maxStackSize = 100;
        stackTop = 0;
        list = new int[maxStackSize];//create the array
    }

    //copy the constructor
    //
    public StackClass(StackClass otherStack)
    {
        copy(otherStack);
    }

    public void copyStack(StackClass otherStack)
    {
        if (this != otherStack)//avoid self-copy
        {
            copy(otherStack);
        }
    }
}
