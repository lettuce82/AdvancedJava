public class MoreBig {


    static int max(int i, int j) {
        if (i > j) {
            return i;
        } else return j;
    }

    static int max3(int i, int j, int k) {
        if (max(i, j) > k) {
            return max(i, j);
        } else return k;
        //return max(max(i, j), k);
    }

}