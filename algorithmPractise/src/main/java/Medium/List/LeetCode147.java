package main.java.Medium.List;

/**
 * @author zhuangxu
 * @date 2019/11/18 14:05
 */
public class LeetCode147 {
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode res=null;
        ListNode
        while(head!=null){
            insertSort(head,head.next);

        }
        return res;
    }
    public ListNode insertSort(ListNode head,ListNode newNode){
        if(head==null)
            return newNode;
        if(head.val>newNode.val){
            newNode.next=head;
            return newNode;
        }
        ListNode res=head;
        ListNode last=head;
        while(head!=null&&head.val<newNode.val){
            last=head;
            head=head.next;
        }
        last.next=newNode;
        newNode.next=head;
        return res;
    }
}
