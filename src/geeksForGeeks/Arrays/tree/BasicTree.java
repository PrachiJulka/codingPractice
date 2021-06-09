package geeksForGeeks.Arrays.tree;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTree {

    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }


    BinaryTree(Node root) {
        this.root = root;
    }

    BinaryTree() {
        this.root = null;
    }

    void insert(Node temp,int value) {
            if(temp==null){
                temp=new Node(value,null,null);
                this.root=temp;
            }
            else{
            Queue<Node> q = new LinkedList<>();
            q.add(temp);

            while (!q.isEmpty()) {
                temp = q.peek();
                q.remove();

                if (temp.left == null) {
                    temp.left =temp= new Node(value, null, null);
                    break;
                } else
                    q.add(temp.left);

                if (temp.right == null) {
                    temp.right =temp=new Node(value, null, null);
                    break;
                } else
                    q.add(temp.right);
            }
        }
    }
    void display(){
        System.out.println(root.value);
        while(root!=null){
            if(root.left!=null){
                System.out.println(root.left.value);
            }
            else {
                System.out.println(root.right.value);
            }

        }
    }

}


public class BasicTree {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        IsValidBinaryTree i=new IsValidBinaryTree();
        binaryTree.insert(binaryTree.root, 12);
        binaryTree.insert(binaryTree.root, 2);
        binaryTree.insert(binaryTree.root, 13);
        binaryTree.insert(binaryTree.root, 0);
        binaryTree.insert(binaryTree.root, 2);
        System.out.println(i.isValidBST(binaryTree.root));
       // binaryTree.display();
    }

}
