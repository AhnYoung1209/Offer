package DecimalTranslation;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/8/16.
 */
public class DecimalToHex
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        out.println("请输入十进制数:");
        int s = input.nextInt();
        out.println(s + "的十六进制形式为：" + decToHex(s));
    }

    public static String decToHex(int s)
    {
        String hex = "" ;
        int remainder = 0;
        while(s != 0)
        {
            remainder = s % 16;
            hex = changeToChar(remainder) + hex;
            s = s >> 4;
        }
        return hex;
    }
    public static char changeToChar(int r)
    {
        if (r < 10)
            return (char)(r + '0');
        else
            return (char)(r - 10 + 'A');
    }


}
