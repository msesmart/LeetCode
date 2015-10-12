class Node{
    int val;
    Node next;
    Node(int x){
        val=x;
        next=null;
    }
}
public class MinStack {
    Node head=null;
    int min=Integer.MAX_VALUE;
    public void push(int x) {
        Node newNode=new Node(x);
        newNode.next=head;
        head=newNode;
        min=Math.min(min,x);
    }

    public void pop() {
        if(head==null)return;
        head=head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return min;
    }
}