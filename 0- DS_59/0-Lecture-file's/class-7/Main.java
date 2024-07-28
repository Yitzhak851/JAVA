import java.util.*;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(1);
        tree.root.left = new TreeNode(2);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(4);
        // Update the subtree information for the entire tree
        tree.updateTree();
        // Get average depth of nodes in the subtree rooted at node 2
        double avgDepth = tree.averageDepthOfNodesInSubtree(tree.root.left);
        System.out.println(avgDepth); // Output: 0.666...
        // Get average depth of nodes in the subtree rooted at node 1
        avgDepth = tree.averageDepthOfNodesInSubtree(tree.root);
        System.out.println(avgDepth); // Output: 1.25
    }
}

// public class Main {
//     public static void main(String[] args) {
//         BinaryTree<Integer> tree = new BinaryTree<>(1);
//         tree.root.left = new TreeNode<>(2);
//         tree.root.left.left = new TreeNode<>(3);
//         tree.root.left.right = new TreeNode<>(4);

//         // Update the subtree information for the entire tree
//         tree.updateTree();

//         // Get average depth of nodes in the subtree rooted at node 2
//         double avgDepth = tree.averageDepthOfNodesInSubtree(tree.root.left);
//         System.out.println(avgDepth);  // Output: 0.666...

//         // Get average depth of nodes in the subtree rooted at node 1
//         avgDepth = tree.averageDepthOfNodesInSubtree(tree.root);
//         System.out.println(avgDepth);  // Output: 1.25
//     }
// }
