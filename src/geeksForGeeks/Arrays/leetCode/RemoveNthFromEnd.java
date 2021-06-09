package geeksForGeeks.Arrays.leetCode;

import geeksForGeeks.Arrays.LinkedList1.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveNthFromEnd {

    public LinkedList.Node removeNthFromEnd(LinkedList.Node head, int n) {

        LinkedList.Node dummy=head;
        int size=0;
        int removeNode=n;
        while(dummy!=null){
            size+=1;
            dummy=dummy.next;
        }
        dummy=head;
        // System.out.println(dummy.val);
        removeNode=(size-n);
        while(head!=null)
        {
            if(removeNode==0 && head.next!=null)
            {
                head.data=head.next.data;
                head.next=head.next.next;
                break;
            }
            else if(removeNode==0 && head.next==null){
                head=null;
                break;
            }
            removeNode--;
            head=head.next;
        }
        return dummy;
    }

    public static void main(String[] args) {
        Set s=new HashSet();
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(10);
        linkedList.insertFirst(0);
        linkedList.insertLast(100);
        linkedList.insertLast(20);
        linkedList.insertLast(30);
        linkedList.insertLast(40);
        linkedList.insertLast(60);
        System.out.println(new RemoveNthFromEnd().removeNthFromEnd(linkedList.getHead(),2));
    }
}
