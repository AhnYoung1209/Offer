package AboutQueue;

/**
 * Created by BoGummyYoung on 2017/7/28.
 */
public class QueueOverflowException extends QueueException {
    public QueueOverflowException()
    {
        super("Queue Overflow");
    }
    public QueueOverflowException(String msg)
    {
        super(msg);
    }
}
