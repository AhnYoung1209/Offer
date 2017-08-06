package AboutStack.LinkedStack;

import AboutStack.ArraysStack.StackUnderflowException;

/**
 * Created by BoGummyYoung on 2017/7/5.
 */
public class LinkedStackClass {
    //Definition of the node
    protected class StackNode
    {
        String info;
        StackNode link;
    }

    //instance variable
    private StackNode stackTop; //reference variable to the top element of the stack

    //constructor
    public LinkedStackClass()
    {
        stackTop = null;
    }

    //instance function
    public void initializeStack()
    {
        stackTop = null;
    }

    //isEmptyStack
    public boolean isEmptyStack()
    {
        return(stackTop == null);
    }

    //Because the memory allocation of the stack is dynamic,
    // the stack is never full.
    public boolean isFullStack()
    {
        return false;
    }

    //push an element into the stack
    public void push(String newElement)
    {
        //reference variable to create the new node
        //create the node
        StackNode newNode = new StackNode();
        //store new element in the node
        newNode.info = newElement;
        //insert newNode before stackTop
        newNode.link = stackTop;
        //set stackTop to point to the top node
        stackTop = newNode;
    }//Do not need to check the stack whether full or not.

    //top function
    //stack can not be empty
    public String top() throws StackUnderflowException
    {
        if (stackTop == null)
            throw new StackUnderflowException();
        //return the top element
        return stackTop.info;
    }

    //pop function
    public void pop() throws StackUnderflowException
    {
        if(stackTop == null)
            throw new StackUnderflowException();
        //advance stackTop to the next node
        stackTop = stackTop.link;
    }


}
