package AboutQueue;

/**
 * Created by BoGummyYoung on 2017/8/6.
 */
public class QueueClass
{
    //define instance variable
    private int maxQueueSize;
    private int count;
    private int queueFront;
    private int queueRear;
    private int[]list; //Array of reference to the objects that holds the queue elements

    //initialize
    public void initializeQueue()
    {
        for(int i = queueFront;i < queueRear;i = (i+1) % maxQueueSize)
            list[i] = 0;

        queueFront = 0;
        queueRear = maxQueueSize - 1;
        count = 0;
    }

}
