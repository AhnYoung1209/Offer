package NewCoderJumpStep;

import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/8/14.
 */
public class AbnormalJumpStep
{
    //steps is the number of the floor
    public int abnormalJumpFloor(int steps)
    {
        int result = 0;
        int preRes = 2;
        if (steps == 1 || steps == 2)
        {
            result = steps;
            return result;
        }
        for (int i = 3; i <= steps; i++)
        {
            result = 2*preRes;
            preRes = result;
        }
        return result;
    }
    public static void main(String[] args)
    {
        AbnormalJumpStep abnormalJumpStep = new AbnormalJumpStep();
        int result = abnormalJumpStep.abnormalJumpFloor(3);
        out.println(result);
    }
}
