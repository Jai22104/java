// DoublyLinkedList

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

/* 
// Single Node Demo
public class DoublyLinkedList{
    public static void main(String[] args) {
        Node node = new Node(10);
        System.out.println("Node data: " + node.data);
        System.out.println("Next: " + node.next);
        System.out.println("Prev: " + node.prev);
    }
}
    

// Double Node Demo

public class DoublyLinkedList {

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);

        first.next = second;
        second.prev = first;

        System.out.println("First Node: " + first.data);
        System.out.println("Second Node: " + first.next.data);
        System.out.println("Second Node's Prev: " + second.prev.data);
    }
}

*/

// Insert a node at beggining and at end

public class DoublyLinkedList {
    Node head;

    // insert node at beggining
    public void insertAtFirst(int data){
        Node newNode = new Node(data);

        if(head != null){
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // insert a node at End
    public void inserAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;

        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
    }

    // Insert a node in between 

    public void insertInBetween(int afterNode,int data){
        Node curr = head;
        while(curr != null && curr.data != afterNode){
            curr = curr.next;
        }
        // this three lines if we don't have any node means list is empty.
        Node newNode = new Node(data);
        newNode.next = curr.next;
        newNode.prev = curr;

        if(curr.next != null){
            curr.next.prev = newNode;
        }
        curr.next = newNode;
    }

    // find the middle element in linked list
    public void findMiddleNormal() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
    
        int count = 0;
        Node temp = head;
    
        while (temp != null) {
            count++;
            temp = temp.next;
        }
    
        int mid = count / 2;
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        System.out.println("Middle element is: " + temp.data);
    }
    

    // print the list
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "  <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main Function
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        list.insertAtFirst(40);
        list.inserAtEnd(50);
        list.insertInBetween(20,70);
        list.insertAtFirst(80);
        list.printList();
        list.findMiddleNormal();
    }
}