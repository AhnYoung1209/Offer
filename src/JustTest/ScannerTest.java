package JustTest;

import java.util.Scanner;

/**
 * Created by BoGummyYoung on 2017/8/24.
 */
public class ScannerTest
{
    public static void main(String[] args)
    {
//        Scanner s = new Scanner(System.in);
////        System.out.println(s.next());
////        System.out.println(s.next());
//        System.out.println(s.nextLine());
//        System.out.println(s.nextLine());
        Scanner s = new Scanner("123 123");
        while(s.hasNextInt())
        {
            System.out.println(s.nextInt());
        }
    }
}
