package main.java.Easy.Dp;

/**
 * @author zhuangxu
 * @date 2019/11/13 14:17
 */
public class LeetCode303 {
    int[] sums;
    public LeetCode303(int[] nums) {
        if(nums==null||nums.length==0) {
            return;
        }//有一个比较神奇的测试用例必须要这样做限制，但感觉很无聊
        sums=new int[nums.length];
        sums[0]=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            sums[i]=sums[i-1]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if(i==0) {
            return sums[j];
        }else {
            return sums[j]-sums[i-1];
        }
    }
}
