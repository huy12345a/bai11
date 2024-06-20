package chuyenthapphansangnhiphan;

import java.util.Stack;

public class DecimalBinaxy {
    public static void main(String[] args) {
        int d = 30;
        Stack<Integer> s = new Stack<>();
        while (d != 0 && d != 1) {
            s.push(d % 2);
            d = d / 2;
        }
        s.push(d);
        int[] arr = new int[s.size()];
        for (int i = 0;!s.isEmpty() ; i++) {
            arr[i] = s.pop();
        }
        for(int a : arr){
            System.out.print(a);
        }
    }

}
