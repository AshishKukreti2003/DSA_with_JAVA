public class Scoping {
    public static void main(String[] args){
        int a = 10;
        int b = 80;
        String name = "Ashish";
        {
            // int a = 100; // already initialized outside the block in the same method, hence you cannot initialise again
            a = 100; // reassign the origin reference variable to some other value
            System.out.println(a);
            int c =190;
            System.out.println(c);
            // value initialized in this block, will remian in this block

            name = "OP";
        }
        System.out.println(a);
        // System.out.println(c); // cannot use outside the block
        System.out.println(name);
    }
}   
