import java.util.*;

public class Prefix {

    public static void prefixSum(int num[]) {
        int maxValue = Integer.MIN_VALUE;
        int curr = 0;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0; i<num.length; i++) {
            int start = i;
            for(int j=i; j<num.length; j++) {
                int end = j;

                curr = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxValue < curr) {
                    maxValue = curr;
                }
            }
        }

        System.out.println("Max sum is: " + maxValue);
    }

    public static void main(String args[]) {
        int num[] = {1,-2,6,-1,3}; 
        
        prefixSum(num);
    }
    
}
