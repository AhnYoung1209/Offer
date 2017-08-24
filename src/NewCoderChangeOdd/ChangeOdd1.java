package NewCoderChangeOdd;


import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/8/23.
 * 添加一个排序条件：
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ChangeOdd1
{
    public void reOrderArray(int[] array)
    {
        int[] array1 = new int[array.length];//建立一个等长数组
        int j =0;
        int oddCount = 0;
        for (int i = 0; i < array.length; i++)
        {
            if ((array[i] & 1) == 1)
            {
                //如果是奇数，放到新数组中
                array1[j] = array[i];
                j++;
                oddCount++;//记录原数组中奇数的个数
            }
        }
        for (int i = 0; i < array.length; i++)
        {
            if ((array[i] & 1) != 1)
            {
                //如果是偶数，放到新数组中，起始位置为原数组奇数个数值
                array1[oddCount] = array[i];
                oddCount++;
            }
        }
        //将新数组覆盖原数组
        for (int i = 0; i < array.length; i++)
        {
            array[i] = array1[i];
        }
    }

    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7};
        ChangeOdd1 changeOdd1 = new ChangeOdd1();
        long startTime = System.nanoTime();
        changeOdd1.reOrderArray(array);
        long endTime = System.nanoTime();
        out.println("程序耗时为："+(endTime-startTime)+" ns");
        for (int i =0; i< array.length;i++)
        {
            out.print(array[i]+",");
        }
    }
}
