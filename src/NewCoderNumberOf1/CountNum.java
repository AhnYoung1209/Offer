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
        if (n < 0)
        {
            n = n & 0x7FFFFFFF;
            ++count;
        }
        if (n == 0)
        {
            return 0;
        }
        while(n != 0)
        {
            count += n & 1;
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        CountNum countNum = new CountNum();
        int number = countNum.NumberOf1(10);
        out.println(number);
    }
}
