public class ArrayUtill {
    public static void printArray(int[] array) {
        //for문
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static void printArray2(int[][] matrix) {
        //for문
        for (int i = 0; i < matrix.length; i++) {
            printArray(matrix[i]);
        }
    }

    public static void printArrayUsingForeach(int[] array) {
        //foreach문
        for (int i : array) {
            System.out.println(i + " ");
        }
    }

    public static void printArrayUsingForeach(int[][] matrix) {
        //foreach문
        for (int[] i : matrix) {
            printArrayUsingForeach(i);
        }
    }
    public static void main(String[] args) {
        int[][] matix = {{1,2}, {3,4,5}};
        printArray2(matix);
    }
}