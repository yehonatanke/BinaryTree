/**
 * BinaryTreeNode class represents a node in a binary tree.
 */
public class BinaryTreeNode {

    // Fields
    int data;               // The data stored in the node
    BinaryTreeNode left;    // Reference to the left child node
    BinaryTreeNode right;   // Reference to the right child node
    BinaryTreeNode next;    // Reference to the node's successor
    BinaryTreeNode prev;    // Reference to the node's predecessor


    /**
     * Constructor to initialize the node with given data.
     *
     * @param data The data to be stored in the node.
     */
    public BinaryTreeNode(int data) {

        this.data = data;
        this.left = null;
        this.right = null;
        this.next = null;
        this.prev = null;
    }

}
