package RotatedSortedArray;

import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/8/10.
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减（递增）排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1
 * 核心思想：二分查找
 * 分为三种情况：
 * 1、数组为空，返回0
 * 2、部分旋转，例如由{1,2,3,4,5}旋转为{3,4,5,1,2}，分为两部分非递减序列
 * 3、完全旋转，例如由{1,2,3,4,5}旋转为{1,2,3,4,5}，由于是非递减排序的数组，第一个元素最小
 */
public class MinNum {
    public static int GetMin(int[] numbers)
    {
        if (numbers == null || numbers.length <= 0)
        {
            return 0;
        }

        int index1 = 0;
        int index2 = numbers.length - 1;
        //将indexMid初始化为index1的原因：
        //如果数组的第一个数字小于最后一个数字，表明该数组是排序的，就可以直接返回第一个数字
        int indexMid = index1;

        while(numbers[index1] >= numbers[index2])
        {
            //index1与index2相邻，返回index2指向的数组元素
            if (index2 - index1 == 1)
            {
//                return numbers[index2];
                indexMid = index2;
                break;//终止循环
            }
            indexMid = (index1 + index2) / 2;//int类型，除法结果为int类型，只保留整数部分
            //特殊情况：如果下标为index1、index2、indexMid指向的三个数字相等，则只能顺序查找
            if (numbers[index1] == numbers[index2]  && numbers[indexMid] == numbers[index2])
            {
                return GetMinInOrder(numbers,index1,index2);
            }
            //缩小查找范围
            if (numbers[indexMid] >= numbers[index1])
            {
                index1 = indexMid;
            }
            else if (numbers[indexMid] <= numbers[index1])
            {
                index2 = indexMid;
            }

        }
        return numbers[indexMid];
    }

    //顺序查找
    public static int GetMinInOrder(int[] numbers, int index1, int index2)
    {
        int result = numbers[index1];
        for(int i = index1 + 1; i <= index2; ++i)
        {
            if (result > numbers[i])
            {
                result = numbers[i];
            }

        }
        return result;
    }

    //test
    public static void main(String[] args)
    {
        int[] arrayTest = {4,5,6,1,1,2,3};
        MinNum minNumTest = new MinNum();
        int minNum = minNumTest.GetMin(arrayTest);
        out.println(minNum);
    }

}



