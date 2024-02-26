public class Stack {
    int[] element;
    int index = 0;

    public Stack(int size) {
        this.element = new int[size];
    }

    public void push(int element) {
        this.element[index++] = element;
    }

    public int pop() {
        return this.element[--index];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
