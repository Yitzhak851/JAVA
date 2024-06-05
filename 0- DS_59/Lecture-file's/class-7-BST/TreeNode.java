import java.util.*;

public class TreeNode {
    int key;
    TreeNode left, right;
    int subtreeSize;
    int subtreeDepthSum;

    TreeNode(int key) {
        this.key = key;
        this.left = this.right = null;
        this.subtreeSize = 1;
        this.subtreeDepthSum = 0;
    }
}

