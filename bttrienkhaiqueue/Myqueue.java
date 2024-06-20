package bttrienkhaiqueue;

public class Myqueue {
    public Node front;
    public Node rear;

    public Myqueue() {
        front = null;
        rear = null;
    }

    public void enqueue(Node node) {
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
            rear.next = front;
        }
    }

    public void printQueue() {
        if (front == null) {
            System.out.println("Queue is empty;");
            return;
        }
        Node  cur = front;
        while (true) {
            System.out.print(cur.data + " ");
            cur = cur.next;
            if (cur == front) {
                break;
            }
        }
    }
}

