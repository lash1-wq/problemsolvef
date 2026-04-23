public class Main {

    public static void main(String[] args) {

        // create tree with a single root player
        BinarySearchTree<Player> bst = new BinarySearchTree<>(new Node<Player>(new Player()));

        // add treeSize number of players to tree
        int treeSize = 10;
        for (int i = 0; i < treeSize - 1; i++) {
            bst.add(new Player());
        }

        // print out all players in order of health value
        // hint: the bugs are not here
        bst.display();

    }

}
