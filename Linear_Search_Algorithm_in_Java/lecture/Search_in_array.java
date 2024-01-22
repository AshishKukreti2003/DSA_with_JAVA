public class Search_in_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 5;
        System.out.println(linearSearch(arr, n));
    }

    static int linearSearch(int[] arr, int n){

        for(int i=0;i<arr.length;i++){
            if(n == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
