public class secondLargest {
    int secondlargest(int[] arr) {

        int larger = arr[0];
        int secondlarger = -1;
        for (int i = 1; i < arr.length; i++) {
            if (larger < arr[i]) {
                secondlarger = larger;
                larger = arr[i];
            } if (arr[i] != larger && secondlarger < arr[i]) {
                secondlarger = arr[i];
            }
        }
        return secondlarger;
    }

}
