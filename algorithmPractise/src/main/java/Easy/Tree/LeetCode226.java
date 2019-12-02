package main.java.Easy.Tree;
import main.java.Easy.Tree.*
/**
 * @author zhuangxu
 * @date 2019/12/2 10:08
 */
public class LeetCode226{
    public TreeNode invertTree(TreeNode root) {
        if(root==null) {
            return null;
        }
        if(root.left==null&&root.right==null) {
            return root;
        }
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
