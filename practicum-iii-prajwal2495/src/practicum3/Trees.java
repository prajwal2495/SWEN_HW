package practicum3;

import util.BinaryNode;
import util.SortUtilities;
import util.StringifyVisitor;
import util.Visitor;

import java.util.Random;
import java.util.Scanner;

public class Trees {

    public static BinaryNode<String> treeTraverse(){
        BinaryNode<String> B = new BinaryNode<>("B");
        BinaryNode<String> U = new BinaryNode<>("U");
        BinaryNode<String> T = new BinaryNode<>("T");
        BinaryNode<String> T2 = new BinaryNode<>("T");
        BinaryNode<String> E = new BinaryNode<>("E");
        BinaryNode<String> R = new BinaryNode<>("R");
        BinaryNode<String> C = new BinaryNode<>("C");
        BinaryNode<String> U2 = new BinaryNode<>("U");
        BinaryNode<String> P = new BinaryNode<>("P");
        R.setLeft(T);
        R.setRight(U2);
        T.setLeft(U);
        T.setRight(E);
        U.setLeft(B);
        U.setRight(T2);
        U2.setLeft(C);
        U2.setRight(P);

        return R;
    }

    public static void insertNumber(int n, int key){
        Random random = new Random();
        if(n < 0|| n > 100)
            return;

        BinaryNode<Integer> binaryNode = new BinaryNode<>(key);
        int node = random.nextInt(n);

        binaryNode.binaryInsert(node);
    }

    public static boolean findNumber(int key){
        BinaryNode<Integer> binaryNode = new BinaryNode<>(key);
        return binaryNode.search(key);
    }



    public static void main(String[] args) {
        Visitor visitor = new StringifyVisitor();


        BinaryNode<String> binaryNode = treeTraverse();
        binaryNode.infixTraversal(visitor);

        System.out.println(visitor);

        insertNumber(100, 0);

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = scan.nextInt();

        if(findNumber(num)){
            System.out.println("target was found");
        }else{
            System.out.println("target was not found");
        }
    }
}
