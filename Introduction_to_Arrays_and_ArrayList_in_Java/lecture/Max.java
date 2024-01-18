public class Max {
    public static void main(String[] args) {
        int[] arr = {4,6,7,90,30,40};
        System.out.println(Max(arr));
        System.out.println(MaxRange(arr,0,2));
    }

    public static int Max(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int MaxRange(int[] arr, int start, int end){
        int max = arr[0];
        for(int i=start;i<=end;i++){
            if(max <= arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
