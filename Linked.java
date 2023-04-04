

class Node{int data;Node next=null;Node(int data){this.data=data;}}

public class Linked{

    static Node res;

    static void reverseLL(Node head){
        if(head==null) return;
        reverseLL(head.next);
        System.out.print(head.data+" ");
    }

    static Node reverseLinkedList(Node head){

        Node prev=null;

        while(head!=null){
            Node temp=head.next;        
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;

    }

    static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        reverseLL(head);
        System.out.println();
        head=reverseLinkedList(head);
        printLL(head);

    }
}