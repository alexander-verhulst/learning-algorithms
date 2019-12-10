package algo.selectionsort;

public class App {

    public static void main(String[] args) {

        int [] myArray = selectionSort(new int[] {9, 3, 4, 56, 34, 76,23,11,5});

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }


    }

    //returns int [] and accepts int []
    public static int[] selectionSort (int [] a) {

        for (int i = 0; i < a.length; i ++) {
            int minimum = i; //outer loop
            for (int j = i + 1; j < a.length; j ++ ) {
                if (a[j] < a[minimum]) { //if we find smaller value
                    minimum = j;
                }
            }
            int temp = a[i];
            a[i] = a[minimum];
            a[minimum] = temp;
        }
        return a;
    }


}
