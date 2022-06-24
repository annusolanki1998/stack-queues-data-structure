package com.bridgelabz;

public class Stack {
    public static Node head; //head of linked-list and top of the stack

    // to check stack is empty or not :-
    public static boolean isEmpty() {
        return head == null;
    }

    // Push the data : -
    public static void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        // if already linked-list occurs :-
        newNode.next = head;
        head = newNode;
    }

    public void displayStack() {
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }

    }
}


