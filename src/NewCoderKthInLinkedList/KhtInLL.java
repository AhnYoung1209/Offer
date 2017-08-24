package NewCoderKthInLinkedList;

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
    ListNode head;
    ListNode current;
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

    public void addInfo(int info)
    {
        if (head == null){
            head = new ListNode(info);
            current = head;
        }
        else{
            current.next = new ListNode(info);
            current = current.next;
        }
    }
    //test
    public static void main(String[] args)
    {
        KhtInLL myList = new KhtInLL();
        for (int i = 0; i <= 5; i++)
        {
            myList.addInfo(i);
        }
        myList.FindKthToTail(myList.head,2);
    }
}


