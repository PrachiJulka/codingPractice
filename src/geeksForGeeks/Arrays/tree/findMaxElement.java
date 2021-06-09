package geeksForGeeks.Arrays.tree;

public class findMaxElement {


    public static int findMax(BinaryTree.Node node){
        int max=0;
        int leftVal,rightVal,rootVal=0;
        if(node!=null){
            rootVal=node.value;
            leftVal=findMax(node.left);
            rightVal=findMax(node.right);
            if (leftVal>max){
                max=node.left.value;
            }
            if (rightVal>max){
                max=node.right.value;
            }
            if (rootVal>max)
                max=rootVal;
            System.out.println(max);
        }
        return max;
    }


    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.insert(binaryTree.root, 12);
        binaryTree.insert(binaryTree.root, 2);
        binaryTree.insert(binaryTree.root, 1);
        binaryTree.insert(binaryTree.root, 3);
        binaryTree.insert(binaryTree.root, 4);
        System.out.println(findMax(binaryTree.root));
    }
}
