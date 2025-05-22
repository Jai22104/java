// Singly LinkedList


// Insert a node at biggining and at end 

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class InsertAtFirst {
    Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        // newNode.next = head;
        // head = newNode;
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    /* 
    // find middle node in linked list
    public void findMiddleNormal() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
    
        int count = 0;
        Node curr = head;
    
        while (curr != null) {
            count++;
            curr = curr.next;
        }
    
        int mid = count / 2;
        curr = head;
        for (int i = 0; i < mid; i++) {
            curr = curr.next;
        }
        System.out.println("Middle element is: " + curr.data);
    }
    */

    // optimized approach tortoise and hare algo (also known as Floyd's Linked List Cycle Finding Algorithm)
    public void findNormal(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element is: " + slow.data);

    }

    // to detect cycle in Linked List (known as Floyd's Linked List Cycle Finding Algorithm)
    public boolean detectCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;

    }

    // print the list
    public void print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        InsertAtFirst list = new InsertAtFirst();
        list.insert(1);
        list.insert(3);
        list.insert(2);
        list.insert(5);
        list.insert(6);
        list.print();
        // list.findMiddleNormal();
        list.findNormal();
        
    }
}
