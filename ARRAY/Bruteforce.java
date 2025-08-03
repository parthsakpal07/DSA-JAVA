import java.util.*;

public class Bruteforce {

    public static void bruteForce(int num[]) {
        int maxValue = Integer.MIN_VALUE;
        int curr = 0;

        for(int i=0; i<num.length; i++) {
            int start = i;
            for(int j=i; j<num.length; j++) {
                int end = j;
                curr = 0;
                for(int k=start; k<=end; k++) {
                    curr += num[k];
                }
                System.out.println(curr + "");

                if(maxValue < curr) {
                    maxValue = curr;
                }
            }
        }

        System.out.println("Max sum is: " + maxValue);
    }

    public static void main(String args[]) {
        int num[] = {1,-2,6,-1,3};

        bruteForce(num);
    }
}
