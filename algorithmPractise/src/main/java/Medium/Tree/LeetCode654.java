package main.java.Medium.Tree;

/**
 * @author zhuangxu
 * @date 2019/11/12 9:52
 */
public class LeetCode654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int indexMax=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            if(max<nums[i]){
                indexMax=i;
                max=nums[i];
            }
        }
        TreeNode root=new TreeNode(max);
        if(indexMax!=0) {
            int[] arrLeft = new int[indexMax];
            System.arraycopy(nums,0,arrLeft,0,indexMax);
            root.left=constructMaximumBinaryTree(arrLeft);
        }
        if(nums.length-1-indexMax!=0) {
            int[] arrRight = new int[nums.length - 1 - indexMax];
            System.arraycopy(nums,indexMax+1,arrRight,0,nums.length - 1 - indexMax);
            root.right=constructMaximumBinaryTree(arrRight);
        }
        return root;
    }

}
