public class Hello {
    public static void main(String[] args) {

    /*
     * 값타입 변수일 때 - 값 변화에 영향을 주지 않음
     * int i = 5;
     * int j = 10;
     * 
     * swap(i, j);
     * 
     * System.out.printf("i: %d, j: %d\n", i, j);
     */
        int[] array = {5, 10};
        swap(array);
        System.out.printf("i: %d, j: %d\n", array[0], array[1]);
    }

    /*
     * 값타입 변수일 때 - 값 변화에 영향을 주지 않음
     * static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }
     */

    static void swap(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}

