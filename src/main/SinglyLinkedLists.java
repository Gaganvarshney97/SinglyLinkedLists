package main;


public class SinglyLinkedLists{
    private Node head= null;
    private int size=0;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next= null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedLists linkedLists = new SinglyLinkedLists();
    }
}
