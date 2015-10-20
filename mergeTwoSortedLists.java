/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class mergeTwoSortedLists{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode head=null;
        ListNode pp,p1,p2;
        if(l1.val<l2.val){
            head=l1; pp=head; p1=pp.next; p2=l2; 
        }else{
            head=l2; pp=head; p1=l1; p2=l2.next; head.next=l1;
        }
        
        while(p1!=null&&p2!=null){
            if(p2.val<p1.val){
                pp.next=p2;
                pp=pp.next;
                ListNode temp=p2.next;
                p2.next=p1;
                p2=temp;
                
            }else{
                p1=p1.next;
                pp=pp.next;
            }
        }
        if(p2!=null)pp.next=p2;
        return head;
    }
}