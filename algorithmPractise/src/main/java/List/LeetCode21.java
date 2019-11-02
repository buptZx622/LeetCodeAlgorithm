package List;
/**
 * @program: LeetCodeAlgorithm
 * @description: leetCode 21题  https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @author: ZhuangXu
 * @create: 2019-11-02 23:24
 **/

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }


public class LeetCode21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode res=l1.val>=l2.val?l2:l1;

        return res;
    }
}
