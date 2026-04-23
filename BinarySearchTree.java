public class BinarySearchTree<T extends Comparable<T>> {

    /**
     * The root node of the binary search tree.
     * Previous node is the left child, next node is the right child.
     */
    private Node<T> root;

    /**
     * Construct a new binary search tree with no root node.
     */
    public BinarySearchTree() {
        this.root = null;
    }

    /**
     * Construct a new binary search tree with the given root node.
     *
     * @param root the root of the binary search tree.
     */
    public BinarySearchTree(Node<T> root) {
        this.root = root;
    }

    /**
     * Add an element to the binary search tree.
     * Values smaller than or equal to the root will be added to the left/previous side.
     * Values larger than the root will be added to the right/next side.
     *
     * @param element the value of the new node.
     */
    public void add(T element) {

        // create a node from the element
        Node<T> newNode = new Node<T>(element);

        // if the root is null
        // make this new node the root
        if (this.root == null) {
            this.root = newNode;
            return;
        }

        Node<T> currNode = this.root;
        Node<T> leafNode = this.root;
        // search through tree
        while (currNode != null) {
            // save the current node as leaf,
            // in case the next iteration confirms this as a leaf
            leafNode = currNode;
            // select next branch of tree to navigate to
            // smaller value should go to left/prev
            if (element.compareTo(currNode.getElement()) >= 0) {
                currNode = currNode.getPrev();
            } else {
                currNode = currNode.getNext();
            }
        }

        // compare sizes of element and leaf node's element
        // and set the new node to the appropriate side of the leaf node
        // smaller value should go to left/prev
        if (element.compareTo(leafNode.getElement()) >= 0) {
            leafNode.setPrev(newNode);
        } else {
            leafNode.setNext(newNode);
        }

    }

    /**
     * Print all values within the tree in-order.
     * The entire left side of the tree is printed, then the root, then the entire right side.
     */
    public void display() {

        if (this.root == null)
            return;

        display(this.root.getPrev());
        System.out.println("visiting root: " + this.root.getElement());
        display(this.root.getNext());

    }

    /**
     * Print all values within the tree from a given node in-order.
     * The entire left side of the tree is printed, then the root, then the entire right side.
     *
     * Helper for public display() method.
     *
     * @param node the node to start traversing through.
     */
    private void display(Node<T> node) {

        if (node == null)
            return;

        display(node.getPrev());
        System.out.println("visiting: " + node.getElement());
        display(node.getNext());

    }

}
