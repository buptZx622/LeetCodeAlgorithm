package Medium.Tree;

import java.awt.print.PrinterGraphics;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: github
 * @description:
 * @author: ZhuangXu
 * @create: 2019-11-10 11:38
 **/


public class LeetCode503 {
    //第一眼看到思路就是用层次遍历法去做，记录每一行的第一个数
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)
            return 0;
        int first=root.val;
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for (int i = 0; i <size ; i++) {
                TreeNode poll = queue.poll();
                if(i==0){
                    first=poll.val;
                }
                if(poll.left!=null)
                    queue.add(poll.left);
                if(poll.right!=null)
                    queue.add(poll.right);
            }
        }
        return first;
    }
}
