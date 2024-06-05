import java.util.*;

public class BinaryTree {
    TreeNode root;

    public BinaryTree(int key) {
        root = new TreeNode(key);
    }

    // Recursive function to update the subtree information
    private int[] updateNodeInfo(TreeNode node) {
        if (node == null) {
            return new int[] { 0, 0 }; // size, depth_sum
        }
        int[] leftInfo = updateNodeInfo(node.left);
        int[] rightInfo = updateNodeInfo(node.right);
        node.subtreeSize = 1 + leftInfo[0] + rightInfo[0];
        node.subtreeDepthSum = leftInfo[1] + leftInfo[0] + rightInfo[1] + rightInfo[0];
        return new int[] { node.subtreeSize, node.subtreeDepthSum };
    }

    // Function to calculate the average depth of nodes in the subtree rooted at the
    // given node
    public double averageDepthOfNodesInSubtree(TreeNode node) {
        if (node == null || node.subtreeSize == 0) {
            return 0;
        }
        return (double) node.subtreeDepthSum / node.subtreeSize;
    }

    // Utility function to update the subtree information for the entire tree
    public void updateTree() {
        updateNodeInfo(root);
    }
}
