import java.util.Arrays;

public class Searching_in_String {
    public static void main(String[] args) {
        String str = "Ashish Kukreti";
        char ch = 'U';
        char ch1 = 's';
        // System.out.println(str.length());
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(SearchString(str, ch));
        System.out.println(SearchString(str, ch1));
    } 
    
    static boolean SearchString(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}