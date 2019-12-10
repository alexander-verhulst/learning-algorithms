package algo.linearsearch;

public class App {

    public static void main(String[] args) {

    }

    //static method so we don't have to create an instance of the App class. It's a class method and
    //not a instance method
    public static int linearSearch(int [] a, int x) {
        //we were looking for, we will modify the answer
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
            return i; //whenever we find our specific value we just exit the method and save time by not
                //going through the whole loop
            }
        }
        return -1;
    }

}
