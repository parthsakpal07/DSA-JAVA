import java.util.*;

public class ArrayPract {

    public static boolean practiceOne(int num[]) {
        for(int i=0; i<num.length; i++) {
            int first = num[i];
            for(int j=1; j<num.length; j++) {
                int second = num[j];

                if(first == second) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int num[] = {1, 2, 3, 1};

        System.out.println(practiceOne(num));
    }
    
}
