<div align="center">
  <img src="https://img.shields.io/badge/language-Java-red.svg">
  <img src="https://custom-icon-badges.demolab.com/github/license/denvercoder1/custom-icon-badges?logo=law">
</div>

# Binary Tree in Java

## Overview
This Java program implements basic operations on a binary tree, including insertion, traversals (in-order, pre-order, post-order), search, printing nodes in a given range, finding nodes, and more.

## Table of Contents
1. [General Information](#general-information)
2. [Program Structure](#program-structure)
    - [Main Class](#main-class)
    - [BinaryTree Class](#binarytree-class)
    - [BinaryTreeNode Class](#binarytreenode-class)
3. [Usage](#usage)
4. [License](#license)

### General Information
The program provides a command-line interface for interacting with a binary tree. Users can perform various operations such as inserting values, traversing the tree, searching for values, printing nodes in a range, finding specific nodes, and more.

## Program Structure
### Main Class
The `Main` class serves as the entry point for the program. It provides a menu-driven interface for users to choose different actions to perform on the binary tree.
#### Actions
- **Insert a value:** Insert a new value into the binary tree.
- **In-order traversal:** Display the elements of the tree in in-order traversal.
- **Pre-order traversal:** Display the elements of the tree in pre-order traversal.
- **Post-order traversal:** Display the elements of the tree in post-order traversal.
- **Search for a value:** Check if a specific value is present in the tree.
- **Print all values between a and b:** Display values within a specified range.
- **Find value:** Check if a specific value is present in the tree and print information.
- **Exit:** Terminate the program.

### BinaryTree Class
The `BinaryTree` class represents a binary tree and includes methods for insertion, traversals, search, printing nodes in a range, finding nodes, and more. It also maintains a reference to the maximum node in the tree.
#### Key Methods
- `insert(int data)`: Insert a new node with the given data into the binary tree.
- `inOrderTraversal()`: Perform in-order traversal of the binary tree.
- `preOrderTraversal()`: Perform pre-order traversal of the binary tree.
- `postOrderTraversal()`: Perform post-order traversal of the binary tree.
- `search(int data)`: Search for a specific value in the binary tree.
- `printNodesInRange(int a, int b)`: Print nodes within the specified range.

#### Additional Features
- `findNode(int v)`: Find and return the node with the given value.
- `kSuccessor(BinaryTreeNode p, int k)`: Find the k-th successor of a given node.
- `printKMaxNodes(int k)`: Print the k maximum nodes in the tree.

### BinaryTreeNode Class
The `BinaryTreeNode` class represents a node in the binary tree. Each node contains data, left and right children, and predecessor and successor nodes.

## BinaryTreeNode Class
The `BinaryTreeNode` class represents a node in the binary tree.

#### Fields
- `data`: The data stored in the node.
- `left`: Reference to the left child node.
- `right`: Reference to the right child node.
- `next`: Reference to the node's successor.
- `prev`: Reference to the node's predecessor.

#### Constructor
- `BinaryTreeNode(int data)`: Initialize the node with the given data.

## Usage
1. Clone the repository.
2. Compile and run `Main.java`.
3. Follow the on-screen menu to perform various operations on the binary tree.

## License
This program is open-source and released under the [MIT License](https://github.com/yehonatanke/BinaryTree/blob/main/LICENSE).

## Author

yehonataKe
