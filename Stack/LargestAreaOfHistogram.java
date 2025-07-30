
// area of the largest rectangle in the give histogram in form of array 
// in this we will calculate area by the help of next smallest element on the right and left 
// the hight of the rectangle is found by -
// the width of the rectangle is found by index - index -1; that is smallest elemnt on right-left-1;
// for rb we will run the next greater element on the right (loop from rigth to left)
// for lb we will run the next greater element on the left (loop from left to right of the array )
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class LargestAreaOfHistogram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] rb = new int[arr.length]; // rb = next smallest element (nse) index on right

        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        rb[arr.length - 1] = arr.length; // here, if we don't find the next smallest element on the right then the last
                                         // elment is the arr.lenght(by default)
        // assume the above statement as "ki agr next chotta element agr na hota toh
        // khaai hoti "
        for (int k = arr.length - 2; k >= 0; k--) {
            while (st.size() > 0 && arr[k] <=arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                rb[k] = arr.length;
            } else {
                rb[k] = st.peek();
            }
            st.push(k);
        }
        int[] lb = new int[arr.length];
        st = new Stack<>();
        st.push(0);
        lb[0] = -1;
        for (int i = 0; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }
            st.push(i);
        }


        int maxArea = 0;
        for (int j = 0; j < arr.length; j++) {
            int width = rb[j] - lb[j] - 1;
            int area = arr[j] * width;
            if (area > maxArea) {
                maxArea = area;
            }

        }
        System.out.println(maxArea);
    }
}
