package geeksForGeeks.Arrays.LinkedList;
/*
Write code to remove duplicates from an unsorted linked list.
        FOLLOW UP
        How would you solve this problem if a temporary buffer is not allowed?*/


import java.util.HashSet;

public class RemoveDups {

    public static void main(String[] args) {
       /* LinkedList linkedList = new LinkedList();
        linkedList.insertToTail(linkedList,2);
        linkedList.insertToTail(linkedList,5);
        linkedList.insertToTail(linkedList,4);
        linkedList.insertToTail(linkedList,5);
        linkedList.insertToTail(linkedList,1);
        linkedList.insertToTail(linkedList,2);

        linkedList.printList(linkedList);
        RemoveDups removeDups=new RemoveDups();
        System.out.println("----------Duplicates Removed--------------");
//        removeDups.removeList(linkedList);
        linkedList.printList(linkedList);

    }*/
/*
    void removeList(LinkedList linkedList) {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedList prev = null;
        LinkedList start = linkedList;
        while (start!= null) {
            if (hashSet.contains(start.number)) {
                prev.next = start.next;
                start.next = null;
                start=prev.next;

            } else {
                hashSet.add(start.number);
                prev = start;
                start = start.next;
            }
        }
    }*/

//}
    }
}