package NewCoderFibonacci;

import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/8/12.
 * FibonacciTest类中的递归方法容易导致Stack Overflow异常
 * 本方法采用非递归的方式，避免上述异常
 * 缺陷：使用三个变量，可以压缩为两个变量节省空间
 */
public class FibonacciTest1 {
    public int Fibonacci(int n) {
        int result = 0;
        int preNum = 0;
        int curNum = 1;
        if (n ==0 || n == 1)
        {
            return n;
        }
        for(int i = 1; i < n; i++)
        {
            result = curNum + preNum;
            preNum = curNum;
            curNum = result;
        }
        return result;
    }
    public static void main(String[] args)
    {
        FibonacciTest1 fibonacciTest1 = new FibonacciTest1();
        int result = fibonacciTest1.Fibonacci(4);
        out.println(result);
    }
}
