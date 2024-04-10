import java.util.ArrayList;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {3,2,6,7,4};
        System.out.println(searching(arr, 7, 0));

        int[] arr1 = {3,4,5,6,6,4};
        // findAllIndex(arr1, 4, 0);
        // System.out.println(list);
        System.out.println(findAll(arr1, 6, 0, new ArrayList<>()));

        int[] arr2 = {5,5,7,8,9,9};
        System.out.println(findAllIndex2(arr2, 9, 0));
    }

    static int searching(int[] arr, int target, int s){
        if(s == arr.length){
            return -1;
        }
        if(arr[s] == target){
            return s;
        }
        return searching(arr, target, s+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int s){
        if(s == arr.length){
            return ;
        }
        if(arr[s] == target){
            list.add(s);
        }
        findAllIndex(arr, target, s+1);
    }

    static ArrayList<Integer> findAll(int[] arr, int target, int s, ArrayList<Integer> list1){
        if(s == arr.length){
            return list1;
        }
        if(arr[s] == target){
            list1.add(s);
        }
        return findAll(arr, target, s+1, list1);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int s){
        ArrayList<Integer> list = new ArrayList<>();
        if(s == arr.length){
            return list;
        }
        if(arr[s] == target){
            list.add(s);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, s+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}


