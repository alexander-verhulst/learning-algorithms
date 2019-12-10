package algo.binarysearch;

public class App {

    public static void main(String[] args) {

       System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,19}, 12)); //returns 6, for 6 index position

        System.out.println(binarySearch(new int[] {1,2,3,4,7,9,12,19}, 39)); //returns -1

        System.out.println();
        //array MUST BE SORTED for binary search
        System.out.println(recursiveBinarySearch(new int[] {1,2,3,4,7,9,12,18},0, 7,9)); //returns 5 index



    }

    //static method outside main so we don't have to define it when we call it
    //return position when we find the desired value. following pseudo code
    public static int binarySearch(int [] a, int x) {
        //initialize variables
        int p = 0; //beginning of array
        int r = a.length - 1; //last position of array

        //we still in the range and want to find midpoint
        while (p <= r) {
            int q = (p + r) / 2; //calculate the middle of the array
            //check certain conditions
            if (x < a[q]) r = q - 1; //if x is less than the middle point, we move the end of the array r
            else if (x > a[q]) p = q + 1; //if x is greater than the middle point, we move the beggining
            else return q; //this has to be the value!
        }
        return -1; //if we couldnt find the value
    }

    //a is array, p is first index [0], r is last index, x is what we lookin for
    public static int recursiveBinarySearch(int [] a, int p, int r, int x) {
        System.out.println(" [ " + p + "..." + r + " ] ");
        //check if p is greater than r
        if ( p > r) { //that means we scanned entire array and didn't find value
            return -1;
        } else {
            //calculate midpoint
            int q = (p + r) / 2;
            if (a[q] == x) {
                return q;
            } else if (a[q] > x) { //if q is greater than x that means that answer is on the left
                return recursiveBinarySearch(a, p, q-1, x); //only searching first half
            } else { //value is on right half
                return recursiveBinarySearch(a, q + 1, r, x);
            }
        }

    }


}
