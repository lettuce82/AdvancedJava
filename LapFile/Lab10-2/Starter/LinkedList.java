public class LinkedList implements List {
    Node headNode;

    public LinkedList() {
        this.headNode = null;
    }

    private class Node {
        private int data;
        private Node nextNode;

        Node(int data) {
            this.data = data;
            this.nextNode = null;
        }

        public int getData() {
            return this.data;
        }

        public void setNextNode(Node node) {
            this.nextNode = node;
        }

        public Node getNextNode() {
            return this.nextNode;
        }
    }

    @Override
    public void add(int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }
}
