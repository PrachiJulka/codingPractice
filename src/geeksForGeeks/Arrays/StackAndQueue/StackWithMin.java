package geeksForGeeks.Arrays.StackAndQueue;

public class StackWithMin {

    Node top;

    private class Node {
        int data;
        Node next;
        int minValue;

        Node(int data, Node next, int minValue) {
            this.data = data;
            this.next = next;
            this.minValue = minValue;
        }
    }

    public void push(int data) {
        Node newNode;
        if (top == null) {
            newNode = new Node(data, null, data);
        } else {
            newNode = new Node(data, top, data < top.minValue ? data : top.minValue);

        }
        top = newNode;
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
        if (top != null)
            return top.data;
        else
            return 0;
    }

    public int getMin() {
        if(top!=null)
            return top.minValue;
        else
            return 0;
    }


}
