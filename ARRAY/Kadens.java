public class Kadens {

    public static void kadens(int num[]) {
        int mx = Integer.MIN_VALUE;
        int cs = 0;
        
        for(int i=0; i<num.length; i++) {
            cs += num[i];

            if(cs < 0) {
                cs = 0;
            }
            mx = Math.max(cs, mx);
        }

        System.out.println("Max value is: " + mx);
    }
    
    public static void main(String args[]) {
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        kadens(num);

    }
}
