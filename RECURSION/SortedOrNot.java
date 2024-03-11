public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9, 12};
        int[] newArr = {1, 2, 4, 3, 8, 9};

        boolean res = check(arr, 0);
        boolean ans = check(newArr, 0);
        System.out.println(res);
        System.out.println(ans);
    }

    private static boolean check(int[] arr, int i) {
        if(i == arr.length-1) return true;
        if(arr[i] > arr[i+1]) return false;
        else return check(arr, i+1);
    }
}
