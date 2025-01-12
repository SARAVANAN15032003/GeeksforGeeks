

/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        // Your code here.
        Node temp;
        temp=head;
        int h=count(head)/2;
        for(int i=1;i<=h;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    public int count(Node head){
        int h=0;
        Node temp;
        temp=head;
        while(temp!=null){
            h++;
            temp=temp.next;
        }
        return h;
    }
}
