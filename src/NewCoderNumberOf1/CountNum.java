package NewCoderNumberOf1;

import java.util.Calendar;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by lenovo on 2017/8/18.
 * 输入：一个整数
 * 输出：该整数二进制形式下1的个数
 * 示例：
 * 输入：4
 * 输出：1
 */
public class CountNum
{
    public int NumberOf1 (int n)
    {
        //Java自带函数
        //return Integer.bitCount(n);
        int count = 0;
        if (n == 0)
        {
            return 0;
        }
        while (n != 0)
        {
            ++count;//n!=0说明二进制表示中至少有一个1
            n = (n-1) & n;//做与运算，得到n去掉最右边1后的值
        }
        return count;


    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        CountNum countNum = new CountNum();
        int number = countNum.NumberOf1(n);
        out.println(number);
    }
}
