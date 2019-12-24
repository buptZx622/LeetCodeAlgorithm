package main.java.Medium.Array;

import java.util.Arrays;

/**
 * @author zhuangxu
 * @date 2019/12/24 11:07
 */
public class LeetCode561 {

    /**
     * 贪心思路去理解
     * @param nums
     * @return
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for (int i = 0; i <nums.length ; i+=2) {
            sum+=nums[i];
        }
        return sum;
    }
}
