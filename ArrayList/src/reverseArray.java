public class reverseArray {
    void reverseArray(int[] arr) {
        int length = arr.length-1;

        for (int i = 0; i < arr.length/2; i++) {
            int tamp = arr[i];
            arr[i] = arr[length];
            arr[length] = tamp;
            length--;
        }

        System.out.println("array after reverse");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
