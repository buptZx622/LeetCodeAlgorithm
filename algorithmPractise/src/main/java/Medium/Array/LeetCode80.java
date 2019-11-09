package Medium.Array;
/**
 * @program: github
 * @description:
 * @author: ZhuangXu
 * @create: 2019-11-09 23:15
 **/


public class LeetCode80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int last=nums[0];
        int count=1;
        int index=1;
        for (int i = 1; i <nums.length; i++) {
            if(nums[i]==last){
                count++;
                if(count>2) {
                    continue;
                }else {
                    nums[index++]=nums[i];
                }
            }else{
                last=nums[i];
                count=1;
                nums[index++]=nums[i];
            }

        }
        return index;
        //没什么特别的按照题目的意思来排就好
    }
}
