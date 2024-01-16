public class Delete {
    int delete(int[] arr, int length, int key) {
        int store = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == key) {
                store = i;
                System.out.println("key found");
                break;
            }
        }

        for (int j = store; j < length-1; j++) {
                //System.out.println(j);
                arr[j] = arr[j+1];
        }
        return (length-1);
    }
}
