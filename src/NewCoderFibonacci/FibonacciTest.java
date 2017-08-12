package NewCoderFibonacci;

import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/8/12.
 */
public class FibonacciTest {
    public int Fibonacci(int n) {
        if(n == 0 )
        {
            return 0;
        }
        else if(n == 1)
        {
            return 1;
        }
        else
        {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }

    }

    //Test
    public static void main(String[] args)
    {
        FibonacciTest fibonacciTest = new FibonacciTest();
        int num = fibonacciTest.Fibonacci(4);
        out.println(num);

    }
}
