public class Shadowing {
    static int x = 90; // this will be shadowed at line 5
    public static void main(String[] args){
        System.out.println(x);
        int x; // the variable at line 4 is shadowed by this
        // System.out.println(x); // scope will begin when value is initialized
        x = 40;
        System.out.println(x);

        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
