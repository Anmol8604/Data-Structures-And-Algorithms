package String;

// Question : Print frequencies of character (in a sorted Order) in a String of lower case Characters.
public class Frequancy {
    public static void main(String[] args) {
        String ans = "hellodatastructersandalgorithms";
        int arr[] = new int[26];
        for(int i = 0; i < ans.length(); i++) {
            arr[ans.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++) {
            if(arr[i] > 0) {
                System.out.println((char)(i + 'a' )+ " : " + arr[i]);
            }
        }
    }
}
