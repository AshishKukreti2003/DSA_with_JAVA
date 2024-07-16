import java.util.ArrayList;

public class PhoneNumberPad {
    public static void main(String[] args) {
        pad("", "23");
        // ArrayList<String> list = pad2("", "23");
        // System.out.println(list);
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digits = up.charAt(0)-'1';
        for(int i=(digits-1)*3;i<digits*3;i++){
            char ch = (char)('a'+i);
            pad(p+ch, up.substring(1));
        }
    }

    static ArrayList<String> pad2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digits = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for(int i=(digits-1)*3;i<digits*3;i++){
            char ch = (char)('a'+i);
            ans.addAll(pad2(p+ch, up.substring(1)));
        }
        return ans;
    }
}
