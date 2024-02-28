public class Comparison{
    public static void main(String[] args) {
        String a = "Ashish";
        String b = "Ashish";
        System.out.println(a==b); // true


        String name1 = new String("Ashish");
        String name2 = new String("Ashish");
        System.out.println(name1 == name2); // false
        // .equals() is a method
        System.out.println(name1.equals(name2)); //true

        System.out.println(name1.charAt(3));
    }
}