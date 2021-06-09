package geeksForGeeks.Arrays.tree;

import java.util.*;

public class ViewOfBinaryTree {
    static int maxLevel = 0;

    static void leftView(BinaryTree.Node node, int level) {

        if (node == null) {
            return;
        }

        if (maxLevel < level) {
            maxLevel = level;
            System.out.println(node.value);
        }
        if (node.left != null)
            leftView(node.left, level + 1);
        if (node.right != null)
            leftView(node.right, level + 1);

    }

    static void rightView(BinaryTree.Node node, int level) {
        if (node == null)
            return;
        if (maxLevel < level) {
            System.out.println(node.value);
            maxLevel = level;
        }
        if (node.right != null)
            rightView(node.right, level + 1);
        if (node.left != null)
            rightView(node.left, level + 1);
    }

    static void leftViewWithoutRecursion(BinaryTree.Node node) {
        int length = 1;
        int maxlength;
        Queue<BinaryTree.Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            maxlength = 0;
            BinaryTree.Node node1 = queue.peek();
            System.out.println(node1.value);
            for (int i = 0; i < length; i++) {
                if (node1.left != null) {
                    queue.add(node1.left);
                    maxlength++;
                }
                if (node1.right != null) {
                    queue.add(node1.right);
                    maxlength++;
                }

                queue.remove();
            }
            length = maxlength;
        }

    }

    static void topViewWithRecursion(BinaryTree.Node node, int hd, int length, Map<Integer, value> values) {
        if(node==null)
            return;

            if (values.get(hd)==null)
            {
                value value=new value(node.value,length);
                values.put(hd,value);
            }
            else if (values.get(hd)!=null && values.get(hd).level>length){
                value value=new value(node.value,length);
                values.put(hd,value);
                }
              //  System.out.println(values.get(hd).get(node.value));

        if (node.left!=null)
        topViewWithRecursion(node.left,hd-1,length+1,values);
        if (node.right!=null)
        topViewWithRecursion(node.right,hd+1,length+1,values);

    }

    static void bottomViewWithRecurssion(BinaryTree.Node node, int hd, int length, Map<Integer, value> values) {
        if (node == null)
            return;
        if (values.get(hd) == null) {
            value value = new value(node.value, length);
            values.put(hd, value);
        } else if (values.get(hd) != null && values.get(hd).level <= length) {
            value value = new value(node.value, length);
            values.put(hd, value);
        }
        if (node.left != null) {
            bottomViewWithRecurssion(node.left, hd - 1, length + 1, values);

        }
        if (node.right != null) {
            bottomViewWithRecurssion(node.right, hd + 1, length + 1, values);
        }

    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(binaryTree.root, 12);
        binaryTree.insert(binaryTree.root, 2);
        binaryTree.insert(binaryTree.root, 1);
        binaryTree.insert(binaryTree.root, 3);
        binaryTree.insert(binaryTree.root, 4);

        binaryTree.insert(binaryTree.root, 5);
        binaryTree.insert(binaryTree.root, 6);

        binaryTree.insert(binaryTree.root, 8);
        // leftView(binaryTree.root, 1);
        //rightView(binaryTree.root,1);
        //leftViewWithoutRecursion(binaryTree.root);

        Map<Integer,value> map=new HashMap<>();
      //  topViewWithRecursion(binaryTree.root,0,0,map);
        bottomViewWithRecurssion(binaryTree.root,0,0,map);
        map.forEach((k,v)->{
            System.out.println(k+" "+v.val);
        });
    }


    static class value{
        int val;
        int level;

        public value(int val, int level) {
            this.val = val;
            this.level = level;
        }
    }

}
