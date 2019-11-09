package Easy.Array;
/**
 * @program: github
 * @description:
 * @author: ZhuangXu
 * @create: 2019-11-09 23:04
 * 思路很简单，曾经面试的时候考过自己实现一个ArrayList，remove方法实现和这个类似
 **/


public class LeetCode27 {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for (int i = 0; i<nums.length ; i++) {
            if(nums[i]==val)
                continue;
            nums[index++]=nums[i];
        }
        return index;
    }
}
