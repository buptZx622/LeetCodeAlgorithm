package main.java.Medium.Array;

import java.util.Arrays;

/**
 * @author zhuangxu
 * @date 2019/11/13 19:31
 */
public class LeetCode153 {
    /**题意本身很简单，但要求复杂度小于O(n)，可考虑二分法，关键点在于二分后左区间和右区间的选取条件
        这里比较的是nums[mid]的值与最后一位数的大小
     **/
    public int findMin(int[] nums) {
        int length=nums.length;
        if(length==1) {
            return nums[0];
        }
        if(nums.length==2) {
            return Math.min(nums[0], nums[1]);
        }
        int mid=length/2;
        if(nums[mid]>nums[length-1]){
            return findMin(Arrays.copyOfRange(nums,mid+1,length));
        }else {
            return findMin(Arrays.copyOfRange(nums,0,mid+1));
        }
    }
}
