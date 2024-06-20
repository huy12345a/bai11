package daonguocmangsoN;

import java.util.Arrays;
import java.util.Stack;

public class StackTL {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
     int[] array= {1,2,3,4,5};
     int[] newArray= new int[array.length];
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            newArray[i] = stack.pop();
        }
        System.out.println(Arrays.toString(newArray));
    }
}
