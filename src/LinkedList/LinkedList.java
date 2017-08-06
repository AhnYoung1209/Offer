package LinkedList;

import static java.lang.System.out;
import java.util.ArrayList;

/**
 * Created by BoGummyYoung on 2017/6/28.
 * Create LinkedList.
 */
public class LinkedList {
    private LinkedListNode head;//Define the head node.
    private LinkedListNode current;//Record the current node.
    //Add info to the LinkedList.
    public void addInfo(int info)
    {
        if (head == null){
            head = new LinkedListNode(info);
            current = head;
        }
        else{
            current.link = new LinkedListNode(info);
            current = current.link;
        }
    }
    //Traverse the LinkedListNode
    public void traverse(LinkedListNode head){
        current = head;
        while (current!=null)
        {
            out.println(current.info + " ");
            current = current.link;
        }
    }
    //Test.
    public static void main(String[] args)
    {
        LinkedList myList = new LinkedList();
        for (int i = 0; i <= 5; i++)
        {
            myList.addInfo(i);
        }
        myList.traverse(myList.head);
    }


}
