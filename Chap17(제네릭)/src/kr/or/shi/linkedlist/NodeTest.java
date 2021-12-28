package kr.or.shi.linkedlist;

public class NodeTest {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);

        node1.next = node2;
    }
}
