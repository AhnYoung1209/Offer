package NewCoderJumpStep;

import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/8/14.
 */
public class JumpStep
{
    public int jumpFloor(int steps)
    {
        if (steps == 1 || steps == 2)
        {
            return steps;
        }
        int preRes = 1;
        int curRes = 2;
        int result = 0;
        for (int i = 3; i <= steps; i++)//Here is the "=".
        {
           result = preRes + curRes;
           preRes = curRes;
           curRes = result;
        }
        return result;
    }
    public static void main(String[] args)
    {
        JumpStep jumpStep = new JumpStep();
        int result = jumpStep.jumpFloor(3);
        out.println(result);
    }
}
