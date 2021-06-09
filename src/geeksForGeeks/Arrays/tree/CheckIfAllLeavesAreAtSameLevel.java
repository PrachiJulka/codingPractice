package geeksForGeeks.Arrays.tree;


import java.util.LinkedList;
import java.util.Queue;

public class CheckIfAllLeavesAreAtSameLevel {

    public int checkRightHeight(BinaryTree.Node node){
        int lHeight=0,rHeight=0;

        if (node==null)
            return 0;

        if (node.right!=null){
           lHeight= checkRightHeight(node.right);
        }
        if (node.left!=null){
            rHeight=checkRightHeight(node.left);
        }

        if (lHeight>rHeight)
            return lHeight+1;
        else
            return rHeight+1;

    }

    public int checkLeftHeight(BinaryTree.Node node){
        int lHeight=0,rHeight=0;
        if (node==null)
            return 0;

        if (node.right!=null){
            lHeight= checkLeftHeight(node.right);
        }
        if (node.left!=null){
            rHeight=checkLeftHeight(node.left);
        }

        if (lHeight>rHeight)
            return lHeight+1;
        else
            return rHeight+1;

    }


    public BinaryTree.Node invertTree(BinaryTree.Node root) {
        Queue<BinaryTree.Node> queue=new LinkedList<>();
        Queue<BinaryTree.Node> queueList=new LinkedList<>();
        queue.add(root);
        queueList.add(root);

        while (!queue.isEmpty()){
            BinaryTree.Node node=queue.remove();
            // System.out.println(node.value);
            if(node.right!=null){
                //     System.out.println("gyi"+node.left.value);
                queue.add(node.right);
                queueList.add(node.right);
            }
            if (node.left!=null){
                //   System.out.println("tu gyi"+node.right.value);
                queue.add(node.left);
                queueList.add(node.left);
            }
        }
        BinaryTree.Node tree=null;
        while(!queueList.isEmpty()){
            if(tree==null){
                //   temp=new Node(value,null,null);
                tree=queueList.remove();
                //System.out.println(temp.value);
            }
            else{
                Queue<BinaryTree.Node> q = new LinkedList<>();
                q.add(queueList.remove());

                while (!q.isEmpty()) {
                    tree = q.peek();
                    q.remove();

                    if (tree.left == null) {
                        tree.left = queueList.remove();
                        break;
                    } else
                        q.add(tree.left);

                    if (tree.right == null) {
                        tree.right = queueList.remove();
                        break;
                    } else
                        q.add(tree.right);
                }
            }
        }
        return tree;
    }
    void insert(BinaryTree.Node temp,BinaryTree.Node n) {
        if(temp==null){
            //   temp=new Node(value,null,null);
            temp=n;
            System.out.println(temp.value);
        }
        else{
            Queue<BinaryTree.Node> q = new LinkedList<>();
            q.add(n);

            while (!q.isEmpty()) {
                temp = q.peek();
                q.remove();

                if (temp.left == null) {
                    temp.left = n;
                    break;
                } else
                    q.add(temp.left);

                if (temp.right == null) {
                    temp.right = n;
                    break;
                } else
                    q.add(temp.right);
            }
        }
    }

    public boolean checkSameLevel(int rightHeight,int leftHeight){
        return rightHeight==leftHeight ;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.insert(binaryTree.root, 12);
        binaryTree.insert(binaryTree.root, 2);
        binaryTree.insert(binaryTree.root, 1);
        binaryTree.insert(binaryTree.root, 3);
        binaryTree.insert(binaryTree.root, 4);
        CheckIfAllLeavesAreAtSameLevel c=new CheckIfAllLeavesAreAtSameLevel();
        c.invertTree(binaryTree.root);
    }

}
