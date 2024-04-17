import java.util.ArrayList;

class Sub_Sequence{
    public static void main(String[] args) {
        // subSeq("", "abc");
        // System.out.println(subSeq2(" ", "ab"));

        // subSqeAscii("", "abc");
 
        System.out.println(subSeqAsciiRet(" ", "abcdefghijklmop"));

    }

    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeq(p+ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> subSeq2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeq2(p+ch, up.substring(1));
        ArrayList<String> right = subSeq2(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subSqeAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);
        subSqeAscii(p +ch, up.substring(1));
        subSqeAscii(p, up.substring(1));
        subSqeAscii(p+(ch+0), up.substring(1));
    }

    static ArrayList<String> subSeqAsciiRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subSeqAsciiRet(p+ch, up.substring(1));
        ArrayList<String> second = subSeqAsciiRet(p, up.substring(1));
        ArrayList<String> third = subSeqAsciiRet(p+(ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}