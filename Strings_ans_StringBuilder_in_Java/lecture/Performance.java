public class Performance {
    public static void main(String[] args) {
        String str =  "";
        for(int i=0;i<26;i++){
            char ch = (char)('a' + i);
            str+=ch;
        }
        System.out.println(str);
    }
}
