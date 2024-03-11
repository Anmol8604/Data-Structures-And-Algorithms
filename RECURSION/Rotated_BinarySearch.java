public class Rotated_BinarySearch {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9,3,4};
        int[] arr = {6,7,8,9,10,1,2,3,4,5};

        System.out.println(index(arr, 3, 0, arr.length-1));
        System.out.println(index(arr, 4, 0, arr.length-1));
        System.out.println(index(arr, 5, 0, arr.length-1));
        System.out.println(index(arr, 6, 0, arr.length-1));
        System.out.println(index(arr, 7, 0, arr.length-1));
        System.out.println(index(arr, 8, 0, arr.length-1));
        System.out.println(index(arr, 9, 0, arr.length-1));
        System.out.println(index(arr, 10, 0, arr.length-1));
        System.out.println(index(arr, 1, 0, arr.length-1));
        System.out.println(index(arr, 2, 0, arr.length-1));
    }

    public static int index(int[] arr, int target, int start, int end){
        if(start > end) return -1;
        int mid = (start+end)/2;
        if(arr[mid] == target) return mid+1;
        if(arr[mid] >= arr[start] && target >= arr[start] && target <= arr[mid]) {
            return index(arr, target, start, mid-1);
        }
        else{
            return index(arr, target, mid+1, end);
        }
    }

}
