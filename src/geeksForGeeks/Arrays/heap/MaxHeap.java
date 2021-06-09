package geeksForGeeks.Arrays.heap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MaxHeap {

    static List<Integer> heap = new LinkedList<>();

   public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    void delete() {
//       heap.remove(0);

        heap.remove( heapifyDown(0));
    }

    int getParent(int index) {
        if (index > 0) {
            return (index - 1) / 2;
        }
        return -1;
    }

    int getLeftChildIndex(int pIndex) {
        if (pIndex <= (heap.size() - 1)) {
            return ((pIndex * 2) + 1) < heap.size() ? ((pIndex * 2) + 1) : -1;
        }
        return -1;
    }

    int getRightChildIndex(int pIndex) {
        if (pIndex < (heap.size() - 1)) {
            return ((pIndex * 2) + 2) < heap.size() ? ((pIndex * 2) + 2) : -1;
        }
        return -1;
    }

    void heapifyUp(int index) {
        int pIndex = getParent(index);
        if (pIndex < 0) {
            return;
        }
        if (heap.get(getParent(index)) < heap.get(index)) {
            int parentValue = heap.get(getParent(index));
            heap.set(pIndex, heap.get(index));
            heap.set(index, parentValue);
            heapifyUp(pIndex);
        }
        return;
    }

    int heapifyDown(int index) {
        int leftIndex = getLeftChildIndex(index);
        int rightIndex = getRightChildIndex(index);
        if ((leftIndex == -1) && (rightIndex == -1)) {
            return index;
        }
        int leftChild = -1;
        int rightChild = -1;
        if (leftIndex != -1) {
            leftChild = heap.get(leftIndex);
        }
        if (rightIndex != -1) {
            rightChild = heap.get(rightIndex);
        }
        if (rightIndex == -1 || leftChild > rightChild) {
            heap.set(leftIndex, heap.get(index));
            heap.set(index, leftChild);
           return heapifyDown(leftIndex);
        } else if (leftIndex == -1 || leftChild < rightChild) {
            heap.set(rightIndex, heap.get(index));
            heap.set(index, rightChild);
            return heapifyDown(rightIndex);
        }
        return index;
    }


    public static void main(String[] args) {
        heap.add(30);
        heap.add(10);
        heap.add(20);
        heap.add(7);
//        heap.add(2);
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(50);
//        maxHeap.insert(100);
        heap.forEach(h -> {
            System.out.println(h);
        });
        System.out.println("after");
        heap.forEach(h -> {
            System.out.println(h);
        });
        System.out.println("Deleted");
        maxHeap.delete();
        heap.forEach(i -> {
            System.out.println(i);
        });
    }
}
