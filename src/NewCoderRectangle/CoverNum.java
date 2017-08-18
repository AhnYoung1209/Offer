package NewCoderRectangle;

import static java.lang.System.out;

/**
 * Created by lenovo on 2017/8/18.
 */
public class CoverNum
{
    public int RectCover(int target)
    {
        int preNum = 1;
        int curNum = 2;
        int coverNum = 0;
        if (target < 0)
        {
            return -1;
        }
        else if (target < 3)
        {
            return target;
        }
        for (int i = 3; i <= target; i++)
        {
            coverNum = preNum + curNum;
            preNum = curNum;
            curNum = coverNum;
        }
        return coverNum;
    }
    public static void main(String[] args)
    {
        CoverNum coverNum = new CoverNum();
        int Num = coverNum.RectCover(6);
        out.println(Num);
    }
}
