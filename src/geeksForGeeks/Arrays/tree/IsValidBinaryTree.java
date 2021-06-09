package geeksForGeeks.Arrays.tree;

public class IsValidBinaryTree {



    boolean isBSTUtil(BinaryTree.Node node, int min, int max)
    {
        /* an empty tree is BST */
        if (node == null)
            return true;

        /* false if this node violates the min/max constraints */
        if (node.value < min || node.value > max)
            return false;

        /* otherwise check the subtrees recursively
        tightening the min/max constraints */
        // Allow only distinct values
        return (isBSTUtil(node.left, min, node.value-1) &&
                isBSTUtil(node.right, node.value+1, max));
    }
    public boolean isValidBST(BinaryTree.Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
