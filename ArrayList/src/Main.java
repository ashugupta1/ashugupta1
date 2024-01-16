public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        arrayList.add(10);
//        arrayList.add(20);
//        arrayList.add(30);
//        arrayList.add(40);
//        arrayList.add(50);
//        System.out.println(arrayList.get(5));



        //int capacity = arr.length;
        //int key = 4;
        //int index = 1;

//        int curSize = 0;
//        for (int i = 0; i < capacity; i++) {
//            if (arr[i] != 0) {
//                curSize++;
//            }
//        }

//        System.out.println("element before deletion...");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }


//        Delete delete = new Delete();
//        int result = delete.delete( arr, arr.length,  key);
//
//        if (true) {
//            System.out.println();
//            System.out.println("element after deletion...");
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i]+" ");
//            }
//        } else {
//            System.out.println("element not deleted...");
//        }

        //System.out.println(curSize);

//        for (int i = 0; i < curSize; i++) {
//            System.out.println("arr["+i+"] "+arr[i]);
//        }
//        System.out.println("current size "+curSize);
//
//        Insert insert = new Insert();
//        int result = insert.insertElement(arr,  key,  index,  capacity, curSize );
//        System.out.println("result "+result);
//        if (true) {
//            for (int i = 0; i < result; i++) {
//                System.out.println("arr["+i+"] "+arr[i]);
//            }
//        }
//


//        int key = 3;
//        int size = arr.length;

//        Search search = new Search();
//        int result = search.searchable(arr, size, key);
//        if (true) {
//            System.out.println("key is found at index "+result);
//        } else {
//            System.out.println("key is not found ");
//        }

        int [] arr = new int[7];
        arr[ 0 ] = 1 ;
        arr[ 1 ] = 2 ;
        arr[ 2 ] = 3 ;
        arr[ 3 ] = 4 ;
        arr[ 4 ] = 5;
        arr[ 5 ] = 6 ;
        arr[ 6 ] = 7 ;

        largestElement largestElement = new largestElement();
        //int result = largestElement.largestElementIndexInArray(arr);
//        System.out.println("largest element is found at index "+result);

        secondLargest secondLargest = new secondLargest();
        int secondlarger = secondLargest.secondlargest(arr);
        //System.out.println(secondlarger);


//        arraySort arraySort = new arraySort();
//        if (arraySort.sortArray(arr)) {
//            System.out.println("array is sorted ");
//        } else {
//            System.out.println("array is not sorted ");
//        }

        System.out.println("array before reverse");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        reverseArray reverseArray = new reverseArray();
        reverseArray.reverseArray(arr);
//
//        System.out.println();
//        System.out.println("array after reverse");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(result[i]+" ");
//        }


    }
}

