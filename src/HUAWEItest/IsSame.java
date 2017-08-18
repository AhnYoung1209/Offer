package HUAWEItest;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.System.out;

/**
 * Created by lenovo on 2017/8/16.
 */
public class IsSame
{
    public int sameNum(String str1, String str2)
    {
        int str1Len = str1.length();
        int str2Len = str2.length();
        int count = 0;
        int maxCount = 0;
//        int[] counts = new int[1000];
        if (str1Len != str2Len)
        {
            return -1;
        }
        //不是数字
        for (int i = 0, j = 0; i < str1Len && j < str2Len; i++ , j++)
        {
            if (!isDigit(str1.charAt(i)) || !isDigit(str2.charAt(i)))
            {
                return -1;
            }
            break;
        }
//        int index = 0;
        for (int i = 0, j = 0; i < str1Len && j < str2Len; i++ , j++)
        {
            if (str1.charAt(i) == str2.charAt(j))
            {
                count++;
            }
            else
            {

//                counts[index] = count;
//                index++;
                if (count > maxCount)
                    maxCount = count;
                count = 0;
            }
        }
//        int maxCount = counts[0];
//        for (int i = 0; i < counts.length; i++)
//        {
//            if (counts[i] > maxCount)
//            {
//                maxCount = counts[i];
//            }
//        }
        return maxCount;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        long startTime = System.nanoTime();
        IsSame isSame = new IsSame();
        int count = isSame.sameNum(str1,str2);
        out.println(count);
        long endTime = System.nanoTime();
        out.println("程序耗时为："+(endTime-startTime)+" ns");

    }
}
