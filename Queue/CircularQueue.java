package Queue;

public class CircularQueue {
    int[] data;     
    int front;      
    int rear;       
    int size;       
    int cap;

    public CircularQueue(int k) {
        data = new int [k];
        int front = 0;
        int rear = 0;
        int size = 0;
        cap = k;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) return false;
        data[rear] = value;
        rear = (rear + 1) % cap;  // move rear to next index (circularly)
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) return false;
        front = (front + 1) % cap;  // move front to next index
        size--;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) return -1;
        return data[front];
    }
    
    public int Rear() {
        if (isEmpty()) return -1;
        // (rear - 1 + capacity) % capacity gives the last valid index
        return data[(rear - 1 + cap) % cap];
        
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == cap;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        System.out.println(cq.enQueue(10)); 
        System.out.println(cq.enQueue(20)); 
        System.out.println(cq.enQueue(30)); 
        System.out.println(cq.enQueue(40)); 

        System.out.println("Front: " + cq.Front()); 
    
        System.out.println("Rear: " + cq.Rear());   

        cq.deQueue(); 
        System.out.println("Front after deQueue: " + cq.Front());

        cq.enQueue(40); 
        System.out.println("Rear after enQueue(40): " + cq.Rear());
    }
}
