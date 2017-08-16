package NewCoderJumpStep;

import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/8/14.
 */
public class AbnormalJumpStep1 {
    //steps is the number of the floor
    public int abnormalJumpFloor1(int steps)
    {
        if (steps == 1 || steps == 2)
        {
            return steps;
        }
        return 1<<(steps - 1);
    }
    public static void main(String[] args)
    {
        AbnormalJumpStep1 abnormalJumpStep1 = new AbnormalJumpStep1();
        int result = abnormalJumpStep1.abnormalJumpFloor1(3);
        out.println(result);
    }
}
