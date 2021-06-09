package geeksForGeeks.Arrays.tree;

public class SumOfRootToLeaf {


    int sum(BinaryTree.Node node,String val){
        if (node==null)
            return 0;

        val=val+node.value;
        if(node.left==null && node.right==null)
            return Integer.parseInt(val,2);

        return sum(node.left,val)+sum(node.right,val);
    }




}
