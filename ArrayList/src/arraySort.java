public class arraySort {
    boolean sortArray(int[] arr) {
        // 11 12 13 14 15 16 17
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
