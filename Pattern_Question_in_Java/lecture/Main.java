public class Main {
    public static void main(String[] args) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
    }


/*  1.
    *****
    *****
    *****
    *****
    *****
*/
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
/*  2.
    *
    **
    ***
    ****
    *****
*/
    static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
/*  3.
    *****
    ****
    ***
    **
    *
*/
    static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
/*  4.
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
    }
/*  5.
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
*/
    static void pattern5(int n){
        for(int i=1;i<2*n;i++){
            int totalColInRow = i > n ? 2*n-i : i;
            for(int j=1;j<=totalColInRow;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
/*  6.
         *
        **
       ***
      ****
     *****
*/
}
