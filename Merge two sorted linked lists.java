

/*
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        List<Integer> list=new ArrayList<>();
        Node temp=head1;
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        temp=head2;
        while(temp!=null){
            list.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(list);
        Node head=null;
        for(int i:list){
            Node newnode=new Node(i);
            if(head==null)
            head=newnode;
            else{
            temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
                temp.next=newnode;
            }
        }
        return head;
    }
}
