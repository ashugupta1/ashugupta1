public class largestElement {

    //{12 1 5 6 9 4 }
    int largestElementIndexInArray(int[] arr) {
        int index = 0 ;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
