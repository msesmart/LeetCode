import java.util.HashMap;

public class LRUCache {
    int capacity;
    HashMap<Integer,Node> map=new HashMap<Integer,Node>();
    Node head=null; Node end=null;
    public LRUCache(int capacity) {
        this.capacity=capacity;
    }
    public int get(int key) {
        if(map.containsKey(key)){
            Node temp=map.get(key);
            remove(temp);
            setHead(temp);
            return temp.value;
        }else return -1;
    }
    
    public void set(int key, int value) {
        if(map.containsKey(key)){
            Node temp=map.get(key);
            temp.value=value;
            remove(temp);
            setHead(temp);
        }else{
            Node created=new Node(key,value);
            if(map.size()>=capacity){
                map.remove(end.key);
                //(end);
                end=end.pre;
                if(end!=null)end.next=null;
                setHead(created);
            }else{
                setHead(created);
            }
            map.put(key,created);
            //System.out.println(created.value);
        }
    }
    
    public void remove(Node temp){
        if(temp.pre!=null){
            temp.pre.next=temp.next;
        }else{
            head=temp.next;
        }
        if(temp.next!=null){
            temp.next.pre=temp.pre;
        }else{
            end=temp.pre;
        }
    }
    public void setHead(Node temp){
        temp.next=head;
        temp.pre=null;
        if(head!=null)head.pre=temp;
        head=temp;
        if(end==null)end=head;
    }
    public class Node{
        int key; int value; Node pre; Node next;
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
}