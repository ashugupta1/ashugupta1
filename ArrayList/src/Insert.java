public class Insert {
    int insertElement(int[] arr, int key, int index, int size, int currSize) {

        if (arr.length == currSize) {
            return currSize;
        }
        for (int i = currSize-1; i >= index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = key;
        return currSize+1;
    }
}
