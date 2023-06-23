
public class Main {
    public static void main(String[] args) {
    final  RedBlackTree tree = new RedBlackTree();
    tree.add(16);
    tree.add(14);
    tree.add(12);

    System.out.println(tree.root.value);
    System.out.println(tree.root.leftChild.value);

    System.out.println(tree.root.rightChild.value);
    }

}


