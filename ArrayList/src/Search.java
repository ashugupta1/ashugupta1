public class Search {
  int searchable(int[] arr, int size, int key) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == key) {
            return i;
        }
    }
      return -1;
  }
}
