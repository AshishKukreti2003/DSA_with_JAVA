public class Product_of_Digit {
    public static void main(String[] args) {
        int ans = productDigit(12340);
        System.out.println(ans);
    }


    static int productDigit(int n){
        if(n==0){
            return 1;
        }
        return n%10 * productDigit(n/10);
    }
}
