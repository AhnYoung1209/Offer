package LinkedList;

/**
 * Created by BoGummyYoung on 2017/6/28.
 * Every node is defined as a class.
 * It contends two fields.
 */
public class LinkedListNode {
    //Save the information.
    public int info;
    //Save the address of the next node.
    public LinkedListNode link;
    public LinkedListNode(int info)
    {
        this.info = info;
    }
}
