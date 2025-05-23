package Queue;

// Implementing Queue using Array

public class Queue {
    int front, rear;
    int size;
    int [] arr;

    // Constructor
    Queue(int cap){
        size = cap;
        arr = new int[size];
        front = rear = -1;      //Empty state
    }

    // Enqueue operation
    public void enqueue(int val){
        if(rear == size - 1){
            System.out.println("Queue is full");
        }
        else{
            if(front == -1) front = 0;     //First element enqueued
            arr[++rear] = val;
            System.out.println(val + "enqueued");
        }
    }

    // Dequeue operation
    public void dequeue(){
        if(front == -1 || front > rear){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(arr[front]  + "dequeued");
            front++;

            if(front > rear) front = rear = -1;
        }
    }

    // peek operation
    public void peek(){
        if(front == 0 || front > rear){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Front element: " + arr[front]);
        }
    }

    // Check if queue is empty
    public boolean isEmpty(){
        return front == -1;
    }

    // Display Queue
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            System.out.println("Queue Elemet: ");
            for(int i = front; i <= rear; i++){
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        q.dequeue();
        q.peek();
        q.display();

        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}