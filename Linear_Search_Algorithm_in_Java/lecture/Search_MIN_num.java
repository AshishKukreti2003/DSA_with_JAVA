public class Search_MIN_num {
    public static void main(String[] args) {
        int[] arr = {4,2,3,6,-7,1};
        System.out.println(searchMin(arr));
    }

    static int searchMin(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
