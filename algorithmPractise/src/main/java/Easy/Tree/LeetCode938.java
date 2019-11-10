package Easy.Tree;
/**
 * @program: github
 * @description:
 * @author: ZhuangXu
 * @create: 2019-11-10 13:01
 **/


public class LeetCode938 {
    //也可以不用递归，不过感觉很多有关于的树的算法题都可以用递归去解决，这道题最简单的办法也可以遍历，然后累和L与R之间的值
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null)
            return 0;
        if(root.val<L){
            return rangeSumBST(root.right,L,R);
        }else if(root.val>R){
            return rangeSumBST(root.left,L,R);
        }
        return root.val+rangeSumBST(root.left,L,R)+rangeSumBST(root.right,L,R);
    }
}
