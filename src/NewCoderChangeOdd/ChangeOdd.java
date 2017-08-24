package NewCoderChangeOdd;

import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/8/23.
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，
 */
public class ChangeOdd
{
    public void reOrderArray(int[] array)
    {
        int pre = 0;
        int aft = array.length - 1;
        while(pre < aft)
        {
            while (pre < aft && array[pre] % 2 != 0 )
            {
                pre++;
            }
            while (pre < aft && array[aft] % 2 == 0)
            {
                aft--;
            }
            if (pre < aft)
            {
                int temp = array[pre];
                array[pre] = array[aft];
                array[aft] = temp;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7};
        ChangeOdd changeOdd = new ChangeOdd();
        changeOdd.reOrderArray(array);
        for (int i =0; i< array.length;i++)
        {
            out.print(array[i]+",");
        }
    }
}
