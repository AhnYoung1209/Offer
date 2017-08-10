package AboutQueue.ArraysQueue;

import AboutQueue.QueueOverflowException;
import AboutQueue.QueueUnderflowException;

import java.util.Queue;

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

    ///empty or full
    public boolean isEmptyQueue()
    {
        return (count == 0);
    }
    public boolean isFullQueue()
    {
        return (count == maxQueueSize);
    }

    //front:return the first element of the Queue
    public int front() throws QueueUnderflowException
    {
        if(isEmptyQueue())
            throw new QueueUnderflowException();
        int temp = list[queueFront];
        return temp;
    }

    //back:return the last element of the Queue
    public int back() throws QueueUnderflowException
    {
        if (isEmptyQueue())
            throw new QueueUnderflowException();
        int temp = list[queueRear];
        return temp;
    }

    //addQueue:add an element to the rear of the Queue
    /**
     * 在队尾添加新元素；
     * queueRear指向队列的尾元素，
     * 首先，将queueRear移到下一个数组单元
     * 然后，将新元素添加到queueRear指向的数组单元
     * 最后，cout+1
     */
    public void addQueue(int newElement) throws QueueOverflowException
    {
        if (isFullQueue())
            throw new QueueOverflowException();
        //Notice the function
        queueRear = (queueRear + 1) % maxQueueSize;
        list[queueRear] = newElement;
        count++;
    }

    //deleteQueue:delete an element from the front of the Queue
    /**
     * 在队首删除首元素
     * queueFront指向队列的首元素
     * 首先，将queueFront指向下一个队列元素
     * 然后，count-1
     * 如果队列为空，返回下溢异常
     */
    public void deleteQueue() throws QueueUnderflowException
    {
        if (isEmptyQueue())
            throw new QueueUnderflowException();

        //执行顺序？
        list[queueFront] = 0;
        //Notice the function
        queueFront = (queueFront + 1) % maxQueueSize;
        count--;
    }

    //Constructor

    //default constructor
    public QueueClass()
    {
        maxQueueSize = 100;
        queueFront = 0;
        queueRear = maxQueueSize-1;
        count = 0;
        list = new int[maxQueueSize];//create the array to implement the queue
    }

    //constructor with a parameter
    public QueueClass(int queueSize)
    {
        if (queueSize <= 0)
        {
            System.err.println("The size of the array to hold the queue must be positive.");
            System.err.println("Creating an array of size 100.");

            maxQueueSize = 100;
        }
        else
            maxQueueSize = queueSize;

        queueFront = 0;
        queueRear = maxQueueSize - 1;
        count = 0;
        list = new int[maxQueueSize];
    }



}
