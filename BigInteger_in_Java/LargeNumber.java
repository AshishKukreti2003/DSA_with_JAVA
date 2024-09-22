import java.math.BigInteger;
public class LargeNumber{
    public static void main(String[] args) {
        BigInteger A = BigInteger.valueOf(5);
        BigInteger B = BigInteger.valueOf(99999999);
        BigInteger C = new BigInteger("4561231");
        System.out.println(C);
        System.out.println(A);
        System.out.println(B);

        // Constant
        BigInteger D = BigInteger.TEN;
        System.out.println(D);

        System.out.println(A.add(B));

        BigInteger A1 = new BigInteger("12345678998765432113456789");
        BigInteger A2 = new BigInteger("1234567899876543211345678999874563210124699");
        System.out.println(A1.multiply(A2));

    }
}