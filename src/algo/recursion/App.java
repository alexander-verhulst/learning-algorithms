package algo.recursion;

public class App {

    public static void main(String[] args) {
        reduceByOne(10);
        System.out.println();

        System.out.println(recursiveLinearSearch(new int[] {4,84,4,28,34,76,9,3}, 0, 4)); //returns 0
        //array were searching in, i is starting index, value we are searching for is x

        System.out.println(recursiveLinearSearch(new int[] {4,84,4,28,34,76,9,3}, 0, 28)); //3
//        0
//        index at: 0
//        index at: 1
//        index at: 2
//        3 //invoked all the previous methods

    }

    //define method
    public static void reduceByOne(int n) {
        //this is referred as base case
        if (n != 0) { //or n >= 0, completed call would be -1 to  10
            reduceByOne(n - 1);
        }
        //append value of n
        //all calls were waiting for eachother
        System.out.println("Completed Call: " + n);
    }

    public static int recursiveLinearSearch(int [] a, int i, int x) {
        if (i > a.length - 1) { //if evaluates to true, x was not found in the array
            return -1; //couldnt find x
        } else if (a[i] == x) {
            return i; //we found our value
        } else {
            System.out.println("index at: " + i); //current position of what i is as it navigates array, prints 0 and
            //goes up
             return recursiveLinearSearch(a, i +1, x); //go through again through a, go up 1, x doesn't change
        }
    }


}
