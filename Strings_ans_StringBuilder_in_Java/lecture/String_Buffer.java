import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class String_Buffer{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("Ashish");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);

        sb.append(" OP");
        sb.replace(1, 3, "op");
        System.out.println(sb);

        sb.delete(1,3);
        System.out.println(sb);
        
        sb.insert(1,"sh");
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer("Ashish Kukreti");
        sb2.append(" op");
        System.out.println(sb2);
        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer(50);
        System.out.println(sb3.capacity());

        System.out.println(randomGenterate(27));

        // remove whitespaces
        String sentence = " hi  hi ii h ih ih ih i ";
        System.out.println(sentence.replaceAll("\\s", ""));

        // split
        String arr = "Ashish, Akhil, Avinash, Ujjwal";
        String[] names = arr.split(",");
        System.out.println(Arrays.toString(names));

        // rounding off
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(5.12));
    }

    static String randomGenterate(int size){
        StringBuffer sb = new StringBuffer(size);
        Random random = new Random();

        for(int i=0;i<size;i++){
            int randomChar = 97 + (int)(random.nextFloat() * 26);
            sb.append((char)(randomChar));
        }
        return sb.toString();

    }
}