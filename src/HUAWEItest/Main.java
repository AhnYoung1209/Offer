package HUAWEItest;

import java.util.Scanner;

import static java.lang.Character.isDigit;

/**
 * Created by lenovo on 2017/8/16.
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            String[] strs = str.split("\\s+");
            String str1 = strs[0];
            String str2 = strs[1];
            int maxCount =0;
            if (str1.length() != str2.length())
            {
                maxCount = -1;
            }
            else
            {
                int curCount = 0;
                for (int i = 0; i < str1.length(); i++)
                {
                    if (!isDigit(str1.charAt(i)) || !isDigit(str2.charAt(i)))
                    {
                        curCount = -1;
                        break;
                    }
                }
            }
        }
    }
}
