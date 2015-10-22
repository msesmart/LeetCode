/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class reverseNodesInKGroup{
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead=new ListNode(0);
        newHead.next=head;
        if(head==null||head.next==null||k<=1)return head;
        ListNode curHead=newHead; ListNode rightNext=null;
        int i=k-1; ListNode left=head; ListNode right=left;
        while(right!=null){
            i=k-1;
            while(i>0&&right!=null){
                right=right.next;
                i--;
            }
            if(i==0&&right!=null){
                rightNext=right.next;
                reverseList(left,right);
                curHead.next=right;
                curHead=left;
                left.next=rightNext;
                left=rightNext;
                right=left;
            }else{
                break;
            }
        }
        return newHead.next;
        
    }
    public void reverseList(ListNode left,ListNode right){
        ListNode p1=left; ListNode p2=p1.next;
        while(p2!=null){
            ListNode p2Next=p2.next;
            p2.next=p1;
            if(p2==right)break;
            p1=p2; p2=p2Next;
        }
    }
}