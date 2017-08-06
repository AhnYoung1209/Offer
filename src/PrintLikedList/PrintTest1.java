package PrintLikedList;

/**
 * Created by BoGummyYoung on 2017/6/28.
 * Use the API to print and add.
 */
import java.util.LinkedList;

import java.util.ArrayList;
import java.util.Stack;

public class PrintTest1 {
    public static void main(String[] args){
        LinkedList myLinkedList = new LinkedList();
        Stack myStack = new Stack();
        for (int i = 0; i <= 5; i++){
            myLinkedList.add(i);
        }
        System.out.println(myLinkedList);
        //将LinkedList当作LIFO的堆栈
        LinkedList stack = new LinkedList();

        // 将1,2,3,4添加到堆栈中
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        // 打印“栈”
        System.out.println("stack:"+stack);

        // 删除“栈顶元素”
        System.out.println("stack.pop():"+stack.pop());

        // 取出“栈顶元素”
        System.out.println("stack.peek():"+stack.peek());

        // 打印“栈”
        System.out.println("stack:"+stack);
    }
}
