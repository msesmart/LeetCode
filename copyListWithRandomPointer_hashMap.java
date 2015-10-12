/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
import java.util.HashMap;
public class copyListWithRandomPointer_hashMap{
    public RandomListNode copyRandomList(RandomListNode head) {
		if(head==null)return null;
		HashMap<RandomListNode,RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		RandomListNode newHead = new RandomListNode(head.label);
		RandomListNode p = head;
		RandomListNode q = newHead;
		map.put(p,q);
		p = p.next;
		while(p!=null){
			RandomListNode temp = new RandomListNode(p.label);
			q.next = temp;
			q = temp;
			map.put(p,q);
			p = p.next;
		}
		p = head;
		q = newHead;
		while(p!=null){
			if(p.random!=null)q.random = map.get(p.random);
			else q.random = null;
			p = p.next;
			q = q.next;
		}
		return newHead;
	}
}