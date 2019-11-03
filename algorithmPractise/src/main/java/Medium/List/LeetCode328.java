package Medium.List;
/**
 * @program: github
 * @description: 奇偶链表  https://leetcode-cn.com/problems/odd-even-linked-list/
 * @author: ZhuangXu
 * @create: 2019-11-03 10:09
 **/


public class LeetCode328 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode ji=head;
        ListNode ou=head.next;
        ListNode ouHead=ou;
        while(ji.next!=null&&ou.next!=null){
            ji.next=ou.next;
            ji=ji.next;
            ou.next=ji.next;
            ou=ou.next;
        }
        ji.next=ouHead;
        return head;
    }
}
