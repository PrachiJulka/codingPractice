package geeksForGeeks.Arrays.tree;/*
Perfect Binary Tree Specific Level Order Traversal*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SpecialOrderTraversal {

    void leftTreeOrder(BinaryTree.Node node,Queue<BinaryTree.Node> leftQueue){
        Queue<BinaryTree.Node> arrayList=new LinkedList<>();
        arrayList.add(node);
        leftQueue.add(node);
        while (!arrayList.isEmpty()){
            BinaryTree.Node node1=arrayList.remove();
            // System.out.println(node.value);
            if(node1.left!=null){
                //     System.out.println("gyi"+node.left.value);
                arrayList.add(node1.left);
                leftQueue.add(node1.left);
            }
            if (node1.right!=null){
                //   System.out.println("tu gyi"+node.right.value);
                arrayList.add(node1.right);
                leftQueue.add(node1.right);
            }
        }

    }

    void preWithRightFirst(BinaryTree.Node node,Queue<BinaryTree.Node> rightQueue){
        Queue<BinaryTree.Node> arrayList=new LinkedList<>();
        arrayList.add(node);
        rightQueue.add(node);
        while (!arrayList.isEmpty()){
            BinaryTree.Node node1=arrayList.remove();
            // System.out.println(node.value);
            if(node1.right!=null){
                //     System.out.println("gyi"+node.left.value);
                arrayList.add(node1.right);
                rightQueue.add(node1.right);
            }
            if (node1.left!=null){
                //   System.out.println("tu gyi"+node.right.value);
                arrayList.add(node1.left);
                rightQueue.add(node1.left);
            }
        }
    }

    void specialLevelOrderTraversal(BinaryTree.Node node){

        Queue<BinaryTree.Node> leftQueue=new LinkedList<>();
        Queue<BinaryTree.Node> rightQueue=new LinkedList<>();
        System.out.println(node.value);
        leftTreeOrder(node.left,leftQueue);
        preWithRightFirst(node.right,rightQueue);
        while (true){
            if (!leftQueue.isEmpty()){
                System.out.println(leftQueue.peek().value);
                leftQueue.remove();
            }
            if (!rightQueue.isEmpty()){
                System.out.println(rightQueue.peek().value);
                rightQueue.remove();
            }
            if (leftQueue.isEmpty() && rightQueue.isEmpty())
                break;

        }

    }




}
