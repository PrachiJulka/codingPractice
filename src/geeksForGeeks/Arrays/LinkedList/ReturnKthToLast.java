package geeksForGeeks.Arrays.LinkedList;
/*
Implement an algorithm to find the kth to last element of a singly linked list.*/

import geeksForGeeks.Arrays.LinkedList1.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnKthToLast {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
       // ls.forEach();

        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(10);
        linkedList.insertFirst(34);
        linkedList.insertLast(44);
        linkedList.insertLast(20);
        linkedList.insertLast(30);
        linkedList.insertLast(40);
        linkedList.insertLast(60);
        Integer data = linkedList.findKthElement(2);
        if (data != null) {
            System.out.println("Found element " + data);
        } else {
            System.out.println("Not found");
        }


    }


}
