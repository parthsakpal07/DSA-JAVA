import java.util.*;

public class Array {

    public static int binarySearch(int num[], int key) {
        int start = 0;
        int end = num.length-1;

        while(start <= end) {
            int mid = (start + end)/2;

            if(num[mid] == key) {
                return mid;
            }
            else if(num[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverseArr(int num[]) {
        int start = 0;
        int end = num.length-1;

        while(start < end) {
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            start++;
            end--;
        } 
    }

    public static int largestArr(int num[]) {
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++) {

            if(largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }


    public static void main(String args[]) {
        int num[] = {1,2,6,3,4};

        System.out.println("largest number is: " + largestArr(num));
    }

    
}