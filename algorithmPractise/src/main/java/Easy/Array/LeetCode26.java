package main.java.Easy.Array;

/**
 * @author zhuangxu
 * @date 2019/11/4 16:23
 * leetcode 26  删除排序数组中的重复项 https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 *  原地 修改数组
 */
public class LeetCode26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int last=nums[0];
        int index=1;
        for (int i = 1; i <nums.length; i++) {
            if(nums[i]!=last){
                last=nums[i];
                nums[index++]=nums[i];
            }

        }
        return index;
    }
}
