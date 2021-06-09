package geeksForGeeks.Arrays.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversal {


    public void preOrder(BinaryTree binaryTree) {
        java.util.Stack<BinaryTree.Node> stack = new Stack<>();
        while (true) {
            while (binaryTree.root != null) {
                System.out.println(binaryTree.root.value);
                stack.push(binaryTree.root);
                binaryTree.root = binaryTree.root.left;
            }
            if (stack.empty())
                break;

            if(binaryTree.root.left==null && binaryTree.root.right==null)


            binaryTree.root = stack.pop().right;

        }
    }

    public void inOrder(BinaryTree binaryTree) {
        Stack<BinaryTree.Node> stack = new Stack<BinaryTree.Node>();
        while (true) {
            while (binaryTree.root != null) {
                stack.push(binaryTree.root);
                binaryTree.root = binaryTree.root.left;
            }
            if (stack.isEmpty())
                break;
            binaryTree.root = stack.pop();
            System.out.println(binaryTree.root.value);
            binaryTree.root = binaryTree.root.right;
            //stack.pop();
        }

    }

    void postOrder(BinaryTree binaryTree) {
        Stack<BinaryTree.Node> stack = new Stack<>();
        BinaryTree.Node previous=null;
        do{
            while (binaryTree.root != null) {
                stack.push(binaryTree.root);
                binaryTree.root = binaryTree.root.left;
            }

            while(binaryTree.root==null && !stack.isEmpty()) {
                binaryTree.root=stack.peek();
                if (binaryTree.root.right == null || binaryTree.root.right == previous) {
                    System.out.println(stack.pop().value);
                    previous = binaryTree.root;
                //    System.out.println(previous.value);
                    binaryTree.root = null;
                }
                else {
                    binaryTree.root=binaryTree.root.right;
                }
            }
        }while (!stack.isEmpty());
    }

    void levelOrder(BinaryTree binaryTree){
        Queue<BinaryTree.Node> queue=new LinkedList<>();
        queue.add(binaryTree.root);
        while (!queue.isEmpty()){
            BinaryTree.Node node=queue.remove();
            System.out.println(node.value);
            if(node.left!=null){
           //     System.out.println("gyi"+node.left.value);
                queue.add(node.left);
            }
            if (node.right!=null){
             //   System.out.println("tu gyi"+node.right.value);
                queue.add(node.right);
            }
        }
    }

    void recursive(BinaryTree binaryTree){


    }


    public static void main(String[] args) {
        Traversal traversal = new Traversal();
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(binaryTree.root, -4);
        binaryTree.insert(binaryTree.root, -10);
        binaryTree.insert(binaryTree.root, -4);

        binaryTree.insert(binaryTree.root, -4);
        binaryTree.insert(binaryTree.root, 9);
        binaryTree.insert(binaryTree.root, 1);

        binaryTree.insert(binaryTree.root, 2);
        binaryTree.insert(binaryTree.root, 0);
        binaryTree.insert(binaryTree.root, 0);

        binaryTree.insert(binaryTree.root, 8);

        binaryTree.insert(binaryTree.root, 1);
//        binaryTree.insert(binaryTree.root, 2);
//
//
//        binaryTree.insert(binaryTree.root, 1);
//        binaryTree.insert(binaryTree.root, 3);
//
//        binaryTree.insert(binaryTree.root, -1);

      //  traversal.preOrder(binaryTree);
        //System.out.println("");
        traversal.levelOrder(binaryTree);
//        SpecialOrderTraversal specialOrderTraversal=new SpecialOrderTraversal();
//        specialOrderTraversal.specialLevelOrderTraversal(binaryTree.root);

      /*  CheckIfAllLeavesAreAtSameLevel c=new CheckIfAllLeavesAreAtSameLevel();
        int lHeight=c.checkLeftHeight(binaryTree.root.left);
        int rHeight=c.checkRightHeight(binaryTree.root.right);
        System.out.println(c.checkSameLevel(lHeight,rHeight));*/
    }

}

