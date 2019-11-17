package Medium.Dp;

import java.util.Arrays;

//dp[i][j]表示 使用piles[i]~piles[j]先手能拿到最大的石子数
// 判断先手拿的最大值是否超过总和一半极客

public class LeetCode877 {

    public boolean stoneGame(int[] piles) {
        int length=piles.length;
        int[][] dp=new int[length][length];
        for (int i = 0; i <length; i++) {
            dp[i][i]=piles[i];
        }
        int sum= Arrays.stream(piles).sum();
        for (int i = length-2; i >=0 ; i--) {
            for (int j = i+1; j <length ; j++) {
                int total=sumByRanage(piles,i,j);
                //状态转移方程比较关键
                dp[i][j]=total-Math.min(dp[i][j-1],dp[i+1][j]);
            }
        }
        return dp[0][length-1]>sum/2;
    }

    public int sumByRanage(int[] arr,int i,int j){
        int sum=0;
        for (int k = i; k <=j ; k++) {
            sum+=arr[k];
        }
        return sum;
    }
}
