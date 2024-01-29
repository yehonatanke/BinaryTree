import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            println("\nChoose an action:");
            println("1. Insert a value");
            println("2. In-order traversal");
            println("3. Pre-order traversal");
            println("4. Post-order traversal");
            println("5. Search for a value");
            println("6. Print all values between a and b");
            println("7. Find value");
            println("8. Exit");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1 -> {
                    print("Enter a value to insert: ");
                    int valueToInsert = scanner.nextInt();
                    binaryTree.insert(valueToInsert);
                }

                case 2 -> {
                    print("In-order traversal: ");
                    binaryTree.inOrderTraversal();
                    println("");
                }

                case 3 -> {
                    print("Pre-order traversal: ");
                    binaryTree.preOrderTraversal();
                    println("");
                }

                case 4 -> {
                    print("Post-order traversal: ");
                    binaryTree.postOrderTraversal();
                    println("");
                }

                case 5 -> {
                    print("Enter a value to search: ");
                    int valueToSearch = scanner.nextInt();
                    boolean isPresent = binaryTree.search(valueToSearch);
                    println("Is " + valueToSearch + " present in the tree? " + isPresent);
                }

                case 6 -> {
                    System.out.print("Enter the lower bound (a): ");
                    int lowerBound = scanner.nextInt();

                    System.out.print("Enter the upper bound (b): ");
                    int upperBound = scanner.nextInt();

                    binaryTree.printNodesInRange(lowerBound, upperBound);
                }

                case 7 -> {
                    System.out.print("Enter the value to find: ");
                    int valueToFind = scanner.nextInt();

                    BinaryTreeNode foundNode = binaryTree.findNode(valueToFind);

                    System.out.println(foundNode != null ?
                                       "Node with value " + valueToFind + " found." :
                                       "Node with value " + valueToFind + " " + "not found.");
                }

                case 8 -> {
                    exit = true;
                    println("Exiting the program.");
                }

                default -> println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }

    public static void println(Object message) {

        System.out.println(message);
    }

    public static void print(Object message) {

        System.out.print(message);
    }

}
