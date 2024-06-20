package bttrienkhaiqueue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {

        Myqueue myqueue = new Myqueue();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        myqueue.enqueue(node1);
        myqueue.enqueue(node2);
        myqueue.enqueue(node3);
        myqueue.printQueue();


    }}