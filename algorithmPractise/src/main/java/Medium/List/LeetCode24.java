package main.java.Medium.List;

/**
 * @program: github
 * @description: 两两交换链表中的节点 https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * @author: ZhuangXu
 * @create: 2019-11-03 16:25
 **/


public class LeetCode24 {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) {
            return head;
        }
        ListNode res=head.next;
        ListNode left=head.next.next;
        if(left==null){
            res.next=head;
            head.next=null;
            return res;
        }
        ListNode right=left.next;
        ListNode last=left;
        res.next=head;
        if(right==null){
            head.next=left;
            return res;
        }
        head.next=right;
        while(true){
            if(right==null) {
                last.next=left;
                return res;
            }
            ListNode tmpLeft=right.next;
            right.next=left;
            last.next=right;
            left.next=null;
            last=left;
            left=tmpLeft;
            if(left==null) {
                return res;
            }
            right=left.next;
        }
    }
}
