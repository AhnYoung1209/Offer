package AboutStack.ArraysStack;

/**
 * Created by BoGummyYoung on 2017/7/4.
 */
public class StackUnderflowException extends StackException {
    public StackUnderflowException()
    {
        super("Stack Underflow");
    }
    public StackUnderflowException(String msg)
    {
        super(msg);
    }

}
