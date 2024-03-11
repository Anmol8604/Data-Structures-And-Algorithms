package ArrayList;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int Water = trap(height);

        System.out.println(Water); // 6
    }

    public static int trap(int[] height) {
        int Water = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];

        while(left < right) {

            if(leftMax < rightMax) {
                left++;
                if(leftMax < height[left]){
                    leftMax = height[left];
                }
                else {
                    Water += leftMax - height[left];
                }
            }
            else {
                right--;
                if(rightMax < height[right]){
                    rightMax = height[right];
                }
                else {
                    Water += rightMax - height[right];
                }
            }

        }

        return Water;
    }
}
