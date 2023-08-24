/*
Input:
n = 6, X = 13
arr[] = [1 4 45 6 10 8]
Output:
1
Explanation:
The triplet {1, 4, 8} in
the array sums up to 13.
 */


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static  boolean ThreeSum(int[] array , int target) {
        if (array.length == 2) return false;
        Arrays.sort(array);
        for (int start = 0; start < array.length - 2; start++) {
            int second_Number = array[start + 1];
            int third_Number = array[array.length - 1];
            while (second_Number < third_Number) {
                int result = second_Number + start + third_Number;
                if (result == target) {
                    return true;
                } else if (result < third_Number) {
                    second_Number++;
                } else third_Number--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int length = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[length];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Enter the number you want search in array ");
        int target = input.nextInt();
        System.out.println("Printing the result :");
        System.out.println(ThreeSum(array , target));
    }
}