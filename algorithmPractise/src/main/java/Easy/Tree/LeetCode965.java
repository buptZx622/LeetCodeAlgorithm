package Easy.Tree;
/**
 * @program: github
 * @description:
 * @author: ZhuangXu
 * @create: 2019-11-11 20:25
 **/


public class LeetCode965 {
    //很常规的迭代 不多说
    public boolean isUnivalTree(TreeNode root) {
        int val=root.val;
        return isUnique(root,val);
    }
    public boolean isUnique(TreeNode root,int val){
        if(root==null)
            return true;
        if(root.val!=val)
            return false;
        return isUnique(root.left,val)&&isUnique(root.right,val);
    }
}
