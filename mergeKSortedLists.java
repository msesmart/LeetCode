/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.Comparator;
import java.util.PriorityQueue;
public class mergeKSortedLists{
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head=null;
        if(lists==null||lists.length<1)return head;
        if(lists.length==1)return lists[0];
        PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>(lists.length,new Comparator<ListNode>(){
         public int compare(ListNode a,ListNode b){
             if(a.val>b.val)return 1;
             else if(a.val==b.val)return 0;
             else return -1;
         }
        });
        
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null)pq.offer(lists[i]);
        }
        head=new ListNode(0);
        ListNode p=head;
        while(pq.size()>0){
            ListNode temp=pq.poll();
            p.next=temp;
            if(temp.next!=null)pq.offer(temp.next);
            p=p.next;
        }
        return head.next;
    }
}