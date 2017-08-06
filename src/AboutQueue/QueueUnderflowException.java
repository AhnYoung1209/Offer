package AboutQueue;

/**
 * Created by BoGummyYoung on 2017/7/28.
 */
public class QueueUnderflowException extends QueueException {
    public QueueUnderflowException()
    {
        super("Queue Underflow");
    }
    public QueueUnderflowException(String msg)
    {
        super(msg);
    }
}
