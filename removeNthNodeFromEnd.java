/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class removeNthNodeFromEnd{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||n==0)return null;
        if(head.next==null)return null;
        ListNode p1=head;
        ListNode p2=head;
        int i=n;
        while(i>0&&p2.next!=null){
            p2=p2.next;
            i--;
        }
        if(i==1){head=head.next; return head;}
        while(p2.next!=null){
            p2=p2.next;
            p1=p1.next;
        }
        ListNode temp=p1.next;
        p1.next=temp.next;
        return head;
    }
}