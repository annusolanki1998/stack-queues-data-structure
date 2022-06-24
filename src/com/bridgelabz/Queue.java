package com.bridgelabz;

public class Queue {
    //Initialize head(front) and tail(rear) are null
    static Node front = null;
    static Node rear = null;

    public static boolean isEmpty() {
        return front == null & rear == null;
    }

    //enqueue

    public static void enqueue(int data) {
        Node newNode = new Node(data);
        // If linked-list is empty
        if (rear == null) {
            rear = front = newNode;
            return;
        }

        // if element are in linked-list
        rear.next = newNode;
        rear = newNode;

    }

    public void displayQueue() {
        Node currentNode = front;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    // dequeue
    public static int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int head = front.data;
        // If only single element in queue
        if (front == rear) {
            rear = null;
        }
        front = front.next;
        return head;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return -1;
        }
        return front.data;
    }


    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("Elements added to the queue are :");
        queue.enqueue(70);
        queue.enqueue(30);
        queue.enqueue(56);
        queue.displayQueue();
        System.out.println();

        while (!queue.isEmpty()) {
            System.out.println("Elements at peek in the queue is " + queue.peek());
            System.out.println("Remove element from queue is " + queue.dequeue());
        }
    }
}


