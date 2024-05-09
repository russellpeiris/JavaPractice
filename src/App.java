import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        starPattern2();
    }

    public static void bubbleSort() {
        int[] arr = { 4, 2, 7, 1 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static boolean isPalindrome() {

        String word = "racecar";
        char[] arr = word.toCharArray();
        int n = arr.length;
        int end = n - 1;
        int start = 0;

        while (start < end) {
            if (arr[start] == arr[end]) {
                start++;
                end--;
                continue;
            } else {
                System.out.println("false: " + false);
                return false;
            }
        }

        System.out.println("true: " + true);
        return true;
    }

    public static void reverseArray() {
        char[] arr = { 'a', 'b', 'c', 'd' };
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void getLargest() {
        int[] arr = { 3, 6, 1, 9, 34 };
        int max = arr[1];

        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }

        System.out.println(max);
    }

    public static void getSecondLargest() {
        int[] arr = { 3, 6, 1, 9, 34 };
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > max) {
                secondMax = max;
                max = n;
            } else if (n > secondMax && n != max) {
                secondMax = n;
            }
        }

        System.out.println(secondMax);
    }

    public static char getOpening(char type) {
        switch (type) {
            case '}':
                return '{';
            case ']':
                return '[';
            case ')':
                return '(';
            default:
                throw new IllegalArgumentException("Invalid closing character: " + type);
        }
    }

    public static boolean isValidBrackets() {
        // The idea is to use a stack to keep track of open brackets
        // The peeked value must be a matching open bracket if a closing bracket is
        // found
        // Allow open brackets into the stack
        // If a closing bracket is found, check if the last open bracket is the same
        // type
        // If it is, pop the open bracket from the stack
        // If it is not, return false
        String input = "{}{([])}";
        char[] arr = input.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char bracket : arr) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                if (stack.peek() == getOpening(bracket)) {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static List<Integer> createUniqueList() {
        // Given an array, create a list of unique elements
        int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
        List<Integer> uniqueList = new ArrayList<>();

        for (int num : arr) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        System.out.println("uniqueList: " + uniqueList);
        return uniqueList;
    }

    public static void starPattern1() {
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println(" ");
        }
    }

    public static void starPattern2() {
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void starPattern3() {
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void starPattern4() {
        // *
        // ***
        // *****
        // *******
        // *********
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static int removeDuplicates() {

        int[] nums = { 0, 0, 1, 1, 1, 2, 3, 3, 4, 5, 5, 5, 5};
        int i = 0;

        for(int n = 1; n < nums.length; n++){
            if(nums[i] != nums[n]){
                nums[i + 1] = nums[n];
                i++;
            }
        }
        return i + 1;
    }
}