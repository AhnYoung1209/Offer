package NewCoderKthInLinkedList;

import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/8/24.
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
//Node Class

class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val)
    {
        this.val = val;
    }
        }
public class KhtInLL
{
    public ListNode FindKthToTail(ListNode head, int k)
    {
        if (head == null || k == 0)
        {
            return null;
        }//robust
        ListNode cur = head;
        ListNode pre = head;
        for (int i = 0; i < k-1; i++)
        {
            if (pre.next != null)
            {
                pre = pre.next;
            }
            else
                return null;
        }
        while (pre.next != null)
        {
            pre = pre.next;
            cur = cur.next;
        }
        return cur;
    }

    //test
    public static void main(String[] args)
    {
        KhtInLL myList = new KhtInLL();
//        ListNode head = null;
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
//        head.next.val = 2;
//        head.next.next.val =3;
//        head.next.next.next.val = 4;
//        ListNode cur = head;
//        for (int i = 0 ; i < 6; i++)
//        {
//            cur.val = i;
//            cur = cur.next;
//        }
        ListNode node = myList.FindKthToTail(head,2);
        out.println(node.val);
    }
}


