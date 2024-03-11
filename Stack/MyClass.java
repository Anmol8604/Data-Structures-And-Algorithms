
package Stack;
import org.jetbrains.annotations.NotNull;

import java.util.*;

// Amazon, Dublin, Ireland
public class MyClass {
    public static void main(String[] args) {
        System.out.println(res("??????"));
        System.out.println(res("01?10?01011"));
        System.out.println(res(""));
    }

    static int res(@NotNull String s) {
        int n = 0;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(char a : s.toCharArray()){
            if(a != '?') {
                if(stack.peek() != a){
                    n++;
                    stack.push(a);
                }
            }
        }

        return n;
    }


}
