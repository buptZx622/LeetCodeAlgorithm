package Easy.Tree;
/**
 * @program: github
 * @description:
 * @author: ZhuangXu
 * @create: 2019-11-19 10:05
 **/


public class LeetCode617 {
    // 递归去做，很容易。
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if(t1==null)
                return t2;
            if(t2==null)
                return t1;
            TreeNode node=new TreeNode(t1.val+t2.val);
            node.left=mergeTrees(t1.left,t2.left);
            node.right=mergeTrees(t1.right,t2.right);
            return node;
    }
}
