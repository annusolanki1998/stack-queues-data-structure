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

    public void displayQueue(){
        Node currentNode = rear;
        while (currentNode!= null){
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("Elements added to the queue are :");
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.displayQueue();
    }
}


