package JingDong;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/9/8.
 */
public class BracktetNum
{
    public static  boolean isLeftBracket(char ch)
    {
        if (ch == '(')
        {
            return true;
        }
        else
            return false;
    }
    public static  boolean isRightBracket(char ch)
    {
        if (ch == ')')
        {
            return true;
        }
        else
            return false;
    }
    public int nJie(int n)
    {
        int res = 1;
        for (int i = 1; i <= n; i++)
        {
            res = res * i;
        }
        return res;
    }
    public static int matchNum(String s)
    {
        int len = s.length();
        int mid = len/2;
        int i = 0;
        while (i <= mid-1)
        {
            if (isLeftBracket(s.charAt(i)))
            {
                i++;
                continue;
            }
            else
                break;
        }
        if (i == mid - 1)
        {
            return new BracktetNum().nJie(i);
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        BracktetNum bracktetNum = new BracktetNum();
        int num = bracktetNum.matchNum(s);
        out.println(num);
    }
}
