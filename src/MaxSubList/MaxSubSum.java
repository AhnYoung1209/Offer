package MaxSubList;

import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/8/16.
 * 最大子序列之和
 */
public class MaxSubSum {
    public static int maxSum(int[] array){
        int maxSum = 0, curSum = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < array.length; i++){
            curSum += array[i];
            if(curSum > maxSum){
                maxSum = curSum;
                end = i;
            }else if(curSum < 0){
                curSum = 0;
                out.println("重新记录最大子序列元素开始位置：");
                start = i + 1;
            }

        }
        out.println("最大子序列元素开始位置：" + start);
        out.println("最大子序列元素结束位置：" + end);
        out.println("最大子序列为：");
        for (int j = start; j <= end; j++)
        {
            out.print(array[j] + " ");
        }
        out.println();
        return maxSum;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        int[] array = new int[]{4,-3,5,-2,-1,2,6,-2};
        int[] array = new int[]{4,-3,-5,2,-3,2,6,-2};
        long startTime = System.nanoTime();
        out.println("最大子序列和为："+MaxSubSum.maxSum(array));
        long endTime = System.nanoTime();
        out.println("程序耗时为："+(endTime-startTime)+" ns");
    }
}
