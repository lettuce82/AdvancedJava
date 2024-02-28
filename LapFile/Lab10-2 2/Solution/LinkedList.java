public class LinkedList<T> implements List<T> {
    Node headNode;

    public LinkedList() {
        this.headNode = null;
    }

    private class Node {
        private T data;
        private Node nextNode;

        Node(T data) {
            this.data = data;
            this.nextNode = null;
        }

        public T getData() {
            return this.data;
        }

        public void setNextNode(Node node) {
            this.nextNode = node;
        }

        public Node getNextNode() {
            return this.nextNode;
        }
    }

    public T remove(int index) {
        if (this.headNode == null) {
            throw new LinkedListInvaliedOperationException("Linked list is empty");
        }

        Node tempNode = this.headNode;

        if (index == 0) {
            this.headNode = tempNode.getNextNode();
        }

        for (int i = 0; tempNode != null && i < index - 1; i++) {
            tempNode = tempNode.getNextNode();
        }

        if (tempNode == null || tempNode.getNextNode() == null) {
            throw new LinkedListInvaliedOperationException("Linked list is empty");
        }

        Node nextNode = tempNode.getNextNode().getNextNode();
        tempNode.setNextNode(nextNode);

        return tempNode.getNextNode().getData();
    }

    public T get(int index) {
        Node currentNode = this.headNode;
        int count = 0;

        while(currentNode != null) {
            if (count == index) {
                return currentNode.getData();
            }
            count++;
            currentNode = currentNode.getNextNode();
        }

        throw new LinkedListInvaliedOperationException("Index out of range");
    }

    @Override
    public void add(T data) {
        Node newNode = new Node(data);

        if (headNode == null) {
            this.headNode = newNode;
            return;
        }

        Node lastNode = this.headNode;
        while (lastNode.getNextNode() != null) {
            lastNode = lastNode.getNextNode();
        }

        lastNode.setNextNode(newNode);
    }

}
