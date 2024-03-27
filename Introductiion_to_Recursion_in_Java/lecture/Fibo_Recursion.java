public class Fibo_Recursion {
    public static void main(String[] args) {
        // for(int i=0;i<11;i++){

        //     System.out.println(FiboFormula(i));
        // }

        System.out.println(FiboFormula(50));
    }

    static int FiboFormula(int n){
        return (int)((Math.pow((1+ Math.sqrt(5))/2, n) + Math.pow((1- Math.sqrt(5))/2, n)) / Math.sqrt(5));
    }

    static int Fibo(int n){
        if(n<2){
            return n;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
}
