package NewCoderFibonacci;

/**
 * Created by BoGummyYoung on 2017/8/12.
 */
public class FibonacciTest2
{
    public int Fibonacci(int n)
    {
        int f1 = 1;
        int f2 = 1;
        if (n <= 0)
        {
            return 0;
        }
        if (n ==1 || n == 2)
        {
            return n;
        }
        while (n-- > 2)
        {
            f1 = f1 + f2;
            f2 = f1 - f2;
        }
        return f1;
    }
}
