package List;
/**
 * @program: LeetCodeAlgorithm
 * @description: leetCode 21题  合并有序链表  https://leetcode-cn.com/problems/merge-two-sorted-lists/
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
        ListNode res;
        if(l1.val>=l2.val){
            res=l2;
            l2=l2.next;
        }else{
            res=l1;
            l1=l1.next;
        }
        ListNode head=res;
        while(l1!=null&&l2!=null){
            if(l1.val>=l2.val){
                res.next=l2;
                l2=l2.next;
            }else{
                res.next=l1;
                l1=l1.next;
            }
            res=res.next;
        }
        res.next=l1==null?l2:l1;
        return head;
    }
}
