package main.java.Medium.Array;

/**
 * @author zhuangxu
 * @date 2019/12/2 10:29
 */
public class LeetCode1014 {
    public int maxScoreSightseeingPair(int[] A) {
        int[] start=new int[A.length];
        for (int i = 0; i <A.length ; i++) {
            start[i]=A[i]+i;
        }
        int maxLeft=start[0];
        int res=0;
        for (int i = 1; i <A.length; i++) {
            res=Math.max(res,maxLeft+A[i]-i);
            maxLeft=Math.max(maxLeft,start[i]);
        }
        return res;
    }
}
