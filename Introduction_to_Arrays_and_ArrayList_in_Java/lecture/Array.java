public class Array{
    public static void main(String[] args){
        
        int[] arr; // declaration of array. arr is getting stored in stack
        arr = new int [5]; // initialisation: actually here object is being created in the memory (heap)

        int[] arrno = {2,4,5,68,4};
        System.out.println(arrno[3]);

        String[] name = new String[5];

        String[] name1 = {"Ashish", "OP"};
        System.out.println(name1[0]);
    
    }
}