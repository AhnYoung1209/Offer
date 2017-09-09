package NewCoderReverseList;

/**
 * Created by BoGummyYoung on 2017/9/2.
 * Define a function:
 * input: headNode
 * process: reverse the list
 * output: headNode after reversing the list
 * 定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点
 *
 */
class ListNode
{
    int value;
    ListNode next;
}
public class ReverseList
{
    public ListNode Reverse(ListNode head)
    {
        ListNode reverseHead = null;//定义反转链表的头结点
        ListNode curNode = head;//当前遍历到的结点，初始为原链表的头结点
        ListNode preNode = null;//初始状态为空，因为当前指向的结点为头结点
        while(curNode != null)
        {
            //当前结点不为空时，找到当前结点的下一个结点
            ListNode nextNode = curNode.next;

            if (nextNode == null)
            {
                //如果只要一个头结点，那么反转后的链表的头结点即为当前遍历的结点
                reverseHead = curNode;
            }
            //否则当前结点的下一个结点，指向其原链表中的前一个结点
            curNode.next = preNode;

            //原链表的下一个结点定义为当前结点,继续遍历
            preNode = curNode;
            curNode = nextNode;
        }
        return reverseHead;

        //simple idea

    }
}
