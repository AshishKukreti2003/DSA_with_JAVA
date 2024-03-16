public class Fibo_Recursion {
    public static void main(String[] args) {
        System.out.println(Fibo(4));
    }

    static int Fibo(int n){
        if(n<2){
            return n;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
}
