/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0); ListNode p3=head;
		ListNode p1=l1; ListNode p2=l2;
		int extra=0;
		while(p1!=null||p2!=null){
			if(p1!=null){extra+=p1.val;p1=p1.next;}
			if(p2!=null){extra+=p2.val;p2=p2.next;}
			p3.next=new ListNode(extra%10);
			p3=p3.next;
			extra=extra/10;
		}
		if(extra!=0)p3.next=new ListNode(extra);
		return head.next;
    }
}