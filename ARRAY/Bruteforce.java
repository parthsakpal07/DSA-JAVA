import java.util.*;

public class Bruteforce {

    public static void bruteForce(int num[]) {
        int mx = Integer.MIN_VALUE;
        int curr = 0;

        for(int i=0; i<num.length; i++) {
            int start = i;
            for(int j=i; j<num.length; j++) {
                int end = j;
                for(int k=start; k<end; k++) {
                    curr += num[k];

                    if(mx < curr) {
                        mx = curr;
                    }
                }
            }

        }
        System.out.println("max no. is: " + mx);

    }

    public static void main(String args[]) {
        int num[] = {1,-2,6,-1,3};

        bruteForce(num);
    }
}
