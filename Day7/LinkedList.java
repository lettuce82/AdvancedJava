// import java.util.Iterator;

// public class LinkedList implements List, Iterator {
//     Node node;
//     int size = 0;
//     int count = 0;
    
//     public LinkedList() {
//         this.node = null;
//     }

//     @Override
//     public void add(int i) {

//         if(size == 0) {
//             this.node = new Node(i);
//             this.node.SetNextNode(null);

//         } else {

//             Node lastNode = this.node;

//             while(lastNode.nextNode != null) {
//                 lastNode = lastNode.nextNode;
//             }
    
//             Node tempNode = new Node(i);
//             tempNode.SetNextNode(null);
//             lastNode.nextNode = tempNode;

//         }
//         size++;
//     }

//     @Override
//     public int get(int idx) {
//         Node curNode = this.node;
//         for (int j = 0; j < idx; j++) {
//             curNode = curNode.nextNode;
//         }
        
//         return curNode.getData();
//     }

//     @Override
//     public void remove(int index) {
//         Node temp;
//         if (index < 0 || index >= size) {
//             throw new IndexOutOfBoundsException();
//         }

//         if (index == 0) {
//             node = node.nextNode;
//             if (size == 1) {
//                 throw new NullPointerException();
//             }
//         }
        
//         for (int i = 0; i < index - 1; i++) {
//             node = node.nextNode;
//         }
//         node.nextNode = node.nextNode.nextNode;

//         size--;
//     }

//     public void print() {
//         Node temp = this.node;
       
//         while(temp.nextNode != null ) {
//             System.out.printf("%d ",temp.getData());
//             temp = temp.nextNode; 
//             System.out.println();
//         } 
//         System.out.printf("%d ",temp.getData());
//     }

//     @Override
//     public boolean hasNext() {

//         if (size == 1) {
//             return true;
//         }

//         if (node.nextNode != null) {
//             count++;
//             return true;
//         } else {
//             return false;
//         }
//     }

//     @Override
//     public Object next() {
//         for (int i = 0; i < count; i++) {
//             node = node.nextNode;
//         }
//         return node.getData();
//     }

//     @Override
//     public Iterator iterator() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'iterator'");
//     }

//     @Override
//     public int size() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'size'");
//     }
    
// }

// class Node {
//     private int date = 0;
//     Node nextNode;

//     Node(int date) {
//         this.date = date;
//         nextNode = null;
//     }

//     public int getData() {
//         return this.date;
//     }

//     public int getValue() {
//         return this.date;
//     }
//     public void SetNextNode(Node node) {
//         this.nextNode = node;
//     }
// }