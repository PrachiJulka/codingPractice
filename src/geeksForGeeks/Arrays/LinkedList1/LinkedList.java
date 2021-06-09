package geeksForGeeks.Arrays.LinkedList1;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;


    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public class Node {
        public int data;
        public Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data, this.head);
        this.head = newNode;
        if (this.size == 0) {
            this.tail = newNode;
        }
        this.size++;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data, null);
        if (this.size == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }

    public void printList() {
        if (this.size != 0) {
            while (this.head != this.tail.next) {
                System.out.println(this.head.data);
                this.head = this.head.next;
            }
        } else {
            System.out.println("No Element to display");
        }
    }

    public void insertAtMiddle(int data, int value) {
        Node temp = this.head;
        Node next;
        Node newNode;
        while (temp != null) {
            if (temp.data == data) {
                next = temp.next;
                newNode = new Node(value, next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
    }


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int findKthElement(int position) {
        int loopLimit=(this.size-position)+1;
        /*SinglyLinkedListNode fast=head;
        SinglyLinkedListNode slow=head;
        int p=0;
        while(fast.next!=null){
            fast=fast.next;
            p++;
            if(p>positionFromTail){
                slow=slow.next;
            }
        }

        return slow.data;*/
        return 0;
    }



    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(10);
        linkedList.insertFirst(0);
        linkedList.insertLast(100);
        linkedList.insertLast(20);
        linkedList.insertLast(30);
        linkedList.insertLast(40);
        linkedList.insertLast(60);
        linkedList.insertAtMiddle(10, 50);
        linkedList.printList();

    }


}
