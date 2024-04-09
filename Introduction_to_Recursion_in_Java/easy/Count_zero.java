public class Count_zero {
    public static void main(String[] args) {
        System.out.println(countZero(30210));
    }

    static int countZero(int n){
        return helper(n,0);
    }

    private static int helper(int n, int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
