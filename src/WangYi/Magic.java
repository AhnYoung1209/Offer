package WangYi;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/9/9.
 */
public class Magic
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int L = in.nextInt();
        if (n <=1)
        {
            out.println(n);
        }
        int[] ls = new int[n];
        ls[0] = 0;
        for (int i = 1; i < n; i++)
        {
            ls[i] = in.nextInt();
        }
        int maxPath = 0;
        for (int i = 0; i < n; i++)
        {
            int len = 0, p = i;
            while(ls[p] != 0)
            {
                len++;
                p = ls[p];
            }
            if (len > maxPath)
            {
                maxPath = len;
            }
        }
        maxPath += 1;
        if (L <= maxPath)
        {
            out.println(L+1);
        }
        else
        {
            out.println(maxPath + (L - maxPath)/2 + 1);
        }
    }

}
