/**
 * BinaryTree class represents a binary tree and includes basic operations.
 */
class BinaryTree {

    // Fields
    private BinaryTreeNode root;    // The root node of the binary tree
    BinaryTreeNode max;             // The maximum node of the tree

    /**
     * Constructor to initialize an empty binary tree.
     */
    public BinaryTree() {

        this.max = null; // Initialize the max reference to null
        this.root = null; // Initialize the root reference to null
    }

    /**
     * Insert a new node with given data into the binary tree.
     * Time Complexity: O(log N) on average (for balanced trees), O(N) in the worst case (for skewed trees).
     */
    public void insert(int data) {

        root = insert(root, null, data);
    }

    // Helper method for recursive insertion
    private BinaryTreeNode insert(BinaryTreeNode root, int data) {

        if (root == null) {
            root = new BinaryTreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        }
        else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    private BinaryTreeNode insert(BinaryTreeNode current, BinaryTreeNode parent, int data) {

        if (current == null) {
            BinaryTreeNode newNode = new BinaryTreeNode(data);
            newNode.prev = parent; // Set the predecessor to the parent node

            if (parent != null) {
                if (parent.data > data) {
                    parent.left = newNode;
                }
                else {
                    parent.right = newNode;
                }
            }

            // Update the max node if the newly inserted node has a greater value
            if (max == null || newNode.data > max.data) {
                max = newNode;
            }

            return newNode;
        }

        if (data < current.data) {
            current.left = insert(current.left, current, data);
        }
        else if (data > current.data) {
            current.right = insert(current.right, current, data);
        }

        return current;
    }

    /**
     * Perform in-order traversal of the binary tree.
     * Time Complexity: O(N), where N is the number of nodes in the tree.
     */
    public void inOrderTraversal() {

        inOrderTraversalRecursive(root);
    }

    // Helper method for recursive in-order traversal
    private void inOrderTraversalRecursive(BinaryTreeNode root) {

        if (root != null) {
            inOrderTraversalRecursive(root.left);
            System.out.print(root.data + " ");
            inOrderTraversalRecursive(root.right);
        }
    }

    /**
     * Perform pre-order traversal of the binary tree.
     * Time Complexity: O(N), where N is the number of nodes in the tree.
     */
    public void preOrderTraversal() {

        preOrderTraversalRecursive(root);
    }

    // Helper method for recursive pre-order traversal
    private void preOrderTraversalRecursive(BinaryTreeNode root) {

        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversalRecursive(root.left);
            preOrderTraversalRecursive(root.right);
        }
    }

    /**
     * Perform post-order traversal of the binary tree.
     * Time Complexity: O(N), where N is the number of nodes in the tree.
     */
    public void postOrderTraversal() {

        postOrderTraversalRecursive(root);
    }

    // Helper method for recursive post-order traversal
    private void postOrderTraversalRecursive(BinaryTreeNode root) {

        if (root != null) {
            postOrderTraversalRecursive(root.left);
            postOrderTraversalRecursive(root.right);
            System.out.print(root.data + " ");
        }
    }

    /**
     * Search for a specific value in the binary tree.
     * Time Complexity: O(log N) on average (for balanced trees), O(N) in the worst case (for skewed trees).
     */
    public boolean search(int data) {

        return searchRecursive(root, data);
    }

    // Helper method for recursive search
    private boolean searchRecursive(BinaryTreeNode root, int data) {

        if (root == null) {
            return false;
        }

        if (data == root.data) {
            return true;
        }
        else if (data < root.data) {
            return searchRecursive(root.left, data);
        }
        else {
            return searchRecursive(root.right, data);
        }
    }

    /**
     * Print nodes in the binary tree that satisfy the condition a < x < b.
     * Time Complexity: O(N), where N is the number of nodes in the tree.
     */
    public void printNodesInRange(int a, int b) {

        System.out.print("Nodes in the range " + a + " < x < " + b + ": ");
        printNodesInRangeRecursive(root, a, b);
        System.out.println();
    }

    // Helper method for recursive printing of nodes in the given range
    private void printNodesInRangeRecursive(BinaryTreeNode root, int a, int b) {

        if (root != null) {

            if (root.data > a) {
                printNodesInRangeRecursive(root.left, a, b);
            }

            if (root.data > a && root.data < b) {
                System.out.print(root.data + " ");
            }

            if (root.data < b) {
                printNodesInRangeRecursive(root.right, a, b);
            }
        }
    }

    public void printInRangeV2(int a, int b) {

        System.out.print("Nodes in the range " + a + " < x < " + b + ": ");
        printInRangeRecV2(root, a, b);
        System.out.println();
    }

    // Helper method for recursive printing of nodes in the given range
    private void printInRangeRecV2(BinaryTreeNode root, int a, int b) {

        if (root != null) {

            if (root.data < a && root.data < b) {
                printInRangeRecV2(root.right, a, b);
            }

            if (root.data > a && root.data > b) {
                printInRangeRecV2(root.left, a, b);
            }

            /* True, if found the first common parent 'x' that satisfying the condition. The left nodes of x are
            smaller than b, and the right are bigger than a. */
            if (root.data > a && root.data < b) {

                // find the node a
                BinaryTreeNode aNode = findNode(root, a);

                aPrintBigger(aNode, a);
                // find the node b
                BinaryTreeNode bNode = findNode(root, b);
                bPrintSmaller(bNode, b);

                System.out.print(root.data + " ");
            }

        }
    }

    private void aPrintBigger(BinaryTreeNode root, int a) {

        if (root == null)
            return;

        if (root.data >= a) {

            System.out.print(root.data + " ");
            inOrderTraversalRecursive(root.right);
        }

    }

    private void bPrintSmaller(BinaryTreeNode root, int b) {

        if (root == null)
            return;

        if (root.data <= b) {

            inOrderTraversalRecursive(root.left);
            System.out.print(root.data + " ");
        }

    }

    /**
     * Find and return the node with the given value.
     * Time Complexity: O(log N) on average (for balanced trees), O(N) in the worst case (for skewed trees).
     */
    public BinaryTreeNode findNode(int v) {

        return findNode(root, v);
    }

    // Helper method for recursive search
    private BinaryTreeNode findNode(BinaryTreeNode root, int v) {

        if (root == null || root.data == v) {
            return root;
        }

        return v < root.data ? findNode(root.left, v) : findNode(root.right, v);
    }


    /**
     * Find the k-th successor of the given node pointer p.
     * Time Complexity: O(k)
     */
    public BinaryTreeNode kSuccessor(BinaryTreeNode p, int k) {

        BinaryTreeNode current = p;

        while (current != null && k > 0) {
            current = current.next;
            k--;
        }

        if (k == 0) {
            return current;
        }
        else {
            System.out.println("The node has no " + k + " consecutive members");
        }

        return null;
    }

    /**
     * Print the k maximum nodes.
     * Time Complexity: O(k)
     */
    public void printKMaxNodes(int k) {

        int[] kList = new int[k];

        BinaryTreeNode current = max;

        while (current != null && k > 0) {

            kList[k - 1] = current.data;
            current = current.prev; // Traverse in reverse order using the prev pointer
            k--;
        }

        if (k - 1 == 0) {

            System.out.println("The " + k + " maximum nodes in the tree: ");
            for (int num : kList) {
                System.out.print(num);
            }
            System.out.println();
        }
        else System.out.println("There isn't " + k + " nodes in the list");
    }

}


