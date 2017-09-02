package Ali;

/**
 * Created by BoGummyYoung on 2017/8/25.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static int findCircleNum(int[][] M) {
        int lenM = M.length;
        UnFind union = new UnFind(lenM);
        for(int i = 0; i < lenM-1; i++){
            for (int j =i + 1; j < lenM; j ++){
                if (M[i][j] == 1)
                {
                    union.union(i,j);
                }
            }
        }
        return union.count();
    }

    static class UnFind{
        private int count = 0;
        private int[] parent, rank;

        public UnFind(int n)
        {
            count = n;
            parent = new int[n];
            rank = new int[n];
            for (int i= 0; i< n; i++)
            {
                parent[i] = i;
            }
        }

        public int find(int p)
        {
            while(p != parent[p])
            {
                parent[p] = parent[parent[p]];
                p = parent[p];
            }
            return p;
        }

        public void union(int p , int q)
        {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ)
            {
                return;
            }
            if (rank[rootQ] > rank[rootP])
            {
                parent[rootP] = rootQ;
            }
            else{
                parent[rootQ] = rootP;
                if (rank[rootQ] == rank[rootP])
                {
                    rank[rootP] ++;
                }
            }
            count --;
        }

        public int count()
        {
            return count;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _M_rows = 0;
        int _M_cols = 0;
        _M_rows = Integer.parseInt(in.nextLine().trim());
        _M_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _M = new int[_M_rows][_M_cols];
        for(int _M_i=0; _M_i<_M_rows; _M_i++) {
            String row_x=String.valueOf(in.nextLine().trim());
            String[] row_y=row_x.split(",");
            for(int _M_j=0; _M_j<_M_cols; _M_j++) {
                _M[_M_i][_M_j] = Integer.parseInt(row_y[_M_j]);

            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = findCircleNum(_M);
        System.out.println(String.valueOf(res));

    }
}
