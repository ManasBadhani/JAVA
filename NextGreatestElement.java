import java.util.*;

public class NextGreatestElement {

    public static int[] nextGreatest(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25, 10, 8};
        int[] result = nextGreatest(arr);
        
        System.out.println("Element  Next Greatest");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(result[i] == -1 ? "-1" : result[i]);
        }
    }
}
