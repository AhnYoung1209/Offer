package WangYi;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by BoGummyYoung on 2017/9/9.
 */
public class Main
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n = in.nextInt();
            int one = 0, two = 0, four = 0, tmp;
            for (int j = 0; j < n; j++)
            {
                tmp = in.nextInt();
                if (tmp % 4 == 0)
                {
                    four ++;
                }
                else if ((tmp & 1) == 1)
                {
                    one ++;
                }
                else
                {
                    two ++;
                }
            }
            if (one == 1)
            {
                if (four >= one)
                {
                    out.println("Yes\n");
                }
                else
                {
                    out.println("No\n");
                }
            }
            else
            {
//                if (four == 1)
//                {
//                    out.println("Yes");
//                }
//                else
//                {
//
//                }
                out.println("Yes");
            }
        }
    }

}

//#define LL long long
//        using namespace std;
//
//
//
//
//        int main() {
//
//        int t;
//        scanf("%d", &t);
//        for (int i = 0; i < t; i++) {
//        int n;
//        scanf("%d", &n);
//        int one = 0, two = 0, four = 0, tmp;
//        for (int j = 0; j < n; j++) {
//        scanf("%d", &tmp);
//        if (tmp % 4 == 0) {
//        four ++;
//        } else if (tmp & 1) {
//        one ++;
//        } else {
//        two ++;
//        }
//        }
//        if (one) {
//        if (four >= one) {
//        printf("Yes\n");
//        } else {
//        printf("No\n");
//
//        }
//        } else {
////            if (four) {
////                printf("Yes");
////            } else {
////
////            }
//        printf("Yes");
//        }
//        }
//
//        }