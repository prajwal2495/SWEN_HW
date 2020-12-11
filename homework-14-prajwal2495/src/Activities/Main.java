package Activities;

/**
 * @author Prajwal Krishna
 * beginning of class main
 * used to create a root node and insert new nodes to the tree.
 */
public class Main {
    public static void main(String[] args) {
        BinaryNode integerTree10 = new BinaryNode(10);
        BinaryNode integerTree20 = new BinaryNode(20);
        BinaryNode integerTree30 = new BinaryNode(30);
        BinaryNode integerTree40 = new BinaryNode(40);
        BinaryNode integerTree50 = new BinaryNode(50);
        BinaryNode integerTree60 = new BinaryNode(60);
        BinaryNode integerTree70 = new BinaryNode(70);

        integerTree10.setLeftNode(integerTree20);
        integerTree10.setRightNode(integerTree30);

        integerTree20.setRightNode(integerTree40);
        integerTree20.setLeftNode(integerTree50);

        integerTree30.setLeftNode(integerTree60);
        integerTree30.setRightNode(integerTree70);


        Visitor visitor = new StringifyVisitor();
        integerTree10.infixTraversal(visitor);
        System.out.println(visitor);

        visitor = new StringifyVisitor();
        integerTree10.prefixVisitor(visitor);
        System.out.println(visitor);


        visitor = new StringifyVisitor();
        integerTree10.postFixVisitor(visitor);
        System.out.println(visitor);

    }



}
