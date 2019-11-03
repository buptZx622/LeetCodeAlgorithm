package Easy.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @program: github
 * @description: 下一个更大元素 https://leetcode-cn.com/problems/next-greater-element-i/
 * @author: ZhuangXu
 * @create: 2019-11-03 10:58
 **/


public class LeetCode496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        if(nums1.length==0)
            return res;
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        stack.push(nums2[0]);
        for (int i = 1; i <nums2.length ; i++) {
            while(!stack.isEmpty()&&nums2[i]>stack.peek()){
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }//感觉写的很糟糕，但无心改进
        for (int i = 0; i <nums1.length ; i++) {
            res[i]=map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}
