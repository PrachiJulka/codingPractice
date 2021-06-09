package geeksForGeeks.Arrays.StackAndQueue;

import geeksForGeeks.Arrays.LinkedList1.LinkedList;

public class Stack {

    Node top;

    private class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void push(int data) {
        Node newNode;
        if (this.top == null) {
            newNode = new Node(data, null);
        } else {
            newNode = new Node(data, this.top);

        }
        this.top = newNode;
    }

    public int pop() {
        int value = 0;
        if (top != null) {
            value = top.data;
            top = top.next;
            return value;
        }
        return value;
    }


    public int peek() {
     //   System.out.println(top.data);
        if (top != null)
            return top.data;
        else
            return 0;
    }

}

