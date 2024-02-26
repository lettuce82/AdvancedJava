
public class ForeachStatement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3, 2};

        //while문 사용
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i] + " ");
            i++;
        }

        //for문 사용
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        //foreach문 사용
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
