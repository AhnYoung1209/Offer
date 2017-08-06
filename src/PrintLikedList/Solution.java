package PrintLikedList;

import java.util.ArrayList;
import java.util.Stack;

import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/6/28.
 */
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode)
    {
//        Stack stack = new Stack();//This is wrong.
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> reList = new ArrayList<>();
        ListNode t = listNode;
        while(t != null)
        {
            stack.push(t.val);
            t = t.next;
        }
        while(!stack.empty())
        {
            reList.add(stack.pop());
        }
      return reList;
    }
    public static void main(String[] args)
    {
        ListNode ls = new ListNode(1);
        ListNode temp = ls;
        for(int i =0; i < 5; i++) {
            temp.next = new ListNode(i+2);
            temp = temp.next;
        }
//      Notice: instantiation
        Solution sl = new Solution();
        ArrayList<Integer> integers = sl.printListFromTailToHead(ls);
        out.println(integers);

    }

}