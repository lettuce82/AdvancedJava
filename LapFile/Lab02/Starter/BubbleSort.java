public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,7,2,4};
        int[] arr2 = {4, 3, 6, 1, 7};

        //for문으로 구현
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        //while문으로 구현
        int k = 0, m = 0;

        while (k < arr2.length - 1) {
            while (m < arr.length - k - 1) {
                if (arr2[m] > arr2[m + 1]) {
                    int temp = arr2[m];
                    arr2[m] = arr2[m + 1];
                    arr2[m + 1] = temp;
                }
                m++;
            }
            m = 0;
            k++;
        }

        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}
