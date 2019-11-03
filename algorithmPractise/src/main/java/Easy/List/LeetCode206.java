package Easy.List;
/**
 * @program: github
 * @description: LeetCode206 反转链表  https://leetcode-cn.com/problems/reverse-linked-list/submissions/
 * @author: ZhuangXu
 * @create: 2019-11-03 01:28
 **/


public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        ListNode last=null,next=null;
        last=head;
        head=head.next;
        last.next=null;// 不设置为空 会报内存溢出，环形链表？
        while(head!=null){
            next=head.next;
            head.next=last;
            last=head;
            head=next;
        }
        return last;
    }
}
