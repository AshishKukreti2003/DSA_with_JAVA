public class Remove_char_Char {
    public static void main(String[] args) {
        remove_char("ababababab", "");
        String s = "ababadd";
        System.out.println(skip_char(s));

        String str = "appleop";
        System.out.println(skipApple(str));

        String str1 = "appleappop";
        System.out.println(skipAppNotApple(str1));
    }
 
    static void remove_char(String ch, String new_ch){
        if(ch.isEmpty()){
            System.out.println(new_ch);
            return;
        }
        char c = ch.charAt(0);
        if(c == 'a'){
            remove_char(ch.substring(1), new_ch);
        }
        else{
            remove_char(ch.substring(1), new_ch + c);
        }
    }

    static String skip_char(String ch){
        if(ch.isEmpty()){
            return "";
        }

        char c = ch.charAt(0);
        if(c == 'a'){
            return skip_char(ch.substring(1));
        }
        else{
            return c+skip_char(ch.substring(1));
        }
    }

    static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipApple(s.substring(5));
        }else{
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }
    
    static String skipAppNotApple(String s){
        if(s.isEmpty()){
                return "";
        }
        if (s.startsWith("app") && !s.startsWith("apple")) {
          return skipAppNotApple(s.substring(3));
        }
        else{
            return s.charAt(0) + skipAppNotApple(s.substring(1));
        }
    }
}   
