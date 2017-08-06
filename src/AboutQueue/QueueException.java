package AboutQueue;

/**
 * Created by BoGummyYoung on 2017/7/28.
 * 队列的异常类
 */
public class QueueException extends RuntimeException
{
    public QueueException()
    {
    }
    public QueueException(String msg)
    {
        super(msg);
    }
}
